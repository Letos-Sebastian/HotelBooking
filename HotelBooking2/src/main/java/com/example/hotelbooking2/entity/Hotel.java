package com.example.hotelbooking2.entity;

import javax.persistence.*;

@Entity
@Table(name="hotels")
public class Hotel {

    ////////////////////////////// Define Fields //////////////////////////////
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int hotelId;
    @Column(name="hotelName",unique = true)
    private String hotelName;

    @ManyToOne(cascade = {CascadeType.ALL})
    @JoinColumn(name="id",referencedColumnName = "id")
    private User managerId;



    ////////////////////////////// Define Constructors //////////////////////////////

    ////////// No-arg //////////
    public Hotel(){}

    ////////// With arg //////////
    public Hotel(String hotelName) {
        this.hotelName = hotelName;
    }

    ////////////////////////////// Setter and Getter //////////////////////////////

    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public User getManagerId() {
        return managerId;
    }

    public void setManagerId(User managerId) {
        this.managerId = managerId;
    }
////////////////////////////// Define toString() //////////////////////////////

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", user=" + managerId +
                '}';
    }
}
