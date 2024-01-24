package de.aittr.g_27_shop_project.services.jdbc;

import de.aittr.g_27_shop_project.domain.dto.ProductDto;
import de.aittr.g_27_shop_project.domain.interfaces.Product;
import de.aittr.g_27_shop_project.repositories.interfaces.ProductRepository;
import de.aittr.g_27_shop_project.services.interfaces.ProductService;
import de.aittr.g_27_shop_project.services.mapping.ProductMappingService;

import java.util.List;
import java.util.NoSuchElementException;

//@Service
public class CommonProductService implements ProductService {

    private ProductRepository repository;
    private ProductMappingService mappingService;

    public CommonProductService(ProductRepository repository, ProductMappingService mappingService) {
        this.repository = repository;
        this.mappingService = mappingService;
    }

    @Override
    public ProductDto save(ProductDto product) {

        if (product == null) {
            throw new IllegalArgumentException("Сохраняемый продукт не может быть null.");
        }

        if (product.getName() == null || product.getName().isEmpty()) {
            throw new IllegalArgumentException("Имя сохраняемого продукта не может быть пустым.");
        }

        if (product.getPrice() <= 0) {
            throw new IllegalArgumentException("Цена сохраняемого продукта не может быть отрицательной либо равной нулю.");
        }

        Product entity = mappingService.mapDtoToCommonProduct(product);
        entity = repository.save(entity);
        return mappingService.mapEntityToDto(entity);
    }

    @Override
    public List<ProductDto> getAllActiveProducts() {
        List<Product> products = repository.getAll();

        if (products.isEmpty()) {
            throw new NoSuchElementException("В базе данных нет продуктов");
        }

        return products.stream().map(x -> mappingService.mapEntityToDto(x)).toList();
    }

    @Override
    public ProductDto getActiveProductById(int id) {
        return null;
    }

    @Override
    public void update(ProductDto product) {

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
    public int getActiveProductsCount() {
        return 0;
    }

    @Override
    public double getActiveProductsTotalPrice() {
        return 0;
    }

    @Override
    public double getActiveProductsAveragePrice() {
        return 0;
    }
}