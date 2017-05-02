package spd.spring.camp.team3.animal;

import org.springframework.stereotype.Repository;
import spd.spring.camp.team3.BaseRepository;

import javax.persistence.EntityManager;

@Repository
public class AnimalRepository extends BaseRepository<Animal, Integer> {
    public AnimalRepository(EntityManager entityManager) {
        super(entityManager);
    }
}
