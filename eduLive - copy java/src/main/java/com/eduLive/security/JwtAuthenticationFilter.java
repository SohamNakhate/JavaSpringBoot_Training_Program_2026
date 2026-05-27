package com.eduLive.security;

import java.io.IOException;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;

import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

@Component
public class JwtAuthenticationFilter
extends OncePerRequestFilter {

    @Autowired
    JwtUtil jwtUtil;

    @Autowired
    CustomUserDetailsService userService;

    @Override
    protected void doFilterInternal(
            HttpServletRequest request,
            HttpServletResponse response,
            FilterChain chain)

            throws ServletException,
            IOException {

        String header=
                request.getHeader("Authorization");

        String token=null;
        String username=null;

        if(header!=null &&
                header.startsWith("Bearer ")){

            token=header.substring(7);

            username=
                    jwtUtil.extractUsername(token);
        }

        if(username!=null &&
                SecurityContextHolder
                        .getContext()
                        .getAuthentication()==null){

            UserDetails details=
                    userService.loadUserByUsername(
                            username);

            if(jwtUtil.validateToken(
                    token,
                    details.getUsername())){

                UsernamePasswordAuthenticationToken auth=
                        new UsernamePasswordAuthenticationToken(
                                details,
                                null,
                                details.getAuthorities()
                        );

                auth.setDetails(
                        new WebAuthenticationDetailsSource()
                                .buildDetails(request)
                );

                SecurityContextHolder
                        .getContext()
                        .setAuthentication(auth);
            }
        }

        chain.doFilter(request,response);
    }
}