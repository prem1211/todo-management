package com.example.practice.todo.service;

import com.example.practice.todo.dto.LoginDto;
import com.example.practice.todo.dto.RegisterDto;

public interface AuthService {
    String register(RegisterDto registerDto);

    String login(LoginDto loginDto);
}
