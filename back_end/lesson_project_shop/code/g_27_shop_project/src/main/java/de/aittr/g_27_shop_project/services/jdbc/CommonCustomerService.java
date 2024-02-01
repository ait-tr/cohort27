package de.aittr.g_27_shop_project.services.jdbc;

import de.aittr.g_27_shop_project.domain.interfaces.Customer;
import de.aittr.g_27_shop_project.repositories.interfaces.CustomerRepository;
import de.aittr.g_27_shop_project.services.interfaces.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class CommonCustomerService implements CustomerService {

    private CustomerRepository repository;

    public CommonCustomerService(CustomerRepository repository) {
        this.repository = repository;
    }

    @Override
    public Customer save(Customer customer) {

        if (customer == null) {
            throw new IllegalArgumentException("Сохраняемый покупатель не может быть null.");
        }

        if (customer.getName() == null || customer.getName().isEmpty()) {
            throw new IllegalArgumentException("Имя сохраняемого покупателя не может быть пустым.");
        }

        return repository.save(customer);
    }

    @Override
    public List<Customer> getAllActiveCustomers() {
        List<Customer> customers = repository.getAll();

        if (customers.isEmpty()) {
            throw new NoSuchElementException("В базе данных нет покупателей");
        }

        return customers;
    }

    @Override
    public Customer getActiveCustomerById(int id) {
        return null;
    }

    @Override
    public void update(Customer customer) {

    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    public void restoreById(int id) {

    }

    @Override
    public int getActiveCustomersCount() {
        return 0;
    }

    @Override
    public double getTotalCartPriceById(int customerId) {
        return 0;
    }

    @Override
    public double getAveragePriceById(int customerId) {
        return 0;
    }

    @Override
    public void addProductToCart(int customerId, int productId) {

    }

    @Override
    public void deleteProductFromCart(int customerId, int productId) {

    }

    @Override
    public void clearCartById(int customerId) {

    }
}