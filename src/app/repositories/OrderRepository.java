package app.repositories;

import app.models.Order;

import java.util.HashMap;
import java.util.Map;

public class OrderRepository {

    private Map<Integer, Order> orders;

    public OrderRepository() {
        this.orders = new HashMap<>();
    }

    public void addOrder(Order order) {
        this.orders.putIfAbsent(order.getId(), order);
    }
}
