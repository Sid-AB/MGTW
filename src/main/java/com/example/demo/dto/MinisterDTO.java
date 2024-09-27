
package com.example.demo.dto;

import com.example.demo.entities.Minister;
import org.springframework.web.multipart.MultipartFile;
import java.time.LocalDate;

public class MinisterDTO {
    
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String address;
    private LocalDate startFrom;
    private LocalDate until;
  //  private String photoUrl;

    // Constructors
    public MinisterDTO() {}

    public MinisterDTO(String firstName, String lastName, LocalDate birthday, String address, LocalDate startFrom, LocalDate until/*, String photoUrl */) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.address = address;
        this.startFrom = startFrom;
        this.until = until;
      //  this.photoUrl = photoUrl;
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

 
}
/*   public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }*/ 