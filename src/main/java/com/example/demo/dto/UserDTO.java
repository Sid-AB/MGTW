package com.example.demo.dto;

import com.example.demo.entities.User;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Set;

public class UserDTO {
    private MultipartFile profileImage;
    private String firstname;
    private String lastname;
    private String role;
    private String addressoffice;
    private String phoneoffice;
    private String mobile;
    private String fonction;
    private String email;
    private String username;
    private String password;
    private String renewpassword;
    private List<MultipartFile> profilFiles;
    private Set<Long> selectedRoles;

    public User toUser() {
        User user = new User();
        user.setFirstname(this.getFirstname());
        user.setLastname(this.getLastname());
        user.setAddressoffice(this.getAddressoffice());
        user.setPhoneoffice(this.getPhoneoffice());
        user.setRole(this.getRole());
        user.setMobile(this.getMobile());
        user.setFonction(this.getFonction());
        user.setEmail(this.getEmail());
        user.setUsername(this.getUsername());
        user.setPassword(this.getPassword());
        return user;
    }

    public static com.example.demo.dto.UserDTO.UserDTOBuilder builder() {
        return new com.example.demo.dto.UserDTO.UserDTOBuilder();
    }

    public UserDTO(final MultipartFile profileImage, final String firstname, final String lastname, final String role, final String addressoffice, final String phoneoffice, final String mobile, final String fonction, final String email, final String username, final String password, final String renewpassword, final List<MultipartFile> profilFiles, final Set<Long> selectedRoles) {
        this.profileImage = profileImage;
        this.firstname = firstname;
        this.lastname = lastname;
        this.role = role;
        this.addressoffice = addressoffice;
        this.phoneoffice = phoneoffice;
        this.mobile = mobile;
        this.fonction = fonction;
        this.email = email;
        this.username = username;
        this.password = password;
        this.renewpassword = renewpassword;
        this.profilFiles = profilFiles;
        this.selectedRoles = selectedRoles;
    }

    public UserDTO() {
    }

    public MultipartFile getProfileImage() {
        return this.profileImage;
    }

    public String getFirstname() {
        return this.firstname;
    }

    public String getLastname() {
        return this.lastname;
    }

