package product;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static double getStockPrice(List<Product> products) {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }

    public static List<Product> getSortByPrice(List<Product> products) {
        Comparator<Product> byPrice = Comparator.comparing(Product::getPrice);
        return products.stream().sorted(byPrice).collect(Collectors.toList());
    }

    public static List<Product> getSortByStringsCount(List<Product> products) {
        Comparator<Product> byStringsCount
                = Comparator.comparingInt((Product product) -> product.getGuitar().getStringsCount());
        return products.stream().sorted(byStringsCount).collect(Collectors.toList());
    }

    public static List<Product> getProductByParameters(List<Product> products) {
        return products.stream()
                .filter(product -> (product.getPrice() < 2000))
                .filter(product -> (product.getWarranty() > 12))
                .collect(Collectors.toList());
    }
}
