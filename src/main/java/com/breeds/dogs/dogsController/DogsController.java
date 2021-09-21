package com.breeds.dogs.dogsController;

import com.breeds.dogs.Model.Dogs;
import com.breeds.dogs.dogsService.DogsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class DogsController {

    private final DogsService dogsService;

    public DogsController(DogsService dogsService) {
        this.dogsService = dogsService;
    }

    @GetMapping("/api/breeds/list/all")
    public Iterable<Dogs> list() {
        return dogsService.getAllDogs();
    }


}
