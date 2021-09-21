package dogsService;

import Model.Dogs;
import dogsRepository.DogsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DogsService {

    private final DogsRepository dogsRepository;

    public DogsService(DogsRepository dogsRepository) {
        this.dogsRepository = dogsRepository;
    }

    public Iterable<Dogs> getAllDogs(){
        return dogsRepository.getAllDogs();
    }
}
