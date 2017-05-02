package spd.spring.camp.team3.animal;

import spd.spring.camp.team3.EntitySpecification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

public class AnimalSpecification implements EntitySpecification<Animal> {
    @Override
    public CriteriaQuery<Animal> toCriteria(CriteriaBuilder cb) {
        CriteriaQuery<Animal> animalQuery = cb.createQuery(Animal.class);
        Root<Animal> animalEntity = animalQuery.from(Animal.class);
        return animalQuery.select(animalEntity);
    }
}
