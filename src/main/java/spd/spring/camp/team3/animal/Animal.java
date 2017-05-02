package spd.spring.camp.team3.animal;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "animals")
public class Animal {

    @Id
    @GeneratedValue
    private int id;

    private String species;

    private String origin;

    private Integer age;

    public enum Sex {
        MALE, FEMALE
    }

    @Enumerated(EnumType.STRING)
    private Sex sex;

    private String description;
}
