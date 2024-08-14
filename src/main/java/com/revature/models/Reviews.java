package com.revature.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int review_id;

    @Column(nullable = false)
    private String date_added;

    @Column(nullable = false)
    private int stars;

    @Column(nullable = false)
    private String review_text;

    @JoinColumn(name = "userId")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private User user;

    @JoinColumn(name = "userId")
    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private Hotel hotel;

    public Reviews() {
    }

    public Reviews(int review_id, String date_added, int stars, String review_text, User user, Hotel hotel) {
        this.review_id = review_id;
        this.date_added = date_added;
        this.stars = stars;
        this.review_text = review_text;
        this.user = user;
        this.hotel = hotel;
    }

    public int getReview_id() {
        return review_id;
    }

    public void setReview_id(int review_id) {
        this.review_id = review_id;
    }

    public String getDate_added() {
        return date_added;
    }

    public void setDate_added(String date_added) {
        this.date_added = date_added;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public String getReview_text() {
        return review_text;
    }

    public void setReview_text(String review_text) {
        this.review_text = review_text;
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
        return "Reviews{" +
                "review_id=" + review_id +
                ", date_added='" + date_added + '\'' +
                ", stars=" + stars +
                ", review_text='" + review_text + '\'' +
                ", user=" + user +
                ", hotel=" + hotel +
                '}';
    }
}
