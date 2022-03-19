package kz.example.rest.controller;

import kz.example.rest.entity.Animal;
import kz.example.rest.service.AnimalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnimalController {

    private final AnimalService service;

    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @GetMapping("/parrot")
    public Animal getAnimal() {
        return service.getParrot();
    }
}
