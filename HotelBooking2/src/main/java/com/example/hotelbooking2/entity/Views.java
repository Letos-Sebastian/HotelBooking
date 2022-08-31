package com.example.hotelbooking2.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="views")
public class Views {

    ////////////////////////////// Define Fields //////////////////////////////
    @Id
    private int viewId;
    @Column(name="typeOfView")
    private String typeOfView;
    @Column(name="viewPrice")
    private double viewPrice;

    ////////////////////////////// Define Constructors //////////////////////////////

    ////////// No-arg //////////
    public Views(){}

    ////////// With arg //////////
    public Views(String typeOfView, double viewPrice) {
        this.typeOfView = typeOfView;
        this.viewPrice = viewPrice;
    }

    ////////////////////////////// Setter and Getter //////////////////////////////
    public int getView_id() {
        return viewId;
    }

    public void setView_id(int view_id) {
        this.viewId = view_id;
    }

    public String getTypeOfView() {
        return typeOfView;
    }

    public void setTypeOfView(String typeOfView) {
        this.typeOfView = typeOfView;
    }

    public double getViewPrice() {
        return viewPrice;
    }

    public void setViewPrice(double viewPrice) {
        this.viewPrice = viewPrice;
    }

    ////////////////////////////// Define toString() //////////////////////////////
    @Override
    public String toString() {
        return "Views{" +
                "view_id=" + viewId +
                ", typeOfView='" + typeOfView + '\'' +
                ", viewPrice=" + viewPrice +
                '}';
    }
}
