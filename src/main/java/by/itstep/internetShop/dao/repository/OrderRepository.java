package by.itstep.internetShop.dao.repository;

import by.itstep.internetShop.dao.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.time.LocalDateTime;
import java.util.List;


@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    List<Order> findAll();

    boolean deleteByDateOfPurchase(LocalDateTime dateOfPurchase);




}

