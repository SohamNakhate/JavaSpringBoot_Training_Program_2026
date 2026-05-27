package com.example.rcoem.LIBManagement.service;

import com.example.rcoem.LIBManagement.domain.User;
import com.example.rcoem.LIBManagement.exception.InvalidCredentialsException;
import com.example.rcoem.LIBManagement.exception.UserAlreadyExistsException;

public interface UserService {

    User saveUser(User user) throws UserAlreadyExistsException;
    //user name and pwd is in db ot not, if not save
    User findByEmailAndPassword(String email,String password) throws InvalidCredentialsException;

}
