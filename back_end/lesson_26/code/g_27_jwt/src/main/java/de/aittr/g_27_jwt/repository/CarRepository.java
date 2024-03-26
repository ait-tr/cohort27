package de.aittr.g_27_jwt.repository;

import de.aittr.g_27_jwt.domain.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {
}