package com.breeds.dogs.dogsController;

import Model.Dogs;
import dogsService.DogsService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/")
public class DogsController {
    private DogsService dogsService;

    public DogsController() {
    }

    public DogsController(DogsService dogsService) {
        this.dogsService = dogsService;
    }

    @GetMapping("/api/breeds/list/all")
    public Iterable<Dogs> list() {
        return dogsService.getAllDogs();
    }


}
