package io.github.sahawick.springjwtdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("resource")
public class ResourceController {

    @GetMapping("")
    public String getResource() {
        return "This is the resource!";
    }
}
