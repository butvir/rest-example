package kz.example.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

    @GetMapping("/string")
    public String getString() {
        return "get-hello";
    }

    @PostMapping("/string")
    public String postString() {
        return "post-hello";
    }
}
