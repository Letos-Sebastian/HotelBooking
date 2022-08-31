package com.example.hotelbooking2.repository;


import com.example.hotelbooking2.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {

    User findByEmail(String email);
}
