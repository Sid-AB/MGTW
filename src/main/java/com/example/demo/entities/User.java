package com.example.demo.entities;


import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(
        name = "user"
)
public class User {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String firstname;
    private String lastname;
    private String addressoffice;
    private String phoneoffice;
    private String mobile;
    private String fonction;
    private String username;
    private String email;
    private String password;
    private String role;
    @OneToMany(
            mappedBy = "user",
            cascade = {CascadeType.ALL}
    )
    private List<Multimedia> multimediaList = new ArrayList();
    @CreationTimestamp
    @Column(
            name = "created_at"
    )
    private LocalDateTime createdAt;
    @UpdateTimestamp
    @Column(
            name = "updated_at"
    )
    private LocalDateTime updatedAt;

    public static com.example.demo.entities.User.UserBuilder builder() {
        return new com.example.demo.entities.User.UserBuilder();
    }

    public Long getId() {
        return this.id;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getAddressoffice() {
        return this.addressoffice;
    }

    public String getPhoneoffice() {
        return this.phoneoffice;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getFonction() {
        return this.fonction;
    }

    public String getUsername() {
        return this.username;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String getRole() {
        return this.role;
    }

    public List<Multimedia> getMultimediaList() {
        return this.multimediaList;
    }

    public LocalDateTime getCreatedAt() {
        return this.createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public void setId(final Long id) {
        this.id = id;
    }

    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    public void setAddressoffice(final String addressoffice) {
        this.addressoffice = addressoffice;
    }

    public void setPhoneoffice(final String phoneoffice) {
        this.phoneoffice = phoneoffice;
    }

    public void setMobile(final String mobile) {
        this.mobile = mobile;
    }

    public void setFonction(final String fonction) {
        this.fonction = fonction;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setRole(final String role) {
        this.role = role;
    }

    public void setMultimediaList(final List<Multimedia> multimediaList) {
        this.multimediaList = multimediaList;
    }

    public void setCreatedAt(final LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public void setUpdatedAt(final LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof User)) {
            return false;
        } else {
            User other = (User)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$id = this.getId();
                Object other$id = other.getId();
                if (this$id == null) {
                    if (other$id != null) {
                        return false;
                    }
                } else if (!this$id.equals(other$id)) {
                    return false;
                }

                Object this$firstname = this.getFirstname();
                Object other$firstname = other.getFirstname();
                if (this$firstname == null) {
                    if (other$firstname != null) {
                        return false;
                    }
                } else if (!this$firstname.equals(other$firstname)) {
                    return false;
                }

                Object this$lastname = this.getLastname();
                Object other$lastname = other.getLastname();
                if (this$lastname == null) {
                    if (other$lastname != null) {
                        return false;
                    }
                } else if (!this$lastname.equals(other$lastname)) {
                    return false;
                }

                label158: {
                    Object this$addressoffice = this.getAddressoffice();
                    Object other$addressoffice = other.getAddressoffice();
                    if (this$addressoffice == null) {
                        if (other$addressoffice == null) {
                            break label158;
                        }
                    } else if (this$addressoffice.equals(other$addressoffice)) {
                        break label158;
                    }

                    return false;
                }

                label151: {
                    Object this$phoneoffice = this.getPhoneoffice();
                    Object other$phoneoffice = other.getPhoneoffice();
                    if (this$phoneoffice == null) {
                        if (other$phoneoffice == null) {
                            break label151;
                        }
                    } else if (this$phoneoffice.equals(other$phoneoffice)) {
                        break label151;
                    }

                    return false;
                }

                Object this$mobile = this.getMobile();
                Object other$mobile = other.getMobile();
                if (this$mobile == null) {
                    if (other$mobile != null) {
                        return false;
                    }
                } else if (!this$mobile.equals(other$mobile)) {
                    return false;
                }

                label137: {
                    Object this$fonction = this.getFonction();
                    Object other$fonction = other.getFonction();
                    if (this$fonction == null) {
                        if (other$fonction == null) {
                            break label137;
                        }
                    } else if (this$fonction.equals(other$fonction)) {
                        break label137;
                    }

                    return false;
                }

                label130: {
                    Object this$username = this.getUsername();
                    Object other$username = other.getUsername();
                    if (this$username == null) {
                        if (other$username == null) {
                            break label130;
                        }
                    } else if (this$username.equals(other$username)) {
                        break label130;
                    }

                    return false;
                }

                Object this$email = this.getEmail();
                Object other$email = other.getEmail();
                if (this$email == null) {
                    if (other$email != null) {
                        return false;
                    }
                } else if (!this$email.equals(other$email)) {
                    return false;
                }

                Object this$password = this.getPassword();
                Object other$password = other.getPassword();
                if (this$password == null) {
                    if (other$password != null) {
                        return false;
                    }
                } else if (!this$password.equals(other$password)) {
                    return false;
                }

                label109: {
                    Object this$role = this.getRole();
                    Object other$role = other.getRole();
                    if (this$role == null) {
                        if (other$role == null) {
                            break label109;
                        }
                    } else if (this$role.equals(other$role)) {
                        break label109;
                    }

                    return false;
                }

                label102: {
                    Object this$multimediaList = this.getMultimediaList();
                    Object other$multimediaList = other.getMultimediaList();
                    if (this$multimediaList == null) {
                        if (other$multimediaList == null) {
                            break label102;
                        }
                    } else if (this$multimediaList.equals(other$multimediaList)) {
                        break label102;
                    }

                    return false;
                }

                Object this$createdAt = this.getCreatedAt();
                Object other$createdAt = other.getCreatedAt();
                if (this$createdAt == null) {
                    if (other$createdAt != null) {
                        return false;
                    }
                } else if (!this$createdAt.equals(other$createdAt)) {
                    return false;
                }

                Object this$updatedAt = this.getUpdatedAt();
                Object other$updatedAt = other.getUpdatedAt();
                if (this$updatedAt == null) {
                    if (other$updatedAt != null) {
                        return false;
                    }
                } else if (!this$updatedAt.equals(other$updatedAt)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof User;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $id = this.getId();
        result = result * 59 + ($id == null ? 43 : $id.hashCode());
        Object $firstname = this.getFirstname();
        result = result * 59 + ($firstname == null ? 43 : $firstname.hashCode());
        Object $lastname = this.getLastname();
        result = result * 59 + ($lastname == null ? 43 : $lastname.hashCode());
        Object $addressoffice = this.getAddressoffice();
        result = result * 59 + ($addressoffice == null ? 43 : $addressoffice.hashCode());
        Object $phoneoffice = this.getPhoneoffice();
        result = result * 59 + ($phoneoffice == null ? 43 : $phoneoffice.hashCode());
        Object $mobile = this.getMobile();
        result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
        Object $fonction = this.getFonction();
        result = result * 59 + ($fonction == null ? 43 : $fonction.hashCode());
        Object $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        Object $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        Object $role = this.getRole();
        result = result * 59 + ($role == null ? 43 : $role.hashCode());
        Object $multimediaList = this.getMultimediaList();
        result = result * 59 + ($multimediaList == null ? 43 : $multimediaList.hashCode());
        Object $createdAt = this.getCreatedAt();
        result = result * 59 + ($createdAt == null ? 43 : $createdAt.hashCode());
        Object $updatedAt = this.getUpdatedAt();
        result = result * 59 + ($updatedAt == null ? 43 : $updatedAt.hashCode());
        return result;
    }

    public String toString() {
        Long var10000 = this.getId();
        return "User(id=" + var10000 + ", firstname=" + this.getFirstname() + ", lastname=" + this.getLastname() + ", addressoffice=" + this.getAddressoffice() + ", phoneoffice=" + this.getPhoneoffice() + ", mobile=" + this.getMobile() + ", fonction=" + this.getFonction() + ", username=" + this.getUsername() + ", email=" + this.getEmail() + ", password=" + this.getPassword() + ", role=" + this.getRole() + ", multimediaList=" + String.valueOf(this.getMultimediaList()) + ", createdAt=" + String.valueOf(this.getCreatedAt()) + ", updatedAt=" + String.valueOf(this.getUpdatedAt()) + ")";
    }

    public User(final Long id, final String firstname, final String lastname, final String addressoffice, final String phoneoffice, final String mobile, final String fonction, final String username, final String email, final String password, final String role, final List<Multimedia> multimediaList, final LocalDateTime createdAt, final LocalDateTime updatedAt) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.addressoffice = addressoffice;
        this.phoneoffice = phoneoffice;
        this.mobile = mobile;
        this.fonction = fonction;
        this.username = username;
        this.email = email;
        this.password = password;
        this.role = role;
        this.multimediaList = multimediaList;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public User() {
    }

    public static class UserBuilder {
    }
}
