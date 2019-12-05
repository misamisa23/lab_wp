package mk.finki.ukim.mk.lab.model;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Ingredients")
public class Ingredient {
    @Id
    private String name;
    private Boolean spicy;
    private Float amount;
    private Boolean veggie;
}
