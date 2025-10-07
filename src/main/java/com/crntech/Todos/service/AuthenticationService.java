package com.crntech.Todos.service;

import com.crntech.Todos.Request.AuthenticationRequest;
import com.crntech.Todos.Request.RegisterRequest;
import com.crntech.Todos.response.AuthenticationResponse;

public interface AuthenticationService {
    void register(RegisterRequest input) throws Exception;
    AuthenticationResponse login(AuthenticationRequest request);
}
