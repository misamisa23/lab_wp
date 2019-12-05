package mk.finki.ukim.mk.lab.repository;
import mk.finki.ukim.mk.lab.model.Pizza;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public interface PizzaRepository {
    List<Pizza> pizzalist = Arrays.asList(
            new Pizza("Capriciosa", "Capriciosa - ham, cheese, mushrooms, sauce, oregano"),
            new Pizza("Pepperoni", "Pepperoni - pepperoni, cheese, sauce"),
            new Pizza("Margherita", "Margherita - cheese, sauce"),
            new Pizza("Flambee", "Flambee - cheese, sauce, bacon, eggs"),
            new Pizza("Veggie", "Veggie - veggies, cheese, sauce"),
            new Pizza("Quattro Formagie", "Quattro Formagie - 4 types of cheese"),
            new Pizza("Quattro Staggione", "Quattro Staggione - 4 types of meat"),
            new Pizza("Alpoia", "Alpoia - herbs, garlic, cheese, sauce"),
            new Pizza("Hawaiian", "Hawaiian - cheese, sauce, pineapple"),
            new Pizza("Vegan", "Vegan - veggies")
            );
    public List<Pizza> getAllPizzas();
}
