package by.bsuir_matys_rozin_zarudny.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import by.bsuir_matys_rozin_zarudny.representations.Car;

public interface CarDao extends JpaRepository<Car, Long> {

}
