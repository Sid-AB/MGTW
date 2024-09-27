
package com.example.demo.controller;

import com.example.demo.dto.MinisterDTO;
import com.example.demo.entities.Multimedia;
import com.example.demo.entities.Minister;
import com.example.demo.service.MinisterService;
import com.example.demo.service.MultimediaService;
import com.example.demo.service.FilesStorageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ministers")
public class MinisterController {

    @Autowired
    private MinisterService ministerService;
    @Autowired
    private FilesStorageService filesStorageService;
    @Autowired
    private MultimediaService multimediaService;

    @PostMapping
    public ResponseEntity<MinisterDTO> createMinister(@RequestBody MinisterDTO ministerDTO) {
        MinisterDTO createdMinister = ministerService.createMinister(ministerDTO);
        return ResponseEntity.ok(createdMinister);
    }

    @GetMapping("/{id}")
    public ResponseEntity<MinisterDTO> getMinister(@PathVariable Long id) {
        MinisterDTO ministerDTO = ministerService.getMinister(id);
        return ResponseEntity.ok(ministerDTO);
    }
}