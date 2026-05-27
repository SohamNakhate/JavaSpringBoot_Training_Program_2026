package com.eduLive.service;

import com.eduLive.dto.LoginDTO;
import com.eduLive.dto.RegisterDTO;

public interface AuthService {

    String register(RegisterDTO dto);

    String login(LoginDTO dto);
}