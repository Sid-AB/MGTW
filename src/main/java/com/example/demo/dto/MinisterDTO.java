package com.example.demo.dto;

import com.example.demo.entities.Minister;

import org.hibernate.mapping.List;
import org.springframework.web.multipart.MultipartFile;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//import java.util.List;

public class MinisterDTO {

    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String address;
    private LocalDate startFrom;
    private LocalDate until;
    private MultipartFile profilePicture;
    private String formattedStartFrom; // Nouveau champ pour stocker la date formatée

    private String formattedDateDebut;
    private String formattedDateFin;
    

    // Ajout des champs pour les noms en français et en anglais
    private String firstNameFr;
    private String firstNameEn;
    private String lastNameFr;
    private String lastNameEn;

    // Constructors
    public MinisterDTO() {

    }

    public MinisterDTO(String firstName, String lastName, LocalDate birthday, String address,
            LocalDate startFrom, LocalDate until, MultipartFile profilePicture,
            String firstNameFr, String firstNameEn, String lastNameFr, String lastNameEn) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.startFrom = startFrom;
        this.until = until;
        this.profilePicture = profilePicture;
        this.firstNameFr = firstNameFr;
        this.firstNameEn = firstNameEn;
        this.lastNameFr = lastNameFr;
        this.lastNameEn = lastNameEn;
    }

    // Getters and Setters
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

    // Getters et Setters pour firstNameFr, firstNameEn, lastNameFr, lastNameEn
    public String getFirstNameFr() {
        return firstNameFr;
    }

    public void setFirstNameFr(String firstNameFr) {
        this.firstNameFr = firstNameFr;
    }

    public String getFirstNameEn() {
        return firstNameEn;
    }

    public void setFirstNameEn(String firstNameEn) {
        this.firstNameEn = firstNameEn;
    }

    public String getLastNameFr() {
        return lastNameFr;
    }

    public void setLastNameFr(String lastNameFr) {
        this.lastNameFr = lastNameFr;
    }

    public String getLastNameEn() {
        return lastNameEn;
    }

    public void setLastNameEn(String lastNameEn) {
        this.lastNameEn = lastNameEn;
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

    public MultipartFile getprofilePicture() {
        return profilePicture;
    }

    public void setprofilePicture(MultipartFile profilePicture) {
        this.profilePicture = profilePicture;
    }
   

    public String getFormattedDateDebut() {
        return formattedDateDebut;
    }

    public void setFormattedDateDebut(String formattedDateDebut) {
        this.formattedDateDebut = formattedDateDebut;
    }

    public String getFormattedDateFin() {
        return formattedDateFin;
    }

    public String getFormattedStartFrom() {
        return formattedStartFrom;
    }

    public void setFormattedDateFin(String formattedDateFin) {
        this.formattedDateFin = formattedDateFin;
    }
  
}