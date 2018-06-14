package app.repositories;

import app.models.Order;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class OrderRepository {

    private Map<Integer, Order> orders;

    public OrderRepository() {
        this.orders = new HashMap<>();
    }

    public void addOrder(Order order) {
        this.orders.putIfAbsent(order.getId(), order);
    }

    public Set<Order> findAllOrders() {
        return new HashSet<>(this.orders.values());
    }
}
