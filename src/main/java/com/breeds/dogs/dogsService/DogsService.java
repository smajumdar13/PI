package com.breeds.dogs.dogsService;

import com.breeds.dogs.Model.Dogs;
import com.breeds.dogs.dogsRepository.DogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogsService{

    private DogsRepository dogsRepository;

    @Autowired
    public DogsService(DogsRepository dogsRepository) {
        this.dogsRepository = dogsRepository;
    }

    public Iterable<Dogs> getAllDogs(){
        return dogsRepository.getAllDogs();
    }

    public Iterable<Dogs> save(List<Dogs> dogs) {
        return dogsRepository.save();
    }
}
