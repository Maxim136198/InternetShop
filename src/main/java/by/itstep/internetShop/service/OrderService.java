package by.itstep.internetShop.service;

import by.itstep.internetShop.dao.entity.Order;

import java.time.LocalDateTime;
import java.util.List;

public interface OrderService {
    Order save(Order order);

    void deleteById(Long id);

    void deleteByDateOfPurchases(LocalDateTime dateOfPurchases);

    Order updateOrder(Order order);

    List<Order> findAll();

    Order findById(Long id);


}