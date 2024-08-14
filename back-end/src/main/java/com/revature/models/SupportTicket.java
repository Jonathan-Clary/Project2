package com.revature.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "support_tickets")
public class SupportTicket {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer supportTicketId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "userId")
    private User user;

    // Ticket Status enum for strong type-checking mechanism
    public enum Status{
        PENDING,
        RESOLVED,
    }
    // Ensures that the enum values are stored as strings
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Column(nullable = false)
    private String description;

    // Ticket Type enum for strong type-checking mechanism
    public enum Type {
        GENERAL,// For any cases that don't fit the below categories
        TECHNICAL_ISSUES, // Any Technical issue
        INFORMATION, // Request information (ex: Hotels)
        FEEDBACK, // For feedback and suggestions
        PRIVACY, // For privacy and security concerns
        // We can add more whenever needed
    }
    // Ensures that the enum values are stored as strings
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Type type;


    private Date createdAt;

    private Date resolvedAt;


    // This method is executed before persisting the ticket into the database
    @PrePersist
    private void onCreate(){
        // Sets the timestamps for when the ticket is created
        createdAt = new Date();

        // Sets PENDING as the default status
        // when the ticket is created for the first time
        if(status == null){
            status = Status.PENDING;
        }

        // Sets GENERAL as the default type if none is specified
        if(type == null){
            type = Type.GENERAL;
        }

    }

    public SupportTicket() {}

    public SupportTicket(User user, String description, Type type) {
        this.user = user;
        this.description = description;
        this.type = type;
    }

    @Override
    public String toString() {
        return "SupportTicket{" +
                "supportTicketId=" + supportTicketId +
                ", user=" + user +
                ", status=" + status +
                ", description='" + description + '\'' +
                ", type=" + type +
                ", createdAt=" + createdAt +
                ", resolvedAt=" + resolvedAt +
                '}';
    }

    public Integer getSupportTicketId() {
        return supportTicketId;
    }

    public void setSupportTicketId(Integer supportTicketId) {
        this.supportTicketId = supportTicketId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getResolvedAt() {
        return resolvedAt;
    }

    public void setResolvedAt(Date resolvedAt) {
        this.resolvedAt = resolvedAt;
    }
}
