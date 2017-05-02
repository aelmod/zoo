package spd.spring.camp.team3.animal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class AnimalService {
    private final AnimalRepository animalRepository;

    @Autowired
    public AnimalService(AnimalRepository animalRepository) {
        this.animalRepository = animalRepository;
    }

    @Transactional(readOnly = true)
    public List<Animal> findBy(AnimalSpecification animalSpecification) {
        return animalRepository.findBy(animalSpecification);
    }

    @Transactional(readOnly = true)
    public Animal getByPk(Integer id) {
        return animalRepository.findOneByPk(id).orElseThrow(EntityNotFoundException::new);
    }

    @Transactional
    public void create(Animal animal) {
        animalRepository.persist(animal);
    }
}
