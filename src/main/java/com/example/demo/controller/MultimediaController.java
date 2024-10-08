package com.example.demo.controller;

import com.example.demo.entities.Multimedia;
import com.example.demo.service.FilesStorageService;
import com.example.demo.service.MultimediaService;
import com.example.demo.service.TVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping({"/multimediaa"})
public class MultimediaController {
    @Autowired
    private MultimediaService multimediaService;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private TVService tvService;

    public MultimediaController() {
    }

    @GetMapping({"/findAllById/{id}"})
    public List<Multimedia> findAllById(Model model, @PathVariable("id") Long id) {
        return this.multimediaService.findAllById(id);
    }

    @GetMapping({"/findMultimediaById/{id}"})
    public Multimedia findMultimediaById(@PathVariable("id") Long id) {
        return this.multimediaService.findMultimediaById(id);
    }

    @GetMapping({"/images/{filename:.+}"})
    public ResponseEntity<Resource> getFile(@PathVariable String filename) {
        Resource file = this.filesStorageService.load(filename);
        return ((BodyBuilder)ResponseEntity.ok().header("Content-Disposition", new String[]{"attachment; filename=\"" + file.getFilename() + "\""})).body(file);
    }

    @GetMapping({"/delete/{id}/{userid}"})
    public String usersList(@PathVariable("id") Long id, @PathVariable("userid") Long userid) {
        this.multimediaService.sup(id);
        return "redirect:/user/userEdit/".concat(String.valueOf(userid));
    }
}
