package de.aittr.g_27_shop_project.repositories.jpa;

import de.aittr.g_27_shop_project.domain.jpa.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}