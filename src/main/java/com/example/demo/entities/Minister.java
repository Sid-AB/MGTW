
package com.example.demo.entities;

import jakarta.persistence.*;
import java.time.LocalDate;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.i18n.LocaleContextHolder;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.format.DateTimeFormatter;
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
      // Champs formatés pour l'affichage
      private String formattedStartFrom;
      private String formattedUntil;
  

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "profile_picture_id")
    private Multimedia profilePicture;

    @OneToMany(mappedBy = "minister", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Multimedia> multimediaList;

    // Constructors
    public Minister() {}

    public Minister(String firstName, String lastName, LocalDate birthday, String address, LocalDate startFrom, LocalDate until,final List<Multimedia> multimediaList,Multimedia profilePicture) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.startFrom = startFrom;
        this.until = until;
        this.multimediaList=multimediaList;
        this.profilePicture=profilePicture;

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

    public List<Multimedia> getMultimediaList() {
        return this.multimediaList;
    }

 public void setMultimediaList(List<Multimedia> multimediaList)
 {
    this.multimediaList=multimediaList;
 }
    public Multimedia getprofilePicture() {
        return profilePicture;
    }

     public void setprofilePicture(Multimedia profilePicture) {
        this.profilePicture = profilePicture;
    }
    public String getFormattedStartFrom() {
        return formattedStartFrom;
    }

    public void setFormattedStartFrom(String formattedStartFrom) {
        this.formattedStartFrom = formattedStartFrom;
    }

    public String getFormattedUntil() {
        return formattedUntil;
    }

    public void setFormattedUntil(String formattedUntil) {
        this.formattedUntil = formattedUntil;
    }

 
}

  
