package by.bsuir.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import by.bsuir.representations.Adress;

public interface AdressDao extends JpaRepository<Adress, Long> {

}
