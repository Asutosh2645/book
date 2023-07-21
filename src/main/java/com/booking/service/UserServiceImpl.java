package com.booking.service;

import com.booking.entity.User;
import com.booking.payload.UserDTO;
import com.booking.repository.UserRepository;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final ModelMapper modelMapper;

    @Autowired
    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder, ModelMapper modelMapper) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.modelMapper = modelMapper;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        String encryptedPassword = encodePassword(userDTO.getPassword());
        userDTO.setPassword(encryptedPassword);

        User user = modelMapper.map(userDTO, User.class);
        User savedUser = userRepository.save(user);

        return modelMapper.map(savedUser, UserDTO.class);
    }

    @Override
    public UserDTO getUserById(Long userId) {
        User user = userRepository.findById(userId).get()
                ;

        return modelMapper.map(user, UserDTO.class);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = userRepository.findAll();
        return users.stream()
                .map(user -> modelMapper.map(user, UserDTO.class))
                .collect(Collectors.toList());
    }

    @Override
    public String encodePassword(String password) {
        return passwordEncoder.encode(password);
    }

    // Implement other methods related to user operations
}
