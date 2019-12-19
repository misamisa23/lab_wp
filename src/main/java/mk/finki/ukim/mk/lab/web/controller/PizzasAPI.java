package mk.finki.ukim.mk.lab.web.controller;

import mk.finki.ukim.mk.lab.model.Pizza;
import mk.finki.ukim.mk.lab.service.PizzaService;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "htpp://localhost:3000")
@RestController
public class PizzasAPI {
    private PizzaService service;

    public PizzasAPI(PizzaService service){
        this.service = service;
    }

    @PostMapping("/pizzas")
    public Pizza postPizzas(@RequestBody Pizza pizza){
        return service.postPizza(pizza);
    }

    @PutMapping("/pizzas/{id}")
    public Pizza putPizza(@PathVariable String id, @RequestBody Pizza pizza){
        return service.putPizza(id, pizza);
    }

    @DeleteMapping("/pizzas/{id}")
    public Boolean deletePizza(@PathVariable String id){
        return service.deletePizza(id);
    }

    @GetMapping("/pizzas")
    public List<Pizza> listPizzas(){
        return service.listPizzas();
    }

    @GetMapping("/pizzas/{id}")
    public Pizza getPizzaById(@PathVariable String id){

        return service.getPizzaById(id);
    }
}
