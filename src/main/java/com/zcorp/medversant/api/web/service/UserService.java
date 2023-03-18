package com.zcorp.medversant.api.web.service;

import java.util.List;
import java.util.Optional;

import com.zcorp.medversant.api.model.User;

public interface UserService {
    public User createUser(User user);
    public User updateUser(User user, int id);
    public Optional<User> findUserById(int id);
    public User findByUsername(String username);
    public List<User> getAll();
    public User findUserByEmail(String email);
}
