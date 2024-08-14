package com.revature.models;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "hotels")
public class Hotel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long hotelId;

    @Column(nullable = false)
    private String hotelName;

    @Column(nullable = false)
    private String address;

    @JoinColumn(name = "userId")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Hotel hotel;

    // Constructors
    public Hotel() {
    }

    public Hotel(Long hotelId, String hotelName, String address) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.address = address;
    }

    // Getters and Setters


    public Long getHotelId() {
        return hotelId;
    }

    public void setHotelId(Long hotelId) {
        this.hotelId = hotelId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    // toString

    @Override
    public String toString() {
        return "Hotel{" +
                "hotelId=" + hotelId +
                ", hotelName='" + hotelName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
