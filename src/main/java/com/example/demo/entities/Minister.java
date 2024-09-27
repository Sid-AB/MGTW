package com.example.demo.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Minister {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String address;
    private LocalDate startFrom;
    private LocalDate until;

    @ManyToOne
    @JoinColumn(name = "photo_id", referencedColumnName = "id")
    private Multimedia photo;

    // Constructors
    public Minister() {}

    public Minister(String firstName, String lastName, LocalDate birthday, String address, LocalDate startFrom, LocalDate until, Multimedia photo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.startFrom = startFrom;
        this.until = until;
        this.photo = photo;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getStartFrom() {
        return startFrom;
    }

    public void setStartFrom(LocalDate startFrom) {
        this.startFrom = startFrom;
    }

    public LocalDate getUntil() {
        return until;
    }

    public void setUntil(LocalDate until) {
        this.until = until;
    }

    public Multimedia getPhoto() {
        return photo;
    }

    public void setPhoto(Multimedia photo) {
        this.photo = photo;
    }
}