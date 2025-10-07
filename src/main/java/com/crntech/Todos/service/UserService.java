package com.crntech.Todos.service;

import com.crntech.Todos.response.UserResponse;

public interface UserService {
    UserResponse getUserInfo();
    void deleteUser();
}
