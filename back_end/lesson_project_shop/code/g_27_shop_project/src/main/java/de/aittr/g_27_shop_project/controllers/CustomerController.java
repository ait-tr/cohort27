package de.aittr.g_27_shop_project.controllers;

import de.aittr.g_27_shop_project.domain.dto.CustomerDto;
import de.aittr.g_27_shop_project.domain.jdbc.CommonCustomer;
import de.aittr.g_27_shop_project.domain.interfaces.Customer;
import de.aittr.g_27_shop_project.services.interfaces.CustomerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerService service;

    public CustomerController(CustomerService service) {
        this.service = service;
    }

    @PostMapping
    public CustomerDto save(@RequestBody CustomerDto customer) {
        return service.save(customer);
    }

    @GetMapping
    public List<CustomerDto> getAll() {
        return service.getAllActiveCustomers();
    }
}