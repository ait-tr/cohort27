package de.aittr.g_27_shop_project.services.jpa;

import de.aittr.g_27_shop_project.domain.jpa.Task;
import de.aittr.g_27_shop_project.repositories.jpa.TaskRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class TaskService {

    private TaskRepository repository;
    private Logger logger = LoggerFactory.getLogger(TaskService.class);

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public void createTask(String description) {
        Task task = new Task(description);
        logger.info(description);
        repository.save(task);
    }
}