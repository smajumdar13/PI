package com.breeds.dogs;

import com.breeds.dogs.Model.Dogs;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.breeds.dogs.dogsRepository.DogsRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

@SpringBootApplication
public class DogsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DogsApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(DogsRepository dogsRepository) {
        return args -> {
            ObjectMapper mapper = new ObjectMapper();
            TypeReference<List<Dogs>> mapType = new TypeReference<List<Dogs>>() {
            };
            InputStream is = TypeReference.class.getResourceAsStream("apidata.json");
            try {
                List<Dogs> d = mapper.readValue(is, mapType);
                dogsRepository.save(d);
                System.out.println("States list saved successfully");
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        };
    }
}
