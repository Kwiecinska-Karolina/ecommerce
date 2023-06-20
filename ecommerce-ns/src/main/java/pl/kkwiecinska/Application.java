package pl.kkwiecinska;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.kkwiecinska.catalog.HashMapProductStorage;
import pl.kkwiecinska.catalog.ProductCatalog;

import java.math.BigDecimal;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    ProductCatalog createCatalog() {
        ProductCatalog productCatalog = new ProductCatalog(new HashMapProductStorage());
        String id =  productCatalog.createProduct("Lego");
        productCatalog.changePrice(id, BigDecimal.valueOf(10.10));
        productCatalog.publish(id);

        return productCatalog;
    }
}
