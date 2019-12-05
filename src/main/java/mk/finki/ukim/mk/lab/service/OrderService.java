package mk.finki.ukim.mk.lab.service;

import mk.finki.ukim.mk.lab.listener.Listen;
import mk.finki.ukim.mk.lab.model.Order;

public interface OrderService {
    @Listen
    Order placeOrder(String pizzaType, String pizzaSize, String clientName, String address);
}
