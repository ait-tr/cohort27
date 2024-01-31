package de.aittr.g_27_shop_project.services.jpa;

import de.aittr.g_27_shop_project.domain.dto.ProductDto;
import de.aittr.g_27_shop_project.domain.jpa.JpaProduct;
import de.aittr.g_27_shop_project.exception_handling.exceptions.FourthTestException;
import de.aittr.g_27_shop_project.exception_handling.exceptions.ThirdTestException;
import de.aittr.g_27_shop_project.repositories.jpa.JpaProductRepository;
import de.aittr.g_27_shop_project.services.interfaces.ProductService;
import de.aittr.g_27_shop_project.services.mapping.ProductMappingService;
import jakarta.transaction.Transactional;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JpaProductService implements ProductService {

    private JpaProductRepository repository;
    private ProductMappingService mappingService;
//    private Logger logger = LogManager.getLogger(JpaProductService.class);
    private Logger logger = LoggerFactory.getLogger(JpaProductService.class);

    public JpaProductService(JpaProductRepository repository, ProductMappingService mappingService) {
        this.repository = repository;
        this.mappingService = mappingService;
    }

    @Override
    public ProductDto save(ProductDto product) {
        try {
            JpaProduct entity = mappingService.mapDtoToEntity(product);
            entity.setId(0);
            entity = repository.save(entity);
            return mappingService.mapEntityToDto(entity);
        } catch (Exception e) {
            throw new FourthTestException(e.getMessage());
        }
    }

    @Override
    public List<ProductDto> getAllActiveProducts() {
        return repository.findAll()
                .stream()
                .filter(x -> x.isActive())
                .map(x -> mappingService.mapEntityToDto(x))
                .toList();
    }

    @Override
    public ProductDto getActiveProductById(int id) {

//        logger.log(Level.INFO, String.format("Запрошен продукт с ИД %d.", id));
//        logger.log(Level.WARN, String.format("Запрошен продукт с ИД %d.", id));
//        logger.log(Level.ERROR, String.format("Запрошен продукт с ИД %d.", id));

//        logger.info(String.format("Запрошен продукт с ИД %d.", id));
//        logger.warn(String.format("Запрошен продукт с ИД %d.", id));
//        logger.error(String.format("Запрошен продукт с ИД %d.", id));

        JpaProduct product = repository.findById(id).orElse(null);

        if (product != null && product.isActive()) {
            return mappingService.mapEntityToDto(product);
        }

        throw new ThirdTestException("Продукт с указанным ИД отсутствует в БД.");
    }

    @Override
    public void update(ProductDto product) {
        JpaProduct entity = mappingService.mapDtoToEntity(product);
        repository.save(entity);
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void deleteByName(String name) {

    }

    @Override
    @Transactional
    public void restoreById(int id) {
        JpaProduct product = repository.findById(id).orElse(null);

        if (product != null) {
            product.setActive(true);
        }
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