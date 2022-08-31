package com.example.hotelbooking2.entity;


import javax.persistence.*;

@Entity
@Table(name="Reservation")
public class Reservation {

    ////////////////////////////// Define Fields //////////////////////////////

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int reservation_id;

    @OneToOne(cascade=CascadeType.ALL)
    @JoinColumn(name="userId")
    private User user;

    @Column(name="hotelName", nullable = false)
    private String hotelName;

    @Column(name="typeOfRoom", nullable = false)
    private String typeOfRoom;

    @Column(name="typeOfView", nullable = false)
    private String typeOfView;

    @Column(name="haveMeal", nullable = false)
    private boolean haveMeal;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="reservationPrice")
    private Rooms room;

    ////////////////////////////// Define Constructors //////////////////////////////

    ////////// No-arg //////////
    public Reservation(){}

    ////////// With arg //////////

    public Reservation(User user, String hotelName, String typeOfRoom, String typeOfView, boolean haveMeal, Rooms room) {
        this.user = user;
        this.hotelName = hotelName;
        this.typeOfRoom = typeOfRoom;
        this.typeOfView = typeOfView;
        this.haveMeal = haveMeal;
        this.room = room;
    }

    ////////////////////////////// Setter and Getter //////////////////////////////

    public int getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public String getTypeOfView() {
        return typeOfView;
    }

    public void setTypeOfView(String typeOfView) {
        this.typeOfView = typeOfView;
    }

    public boolean isHaveMeal() {
        return haveMeal;
    }

    public void setHaveMeal(boolean haveMeal) {
        this.haveMeal = haveMeal;
    }

    public Rooms getRoom() {
        return room;
    }

    public void setRoom(Rooms room) {
        this.room = room;
    }

    ////////////////////////////// Define toString() //////////////////////////////

    @Override
    public String toString() {
        return "Reservation{" +
                "reservation_id=" + reservation_id +
                ", user=" + user +
                ", hotelName='" + hotelName + '\'' +
                ", typeOfRoom='" + typeOfRoom + '\'' +
                ", typeOfView='" + typeOfView + '\'' +
                ", haveMeal=" + haveMeal +
                ", room=" + room +
                '}';
    }
}
