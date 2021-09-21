package com.breeds.dogs;

import Model.Dogs;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import dogsService.DogsService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.util.List;

@SpringBootApplication
public class DogsApplication {

    public static void main(String[] args) {
        SpringApplication.run(DogsApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(DogsService dogsService) {
        return args -> {
            try {
                // create object mapper instance
                ObjectMapper mapper = new ObjectMapper();

                // convert JSON file to map
                List<Dogs> dogs = mapper.readValue(Paths.get("apidata.json").toFile(), Dogs.class);

                // print map entries
                for (Map.Entry<?, ?> entry : map.entrySet()) {
                    System.out.println(entry.getKey() + "=" + entry.getValue());
                }

            } catch (Exception ex) {
                ex.printStackTrace();
            }
    }
}
