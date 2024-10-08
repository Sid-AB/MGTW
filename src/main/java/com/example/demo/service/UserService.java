package com.example.demo.service;


import com.example.demo.dto.UserDTO;
import com.example.demo.entities.Multimedia;
import com.example.demo.entities.User;
import com.example.demo.repository.MultimediaRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private MultimediaRepository multimediaRepository;

    public UserService() {
    }

    public User getUserById(Long id) {
        return this.userRepository.findUserById(id);
    }

    Optional<User> findUserByUsername(String username) {
        return this.userRepository.findUserByUsername(username);
    }

    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    public User saveProfile(UserDTO userDTO) {
        User user = userDTO.toUser();
        this.userRepository.save(user);
        Multimedia multimedia = null;
        List<Multimedia> multimedias = new ArrayList();
        if (!userDTO.getProfileImage().isEmpty()) {
            multimedia = this.filesStorageService.save(userDTO.getProfileImage(), "profileImage");
            multimedias.add(multimedia);
        }

        if (!((MultipartFile)userDTO.getProfilFiles().get(0)).isEmpty()) {
            multimedias.addAll(this.filesStorageService.saveFiles(userDTO.getProfilFiles(), "profileDoc"));
        }

        User user1 = this.saveUserAndMultimedias(multimedias, user);
        return user1;
    }

    public User saveUserAndMultimedias(List<Multimedia> multimedias, User user) {
        this.userRepository.save(user);
        if (multimedias != null && !multimedias.isEmpty()) {
            List<Multimedia> savedMultimedias = new ArrayList();
            multimedias.forEach((multimedia) -> {
                multimedia.setUser(user);
            });
            savedMultimedias.addAll(multimedias);
            user.setMultimediaList(savedMultimedias);
            this.multimediaRepository.saveAll(savedMultimedias);
        }

        return user;
    }

    public User updateDataUser(User updatedUser, Long userId, List<Multimedia> multimedias) {
        User existingUser = this.userRepository.findUserById(userId);
        existingUser.setFirstname(updatedUser.getFirstname());
        existingUser.setLastname(updatedUser.getLastname());
        existingUser.setUsername(updatedUser.getUsername());
        existingUser.setRole(updatedUser.getRole());
        existingUser.setAddressoffice(updatedUser.getAddressoffice());
        existingUser.setPhoneoffice(updatedUser.getPhoneoffice());
        existingUser.setMobile(updatedUser.getMobile());
        existingUser.setFonction(updatedUser.getFonction());
        existingUser.setEmail(updatedUser.getEmail());
        existingUser.setPassword(updatedUser.getPassword());
        this.userRepository.save(existingUser);
        if (multimedias != null && !multimedias.isEmpty()) {
            List<Multimedia> savedMultimedias = new ArrayList();
            multimedias.forEach((multimedia) -> {
                multimedia.setUser(existingUser);
            });
            savedMultimedias.addAll(multimedias);
            existingUser.setMultimediaList(savedMultimedias);
            this.multimediaRepository.saveAll(savedMultimedias);
        }

        return existingUser;
    }
}
