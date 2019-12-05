package mk.finki.ukim.mk.lab.service.impl;

import mk.finki.ukim.mk.lab.model.Pizza;
import mk.finki.ukim.mk.lab.model.exceptions.InvalidPizzaException;
import mk.finki.ukim.mk.lab.repository.PizzaRepository;
import mk.finki.ukim.mk.lab.service.PizzaService;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class PizzaServiceImpl implements PizzaService {
    private PizzaRepository repo;

    public PizzaServiceImpl(PizzaRepository repo){

        this.repo = repo;
    }

    @Override
    public List<Pizza> listPizzas() {
        return repo.findAll();
    }

    @Override
    public Pizza postPizza(Pizza pizza) {
        return repo.saveAndFlush(pizza);
    }

    @Override
    public Pizza putPizza(String id, Pizza pizza) {
        Pizza current = repo.getOne(id);
        current.setDescription(pizza.getDescription());
        current.setIngredients(pizza.getIngredients());
        current.setVeggie(pizza.getVeggie());
        return repo.saveAndFlush(current);
    }

    @Override
    public Boolean deletePizza(String id) {
        repo.deleteById(id);
        return true;
    }

    @Override
    public Pizza getPizzaById(String id) {
        return repo.findById(id).orElseThrow(() -> new InvalidPizzaException("No such Pizza"));
    }


}
