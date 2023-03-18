package com.zcorp.medversant.api.web.service;


import java.lang.StackWalker.Option;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.support.NotFoundException;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.zcorp.medversant.api.model.User;
import com.zcorp.medversant.api.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    //create user 
    @Override
    public User createUser (User user) {
        return userRepository.save(user);
    }

    //update user   
    public User updateUser(User user, int id) {
        User upUser = userRepository.findById(id).get();
        upUser.setPassword(user.getPassword());
        
        return userRepository.save(upUser);
    }   
    
    //find all 
    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    //find user by id
    @Override
    public Optional<User> findUserById(int id) {
        return userRepository.findById(id);
    }    

    //find user by email 
    @Override
    public User findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    //find user by username 
    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }


}
