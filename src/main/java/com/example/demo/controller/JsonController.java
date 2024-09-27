package com.example.demo.controller;


import com.example.demo.entities.Complexe;
import com.example.demo.entities.Lois;
import com.example.demo.service.ComplexeService;
import com.example.demo.service.LoisService;
import com.example.demo.service.TVService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController
public class JsonController {
    @Autowired
    private LoisService loisService;
    @Autowired
    private ComplexeService complexeService;
    @Autowired
    private TVService tvService;

    public JsonController() {
    }

    @GetMapping({"/lois/all"})
    public List<Lois> getAllLois() {
        return this.loisService.findAll();
    }

    @GetMapping({"/complexe/all"})
    public List<Complexe> getAllComplexe() {
        return this.complexeService.findAll();
    }
}
