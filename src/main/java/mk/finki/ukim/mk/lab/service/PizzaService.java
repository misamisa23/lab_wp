package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.listener.Listen;
import mk.finki.ukim.mk.lab.model.Pizza;

import java.util.List;

public interface PizzaService {
    @Listen
    List<Pizza> listPizzas();
}
