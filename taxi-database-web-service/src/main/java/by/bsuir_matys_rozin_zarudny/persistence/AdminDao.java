package by.bsuir_matys_rozin_zarudny.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import by.bsuir_matys_rozin_zarudny.representations.Admin;

public interface AdminDao  extends JpaRepository<Admin, Long> {

}
