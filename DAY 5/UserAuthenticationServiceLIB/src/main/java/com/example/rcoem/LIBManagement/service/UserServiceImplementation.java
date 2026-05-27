package com.example.rcoem.LIBManagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rcoem.LIBManagement.domain.User;
import com.example.rcoem.LIBManagement.exception.*;
import com.example.rcoem.LIBManagement.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

private UserRepository userRepository;

    @Autowired
    public UserServiceImplementation(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User saveUser(User user) throws UserAlreadyExistsException {
        if(userRepository.findById(user.getEmail()).isPresent())
        {
            throw new UserAlreadyExistsException();
        }
        System.out.println(user);
        return userRepository.save(user);
    }

    public User findByEmailAndPassword(String email, String password) throws InvalidCredentialsException {
        System.out.println("email"+email);
        System.out.println("password"+password);
        User loggedInUser = userRepository.findByEmailAndPassword(email,password);
        System.out.println(loggedInUser);
        if(loggedInUser == null)
        {
            throw new InvalidCredentialsException();
        }

        return loggedInUser;
    }
}
