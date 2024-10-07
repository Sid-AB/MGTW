package com.example.demo.controller;

import com.example.demo.dto.UserDTO;
import com.example.demo.entities.Multimedia;
import com.example.demo.entities.User;
import com.example.demo.service.FilesStorageService;
import com.example.demo.service.MultimediaService;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping({"/user"})
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private MultimediaService multimediaService;

    public UserController() {
    }

    @GetMapping({"/add"})
    public String directionAdd(Model model) {
        return "/authenticated/user/userAdd";
    }

    @PostMapping({"/save"})
    public String saveProfile(@ModelAttribute("userDTO") UserDTO userDTO) {
        this.userService.saveProfile(userDTO);
        return "redirect:/user/users";
    }

    @GetMapping({"/users"})
    public String users(Model model) {
        List<User> users = this.userService.findAll();
        model.addAttribute("users", users);
        return "authenticated/user/users";
    }

    @GetMapping({"/multimedia/{folder}/{filename}"})
    public ResponseEntity<Resource> getFile(@PathVariable String filename, @PathVariable String folder) throws IOException {
        Resource file = this.filesStorageService.load(folder.concat("/" + filename));
        String contentType = Files.probeContentType(file.getFile().toPath());
        return ((BodyBuilder)ResponseEntity.ok().contentType(MediaType.parseMediaType(contentType)).header("Content-Disposition", new String[]{"inline; filename=\"" + file.getFilename() + "\""})).body(new InputStreamResource(file.getInputStream()));
    }

    @GetMapping({"/{userId}/userDetail"})
    public String usersDetail(Model model, @PathVariable Long userId) {
        User user = this.userService.getUserById(userId);
        ResponseEntity<Resource> fileImg = this.getImage(user.getId(), "images", "profileImage");
        model.addAttribute("user", user);
        model.addAttribute("fileImg", fileImg);
        return "authenticated/user/userDetail";
    }

    @GetMapping({"/imgPro/{id}/{folder}/{profileImage}"})
    public ResponseEntity<Resource> getImage(@PathVariable("id") Long id, @PathVariable("folder") String folder, @PathVariable("profileImage") String profileImage) {
        System.out.println("userz " + id + " " + folder + " " + profileImage);
        User user = this.userService.getUserById(id);
        Optional<Multimedia> multimedia = this.multimediaService.findMultimediaByUserAndDocType(user, profileImage);
        if (multimedia.isPresent()) {
            String filename = ((Multimedia)multimedia.get()).getFileName();
            Resource file = this.filesStorageService.load(folder.concat("/" + filename));
            return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + file.getFilename() + "\""})).body(file);
        } else {
            Resource file = this.filesStorageService.load("staticImage".concat("/profile-img.jpg"));
            return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + file.getFilename() + "\""})).body(file);
        }
    }

    @PostMapping({"/userEditData/{userId}"})
    public String userEditdata(@ModelAttribute("userDataDTO") UserDTO updatedUserDataDTO, @PathVariable("userId") Long userId) {
        try {
            User updatedUser = updatedUserDataDTO.toUser();
            Multimedia multimedia = null;
            List<Multimedia> multimedias = new ArrayList();
            if (!updatedUserDataDTO.getProfileImage().isEmpty()) {
                multimedia = this.filesStorageService.save(updatedUserDataDTO.getProfileImage(), "profileImage");
                multimedias.add(multimedia);
            }

            if (!((MultipartFile)updatedUserDataDTO.getProfilFiles().get(0)).isEmpty()) {
                multimedias.addAll(this.filesStorageService.saveFiles(updatedUserDataDTO.getProfilFiles(), "profileDoc"));
            }

            this.userService.updateDataUser(updatedUser, userId, multimedias);
            return "redirect:/user/users";
        } catch (Exception var7) {
            var7.printStackTrace();
            return "";
        }
    }

    @GetMapping({"/userEdit/{userId}"})
    public String userEdit(Model model, @PathVariable String userId) {
        User user = this.userService.getUserById(Long.valueOf(userId));
        this.getImage(user.getId(), "images", "profileImage");
        model.addAttribute("user", user);
        return "authenticated/user/userEdit";
    }

    @GetMapping("/watch/{videoName}")
    public RedirectView watchVideo(@PathVariable String videoName) {
        return new RedirectView("/videos/" + videoName);
    }
}
