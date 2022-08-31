package com.example.hotelbooking2.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name="users")
public class User {

    ////////////////////////////// Define Fields //////////////////////////////
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @OneToMany(mappedBy = "managerId",cascade = CascadeType.ALL)
    private List<Hotel> hotels;



    ////////////////////////////// Define Constructors //////////////////////////////

    ////////// No-arg //////////
    public User(){}

    ////////// With arg //////////

    public User(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public User(String password){
        this.password = password;
    }

    ////////////////////////////// Setter and Getter //////////////////////////////


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Hotel> getHotels() {
        return hotels;
    }

    public void setHotels(List<Hotel> hotels) {
        this.hotels = hotels;
    }

    public void add(Hotel tempHotel){
        if(hotels ==null){
            hotels = new ArrayList<>();
        }
        hotels.add(tempHotel);
        tempHotel.setManagerId(this);
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(!(o instanceof User)) return false;
        User theUser = (User) o;
        String forPassCheck = theUser.getPassword();
        System.out.println(forPassCheck);
        String forPassCheck2 = Base64.getEncoder().encodeToString(forPassCheck.getBytes());
        if(Objects.equals(email, theUser.getEmail()) && Objects.equals(password, forPassCheck2)){
            return true;
        } else {
            return false;
        }
    }

    ////////////////////////////// Define toString() //////////////////////////////

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
