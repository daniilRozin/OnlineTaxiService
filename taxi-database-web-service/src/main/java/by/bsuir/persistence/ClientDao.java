package by.bsuir.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import by.bsuir.representations.Client;

public interface ClientDao  extends JpaRepository<Client, Long>{

}
