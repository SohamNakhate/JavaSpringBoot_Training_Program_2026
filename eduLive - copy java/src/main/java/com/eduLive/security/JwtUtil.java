package com.eduLive.security;

import java.security.Key;
import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

	@Value("${jwt.secret}")
	private String SECRET; 
	
	@Value("${jwt.expiration}")
	private long expiration; 
	
	private Key getSignKey() {
		return Keys.hmacShaKeyFor(SECRET.getBytes()); 
	}
	
	public String generateToken(String email) {
		return Jwts.builder()
				.setSubject(email)
				.setIssuedAt(new Date())
				.setExpiration(new Date(System.currentTimeMillis()+expiration))
				.signWith(getSignKey(), SignatureAlgorithm.HS256)
				.compact(); 
	}
	
	 // Extract all claims
    public Claims extractAllClaims(String token) {

        return Jwts.parserBuilder()
                .setSigningKey(getSignKey())
                .build()
                .parseClaimsJws(token)
                .getBody();
    }

    // Extract email(username)
    public String extractUsername(String token) {

        return extractAllClaims(token)
                .getSubject();
    }

    // Extract expiration date
    public Date extractExpiration(String token) {

        return extractAllClaims(token)
                .getExpiration();
    }

    // Check if token expired
    public boolean isTokenExpired(String token) {

        return extractExpiration(token)
                .before(new Date());
    }

    // Validate token
    public boolean validateToken(
            String token,
            String email) {

        final String username =
                extractUsername(token);

        return username.equals(email)
                && !isTokenExpired(token);
    }
}

