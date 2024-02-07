package de.aittr.g_27_security.repositories;

import de.aittr.g_27_security.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}