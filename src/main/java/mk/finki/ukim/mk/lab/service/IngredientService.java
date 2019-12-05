package mk.finki.ukim.mk.lab.service;


import mk.finki.ukim.mk.lab.model.Ingredient;
import org.springframework.data.domain.Page;

public interface IngredientService {

    Ingredient postIngredient(Ingredient ingredient);

    Ingredient patchIngredient(String id, Ingredient ingredient);

    Boolean deleteIngredient(String id);

    Page<Ingredient> listIngredients();

    Ingredient getIngredientById(String id);
}
