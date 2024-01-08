package de.aittr.g_27_shop_project.services;

import de.aittr.g_27_shop_project.domain.interfaces.Product;
import de.aittr.g_27_shop_project.repositories.interfaces.ProductRepository;
import de.aittr.g_27_shop_project.services.interfaces.ProductService;
import org.springframework.stereotype.Service;

@Service
public class CommonProductService implements ProductService {

    private ProductRepository repository;

    public CommonProductService(ProductRepository repository) {
        this.repository = repository;
    }

    @Override
    public Product save(Product product) {

        if (product == null) {
            throw new IllegalArgumentException("Сохраняемый продукт не может быть null.");
        }

        if (product.getName() == null || product.getName().isEmpty()) {
            throw new IllegalArgumentException("Имя сохраняемого продукта не может быть пустым.");
        }

        if (product.getPrice() <= 0) {
            throw new IllegalArgumentException("Цена сохраняемого продукта не может быть отрицательной либо равной нулю.");
        }

        return repository.save(product);
    }
}