package de.aittr.g_27_shop_project.domain.jpa;

import jakarta.persistence.*;

import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "task")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "description")
    private String description;

    @Column(name = "executed_at")
    private Timestamp executedAt;

    public Task() {
        executedAt = new Timestamp(System.currentTimeMillis());
    }

    public Task(String description) {
        this.description = description;
        executedAt = new Timestamp(System.currentTimeMillis());
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return id == task.id && Objects.equals(description, task.description) && Objects.equals(executedAt, task.executedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, description, executedAt);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", executedAt=" + executedAt +
                '}';
    }
}