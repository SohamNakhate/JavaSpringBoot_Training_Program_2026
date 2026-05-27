package com.eduLive.serviceImpl;


import org.springframework.security.authentication.*;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.eduLive.dto.*;
import com.eduLive.entity.User;
import com.eduLive.enums.Role;
import com.eduLive.repository.UserRepository;
import com.eduLive.security.JwtUtil;
import com.eduLive.service.AuthService;

@Service
public class AuthServiceImpl
implements AuthService{

    private final UserRepository repository;
    private final PasswordEncoder encoder;
    private final AuthenticationManager manager;
    private final JwtUtil jwtUtil;

    public AuthServiceImpl(
            UserRepository repository,
            PasswordEncoder encoder,
            AuthenticationManager manager,
            JwtUtil jwtUtil){

        this.repository=repository;
        this.encoder=encoder;
        this.manager=manager;
        this.jwtUtil=jwtUtil;
    }

    @Override
    public String register(RegisterDTO dto){

        User user=User.builder()
                .fullName(dto.getFullName())
                .email(dto.getEmail())
                .password(
                        encoder.encode(
                                dto.getPassword()
                        )
                )
                .role(Role.STUDENT)
                .build();

        repository.save(user);

        return "Registration successful";
    }

    @Override
    public String login(LoginDTO dto){

        manager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        dto.getEmail(),
                        dto.getPassword()
                )
        );

        return jwtUtil.generateToken(
                dto.getEmail()
        );
    }
}