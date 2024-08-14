package com.revature.models;



import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "stays")
public class Stays {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int stayId;

    @Column(nullable = false)
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private User user;

    //Used for inserts, is not included when responding in json, because json already included entire user obj
    //transient stops from being stored in db, bc User obj already does that
    @Transient
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)//Include when deserializing, not serializing
    private int userId;

    //TODO:Set up relationship here
    //@Column(nullable = false)
    //@ManyToOne(fetch = FetchType.EAGER)
    //@JoinColumn(name = "hotelId")
    //private Hotel hotel;

    //Used for inserts, is not included when responding in json, because json already included entire user obj
    //transient stops from being stored in db, bc User obj already does that
//   @Transient
//   @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)//Include when deserializing, not serializing
//   private int hotelId;


    @Column(nullable = false)
    private String bookedDate;

    @Column(nullable = false)
    private String endDate;

    public Stays() {}

    //TODO:Set up add hotel to constructor
    public Stays(String endDate, String bookedDate, User user, int stayId) {
        this.endDate = endDate;
        this.bookedDate = bookedDate;
        this.user = user;
        this.stayId = stayId;
    }


    //TODO:Set up hotel getter and setter
    //TODO:Set up toString and equals/hash


    public int getStayId() {
        return stayId;
    }

    public void setStayId(int stayId) {
        this.stayId = stayId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getBookedDate() {
        return bookedDate;
    }

    public void setBookedDate(String bookedDate) {
        this.bookedDate = bookedDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }


}
