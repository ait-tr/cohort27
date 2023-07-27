package repositories;

import models.Pizza;

import java.util.List;

/**
 * 7/27/2023
 * PizzaProject
 *
 * @author Marsel Sidikov (AIT TR)
 */
public interface PizzaRepository {
    List<Pizza> findAll();
}
