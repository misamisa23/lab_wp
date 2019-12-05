package mk.finki.ukim.mk.lab.model;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity(name="Pizzas")
public class Pizza {
    @Id
    private String name;
    private String description;
    @ManyToMany
    private List<Ingredient> ingredients;
    private Boolean veggie;
}
