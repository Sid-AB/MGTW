package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ImageDefaultController {
    public ImageDefaultController() {
    }

    @GetMapping({"/lugo"})
    public String lugdod() {
        return "notAuthenticated/assets/img/lugo agb1.png";
    }
}
