package mk.finki.ukim.mk.lab.service.impl;

import mk.finki.ukim.mk.lab.listener.Listen;
import mk.finki.ukim.mk.lab.model.Pizza;
import mk.finki.ukim.mk.lab.repository.PizzaRepository;
import mk.finki.ukim.mk.lab.service.PizzaService;
import org.springframework.stereotype.Service;

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


}
