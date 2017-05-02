package spd.spring.camp.team3.animal;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.NotNull;

@Getter
@Setter
public class AnimalForm {

    @NotNull
    @NotEmpty
    private String species;

    @NotNull
    @NotEmpty
    private String origin;

    @NotNull
    @NotEmpty
    private Integer age;

    @NotNull
    @NotEmpty
    private Animal.Sex sex;

    @NotNull
    @NotEmpty
    private String description;

    public Animal toAnimal() {
        Animal animal = new Animal();
        animal.setSpecies(species);
        animal.setOrigin(origin);
        animal.setAge(age);
        animal.setSex(sex);
        animal.setDescription(description);
        return animal;
    }
}
