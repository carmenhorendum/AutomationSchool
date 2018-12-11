package product;

import exceptions.OutOfPriceRangeException;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Filter {
	public static double getStockPrice(Set<Product> products) throws OutOfPriceRangeException {
		if (products.stream().mapToDouble(Product::getPrice).sum() > 30000) {
			throw new OutOfPriceRangeException("This order is too expensive for our budget: $"
					+ products.stream().mapToDouble(Product::getPrice).sum());
		}
		return products.stream().mapToDouble(Product::getPrice).sum();
	}

	public static List<Product> getSortByPrice(Set<Product> products) {
		Comparator<Product> byPrice = Comparator.comparing(Product::getPrice);
		return products.stream().sorted(byPrice).collect(Collectors.toList());
	}

	public static List<Product> getSortByStringsCount(Set<Product> products) {
		Comparator<Product> byStringsCount
				= Comparator.comparingInt((Product product) -> product.getGuitar().getStringsCount());
		return products.stream().sorted(byStringsCount).collect(Collectors.toList());
	}

	public static List<Product> getProductByParameters(Set<Product> products) {
		return products.stream()
				.filter(product -> (product.getPrice() < 2000))
				.filter(product -> (product.getWarranty() > 12))
				.collect(Collectors.toList());
	}
}
