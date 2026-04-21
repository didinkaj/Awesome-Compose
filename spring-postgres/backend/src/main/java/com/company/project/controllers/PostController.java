package com.company.project.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostController {

    @GetMapping("/posts")
    public String posts(){
        return "posts";
    }
}
