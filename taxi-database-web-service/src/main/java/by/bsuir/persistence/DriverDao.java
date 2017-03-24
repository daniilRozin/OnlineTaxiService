package by.bsuir.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import by.bsuir.representations.Driver;

public interface DriverDao  extends JpaRepository<Driver, Long> {

}