    public String getRole() {
        return this.role;
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

    public String getEmail() {
        return this.email;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getRenewpassword() {
        return this.renewpassword;
    }

    public List<MultipartFile> getProfilFiles() {
        return this.profilFiles;
    }

    public Set<Long> getSelectedRoles() {
        return this.selectedRoles;
    }

    public void setProfileImage(final MultipartFile profileImage) {
        this.profileImage = profileImage;
    }

    public void setFirstname(final String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(final String lastname) {
        this.lastname = lastname;
    }

    public void setRole(final String role) {
        this.role = role;
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

    public void setEmail(final String email) {
        this.email = email;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setRenewpassword(final String renewpassword) {
        this.renewpassword = renewpassword;
    }

    public void setProfilFiles(final List<MultipartFile> profilFiles) {
        this.profilFiles = profilFiles;
    }

    public void setSelectedRoles(final Set<Long> selectedRoles) {
        this.selectedRoles = selectedRoles;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof UserDTO)) {
            return false;
        } else {
            UserDTO other = (UserDTO)o;
            if (!other.canEqual(this)) {
                return false;
            } else {
                Object this$profileImage = this.getProfileImage();
                Object other$profileImage = other.getProfileImage();
                if (this$profileImage == null) {
                    if (other$profileImage != null) {
                        return false;
                    }
                } else if (!this$profileImage.equals(other$profileImage)) {
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
                    Object this$role = this.getRole();
                    Object other$role = other.getRole();
                    if (this$role == null) {
                        if (other$role == null) {
                            break label158;
                        }
                    } else if (this$role.equals(other$role)) {
                        break label158;
                    }

                    return false;
                }

                label151: {
                    Object this$addressoffice = this.getAddressoffice();
                    Object other$addressoffice = other.getAddressoffice();
                    if (this$addressoffice == null) {
                        if (other$addressoffice == null) {
                            break label151;
                        }
                    } else if (this$addressoffice.equals(other$addressoffice)) {
                        break label151;
                    }

                    return false;
                }

                Object this$phoneoffice = this.getPhoneoffice();
                Object other$phoneoffice = other.getPhoneoffice();
                if (this$phoneoffice == null) {
                    if (other$phoneoffice != null) {
                        return false;
                    }
                } else if (!this$phoneoffice.equals(other$phoneoffice)) {
                    return false;
                }

                label137: {
                    Object this$mobile = this.getMobile();
                    Object other$mobile = other.getMobile();
                    if (this$mobile == null) {
                        if (other$mobile == null) {
                            break label137;
                        }
                    } else if (this$mobile.equals(other$mobile)) {
                        break label137;
                    }

                    return false;
                }

                label130: {
                    Object this$fonction = this.getFonction();
                    Object other$fonction = other.getFonction();
                    if (this$fonction == null) {
                        if (other$fonction == null) {
                            break label130;
                        }
                    } else if (this$fonction.equals(other$fonction)) {
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

                Object this$username = this.getUsername();
                Object other$username = other.getUsername();
                if (this$username == null) {
                    if (other$username != null) {
                        return false;
                    }
                } else if (!this$username.equals(other$username)) {
                    return false;
                }

                label109: {
                    Object this$password = this.getPassword();
                    Object other$password = other.getPassword();
                    if (this$password == null) {
                        if (other$password == null) {
                            break label109;
                        }
                    } else if (this$password.equals(other$password)) {
                        break label109;
                    }

                    return false;
                }

                label102: {
                    Object this$renewpassword = this.getRenewpassword();
                    Object other$renewpassword = other.getRenewpassword();
                    if (this$renewpassword == null) {
                        if (other$renewpassword == null) {
                            break label102;
                        }
                    } else if (this$renewpassword.equals(other$renewpassword)) {
                        break label102;
                    }

                    return false;
                }

                Object this$profilFiles = this.getProfilFiles();
                Object other$profilFiles = other.getProfilFiles();
                if (this$profilFiles == null) {
                    if (other$profilFiles != null) {
                        return false;
                    }
                } else if (!this$profilFiles.equals(other$profilFiles)) {
                    return false;
                }

                Object this$selectedRoles = this.getSelectedRoles();
                Object other$selectedRoles = other.getSelectedRoles();
                if (this$selectedRoles == null) {
                    if (other$selectedRoles != null) {
                        return false;
                    }
                } else if (!this$selectedRoles.equals(other$selectedRoles)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof UserDTO;
    }

    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        Object $profileImage = this.getProfileImage();
         result = result * 59 + ($profileImage == null ? 43 : $profileImage.hashCode());
        Object $firstname = this.getFirstname();
        result = result * 59 + ($firstname == null ? 43 : $firstname.hashCode());
        Object $lastname = this.getLastname();
        result = result * 59 + ($lastname == null ? 43 : $lastname.hashCode());
        Object $role = this.getRole();
        result = result * 59 + ($role == null ? 43 : $role.hashCode());
        Object $addressoffice = this.getAddressoffice();
        result = result * 59 + ($addressoffice == null ? 43 : $addressoffice.hashCode());
        Object $phoneoffice = this.getPhoneoffice();
        result = result * 59 + ($phoneoffice == null ? 43 : $phoneoffice.hashCode());
        Object $mobile = this.getMobile();
        result = result * 59 + ($mobile == null ? 43 : $mobile.hashCode());
        Object $fonction = this.getFonction();
        result = result * 59 + ($fonction == null ? 43 : $fonction.hashCode());
        Object $email = this.getEmail();
        result = result * 59 + ($email == null ? 43 : $email.hashCode());
        Object $username = this.getUsername();
        result = result * 59 + ($username == null ? 43 : $username.hashCode());
        Object $password = this.getPassword();
        result = result * 59 + ($password == null ? 43 : $password.hashCode());
        Object $renewpassword = this.getRenewpassword();
        result = result * 59 + ($renewpassword == null ? 43 : $renewpassword.hashCode());
        Object $profilFiles = this.getProfilFiles();
        result = result * 59 + ($profilFiles == null ? 43 : $profilFiles.hashCode());
        Object $selectedRoles = this.getSelectedRoles();
        result = result * 59 + ($selectedRoles == null ? 43 : $selectedRoles.hashCode());
        return result;
    }

    public String toString() {
        String var10000 = String.valueOf(this.getProfileImage());
        return "UserDTO(profileImage=" + var10000 + ", firstname=" + this.getFirstname() + ", lastname=" + this.getLastname() + ", role=" + this.getRole() + ", addressoffice=" + this.getAddressoffice() + ", phoneoffice=" + this.getPhoneoffice() + ", mobile=" + this.getMobile() + ", fonction=" + this.getFonction() + ", email=" + this.getEmail() + ", username=" + this.getUsername() + ", password=" + this.getPassword() + ", renewpassword=" + this.getRenewpassword() + ", profilFiles=" + String.valueOf(this.getProfilFiles()) + ", selectedRoles=" + String.valueOf(this.getSelectedRoles()) + ")";
    }

    public static class UserDTOBuilder {
    }
}
