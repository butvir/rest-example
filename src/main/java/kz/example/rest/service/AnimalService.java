package kz.example.rest.service;

import kz.example.rest.entity.Animal;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

    public Animal getParrot() {
        Animal parrot = new Animal("bird", "parrot", 250.5);
        return parrot;
    }

}
