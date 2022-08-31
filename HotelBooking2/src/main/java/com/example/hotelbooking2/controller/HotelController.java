package com.example.hotelbooking2.controller;


import com.example.hotelbooking2.entity.Hotel;
import com.example.hotelbooking2.entity.User;
import com.example.hotelbooking2.service.HotelServiceImpl;
import com.example.hotelbooking2.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HotelController {

    // Constructor injection
    private HotelServiceImpl hotelService;
    @Autowired
    public HotelController(HotelServiceImpl theHotelService){
        hotelService = theHotelService;
    }

    //GET "/hotels" - get all hotels
    @GetMapping("/hotels")
    public List<Hotel> findAll(){
        return hotelService.findAll();
    }

    //POST "/hotel/add" - add a new hotel
    @PostMapping("/hotel/add")
    public Hotel addHotel(@RequestBody Hotel theHotel){
        theHotel.setHotelId(0);
        hotelService.save(theHotel);
        return theHotel;
    }
}
