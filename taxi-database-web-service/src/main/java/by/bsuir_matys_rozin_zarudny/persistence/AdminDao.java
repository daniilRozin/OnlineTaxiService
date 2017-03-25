package by.bsuir.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import by.bsuir.representations.Admin;

public interface AdminDao  extends JpaRepository<Admin, Long> {

}
