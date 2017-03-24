package by.bsuir.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import by.bsuir.representations.Order;

public interface OrderDao  extends JpaRepository<Order, Long> {

}
