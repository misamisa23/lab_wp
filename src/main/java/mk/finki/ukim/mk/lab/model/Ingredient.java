package mk.finki.ukim.mk.lab.model;
import lombok.*;

import javax.persistence.Entity;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Ingredients")
public class Ingredient {
    private String name;
    private Boolean spicy;
    private Float amount;
    private Boolean veggie;
}
