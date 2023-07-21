package com.booking.service;

import java.util.List;

import com.booking.payload.UserDTO;

public interface UserService {
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUserById(Long userId);
    List<UserDTO> getAllUsers();
    String encodePassword(String password);
    // Other methods related to user operations
}

