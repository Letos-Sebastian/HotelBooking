package com.example.hotelbooking2.repository;

import com.example.hotelbooking2.entity.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface HotelRepository extends JpaRepository<Hotel,String> {

    Hotel findByHotelName(String hotelName);

    @Query("select u.id from User u where u.email= ?1 and u.password = ?2")
    int getIdFromUsersTable(String username, String password);
}
