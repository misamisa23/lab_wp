package mk.finki.ukim.mk.lab.model;
import lombok.*;

import javax.persistence.Entity;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Pizzas")
public class Pizza {
    private String name;
    private String description;
    private List<Ingredient> ingredients;
    private Boolean veggie;
}
