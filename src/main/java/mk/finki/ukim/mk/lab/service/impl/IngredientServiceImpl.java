package mk.finki.ukim.mk.lab.service.impl;

import mk.finki.ukim.mk.lab.model.Ingredient;
import mk.finki.ukim.mk.lab.repository.IngredientRepository;
import mk.finki.ukim.mk.lab.service.IngredientService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class IngredientServiceImpl implements IngredientService {

    private IngredientRepository repo;

    public IngredientServiceImpl(IngredientRepository repo){
        this.repo = repo;
    }

    @Override
    public Ingredient postIngredient(Ingredient ingredient) {

        return repo.saveAndFlush(ingredient);

    }

    @Override
    public Ingredient patchIngredient(String id, Ingredient ingredient) {
        Ingredient current = repo.getOne(id);
        current.setAmount(ingredient.getAmount());
        current.setSpicy(ingredient.getSpicy());
        current.setVeggie(ingredient.getVeggie());
        return repo.saveAndFlush(current);
    }

    @Override
    public Boolean deleteIngredient(String id) {
        repo.deleteById(id);
        return true;
    }

    @Override
    public Page<Ingredient> listIngredients() {

       Pageable page = PageRequest.of(0, 10, Sort.by("name").descending());

        return repo.findAll(page);
    }

    @Override
    public Ingredient getIngredientById(String id) {
        return repo.findById(id).get();
    }

}
