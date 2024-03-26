package de.aittr.g_27_jwt.repository;

import de.aittr.g_27_jwt.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    User findByUsername(String username);
}