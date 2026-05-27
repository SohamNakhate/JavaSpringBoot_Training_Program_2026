package com.example.rcoem.LIBManagement.security;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.rcoem.LIBManagement.domain.User;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Service
public class JWTSecurityTokenGeneratorImpl implements SecurityTokenGenerator {

    @SuppressWarnings("deprecation")
	public Map<String, String> generateToken(User user) {
// multiple claims for a token - 3 types - registered, public, and private
        String jwtToken = Jwts.builder().setIssuer("ShopZone")
                .setSubject(user.getEmail())
                .setIssuedAt(new Date())
                .signWith(SignatureAlgorithm.HS256,"mysecret")
                //mysecret is the key that has to be shared everytime you do encrypt and decrypt process
                .compact();
        Map<String,String> map = new HashMap<>();
        map.put("token",jwtToken);
        map.put("message","Authentication Successful");
        return map;
    }
}
