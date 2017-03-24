package by.bsuir.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import by.bsuir.representations.Car;

public interface CarDao extends JpaRepository<Car, Long> {

}
