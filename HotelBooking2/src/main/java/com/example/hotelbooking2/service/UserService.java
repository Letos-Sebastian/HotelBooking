package com.example.hotelbooking2.service;

import com.example.hotelbooking2.entity.User;

import java.util.List;

public interface UserService {

    public List<User> findAll();
    public User findByEmail(String email);
    public void save(User theUser);

    public void delete(User theUser);
}
