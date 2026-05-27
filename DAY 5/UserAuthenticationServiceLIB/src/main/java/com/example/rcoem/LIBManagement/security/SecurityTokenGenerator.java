package com.example.rcoem.LIBManagement.security;

import java.util.Map;

import com.example.rcoem.LIBManagement.domain.User;

public interface SecurityTokenGenerator {
    Map<String,String> generateToken(User user);//token and message -> the return type can be String also
}
