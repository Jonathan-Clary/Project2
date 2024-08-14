package com.revature.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Table(name = "saved")
public class Saved {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int saved_id;

    @Column(nullable = false)
    private String date_added;

    @JoinColumn(name = "userId")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL) // TODO: this could be one to one will decide later
    private User user;

    @JoinColumn(name = "userId")
    @ManyToOne( fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Hotel hotel;

    public Saved() {
    }

    public Saved(int saved_id, String date_added, User user, Hotel hotel) {
        this.saved_id = saved_id;
        this.date_added = date_added;
        this.user = user;
        this.hotel = hotel;
    }

    public int getSaved_id() {
        return saved_id;
    }

    public void setSaved_id(int saved_id) {
        this.saved_id = saved_id;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    @Override
    public String toString() {
        return "Saved{" +
                "saved_id=" + saved_id +
                ", date_added='" + date_added + '\'' +
                ", user=" + user +
                ", hotel=" + hotel +
                '}';
    }
}
