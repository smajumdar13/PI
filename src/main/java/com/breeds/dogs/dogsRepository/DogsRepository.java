package com.breeds.dogs.dogsRepository;

import com.breeds.dogs.Model.Dogs;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Repository
public interface DogsRepository extends JpaRepository<Dogs, String> {

    @Query("SELECT d FROM Dogs d")
    List<Dogs> getAllDogs();

}
