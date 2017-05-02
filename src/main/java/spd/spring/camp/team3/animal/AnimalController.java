package spd.spring.camp.team3.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/animal")
public class AnimalController {
    private final AnimalService animalService;

    @Autowired
    public AnimalController(AnimalService animalService) {
        this.animalService = animalService;
    }

    @GetMapping
    public List<Animal> getAllAnimals() {
        return animalService.findBy(new AnimalSpecification());
    }

    @PostMapping
    public void createAnimal(@RequestBody AnimalForm animalForm) {
        animalService.create(animalForm.toAnimal());
    }
}
