package de.aittr.g_27_shop_project.repositories.interfaces;

import de.aittr.g_27_shop_project.domain.interfaces.Customer;

import java.util.List;

public interface CustomerRepository {

    Customer save(Customer customer);

    List<Customer> getAll();

    Customer getById(int id);

    Customer update(Customer customer);

    void deleteById(int id);
}