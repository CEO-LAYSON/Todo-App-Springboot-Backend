package com.crntech.Todos.service;

import com.crntech.Todos.Request.RegisterRequest;

public interface AuthenticationService {
    void register(RegisterRequest input) throws Exception;
}
