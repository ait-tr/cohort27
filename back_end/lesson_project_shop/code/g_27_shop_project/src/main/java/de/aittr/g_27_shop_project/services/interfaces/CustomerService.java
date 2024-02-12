package de.aittr.g_27_shop_project.services.interfaces;

import de.aittr.g_27_shop_project.domain.dto.CustomerDto;
import de.aittr.g_27_shop_project.domain.interfaces.Customer;

import java.util.List;

public interface CustomerService {

    CustomerDto save(CustomerDto customer);

    List<CustomerDto> getAllActiveCustomers();

    CustomerDto getActiveCustomerById(int id);

    void update(CustomerDto customer);

    void deleteById(int id);

    void deleteByName(String name);

    void restoreById(int id);

    int getActiveCustomersCount();

    double getTotalCartPriceById(int customerId);

    double getAveragePriceById(int customerId);

    void addProductToCart(int customerId, int productId);

    void deleteProductFromCart(int customerId, int productId);

    void clearCartById(int customerId);
}