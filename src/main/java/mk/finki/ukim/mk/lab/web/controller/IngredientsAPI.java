package mk.finki.ukim.mk.lab.web.controller;

import mk.finki.ukim.mk.lab.model.Ingredient;
import mk.finki.ukim.mk.lab.service.IngredientService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class IngredientsAPI {

    private IngredientService service;

    public IngredientsAPI(IngredientService service){
        this.service = service;
    }

    @PostMapping("/ingredients")
    public Ingredient postIngredients(@RequestBody Ingredient ingredient){
        return service.postIngredient(ingredient);
    }

    @PatchMapping("/ingredients/{id}")
    public Ingredient patchIngredient(@PathVariable String id, @RequestBody Ingredient ingredient){
        return service.patchIngredient(id, ingredient);
    }

    @DeleteMapping("/ingredients/{id}")
    public Boolean deleteIngredient(@PathVariable String id){
        return service.deleteIngredient(id);
    }

    @GetMapping("/ingredients")
    public List<Ingredient> listIngredients(){
        return service.listIngredients().getContent();
    }

    @GetMapping("/ingredients/{id}")
    public Ingredient getIngredientById(@PathVariable String id){
        return service.getIngredientById(id);
    }
}
