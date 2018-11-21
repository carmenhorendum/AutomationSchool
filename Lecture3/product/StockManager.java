package product;

import java.util.ArrayList;
import java.util.List;

public class StockManager {

    public static List<Product> getProductsToStock() {
        List<Product> products = new ArrayList<>();
        for (int i = 0; i < Type.values().length; i++) {
            ProductFactory.createProducts(products);
        }
        return products;
    }
}
