package de.aittr.g_27_jwt.repository;

import de.aittr.g_27_jwt.domain.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {

    Role findByName(String name);
}