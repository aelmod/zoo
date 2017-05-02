package spd.spring.camp.team3;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

public interface EntitySpecification<Entity> {

    CriteriaQuery<Entity> toCriteria(CriteriaBuilder cb);
}
