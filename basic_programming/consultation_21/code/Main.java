import models.Pizza;
import repositories.PizzaRepository;
import repositories.PizzaRepositoryCsvFileImpl;

import java.util.List;

/**
 * 7/27/2023
 * PizzaProject
 *
 * @author Marsel Sidikov (AIT TR)
 */
public class Main {
    public static void main(String[] args) {
        PizzaRepository pizzaRepository = new PizzaRepositoryCsvFileImpl("resources/pizza.txt");
        List<Pizza> pizzas = pizzaRepository.findAll();

        System.out.println(pizzas);
    }
}
