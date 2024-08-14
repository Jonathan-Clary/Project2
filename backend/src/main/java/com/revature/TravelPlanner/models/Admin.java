package com.revature.TravelPlanner.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import org.springframework.stereotype.Component;

import java.util.List;
@Entity
@Table(name = "admins")
@Component
public class Admin {

    //Model Variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int admin_id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    //Relational Variable(s)
    @JsonIgnore
    @OneToMany(mappedBy = "admin", fetch = FetchType.EAGER, cascade = CascadeType.REFRESH)
    private List<Notes> notes;

    //Constructors
    public Admin() {
    }

    public Admin(int admin_id, String firstName, String lastName, String email, String password) {
        this.admin_id = admin_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    //Getter and Setters
    public int getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(int admin_id) {
        this.admin_id = admin_id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public List<Notes> getNotes() {
        return notes;
    }

    public void setNotes(List<Notes> notes) {
        this.notes = notes;
    }

    //toString
    @Override
    public String toString() {
        return "Admin{" +
                "admin_id=" + admin_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
