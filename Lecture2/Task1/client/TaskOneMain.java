package client;

import product.Product;
import product.StockManager;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TaskOneMain {
	public static void main(String[] args) {
		List<Product> products = new ArrayList<>();
		List<Product> newStock = StockManager.getGuitarsToStock(products);
		System.out.println(newStock);
		System.out.println(getStockPrice(newStock));
		System.out.println(getSortByPrice(newStock));
		System.out.println(getSortByStringsCount(newStock));
		System.out.println(getProductByParameters(newStock));
	}

	private static double getStockPrice(List<Product> products) {
		return products.stream().mapToDouble(Product::getPrice).sum();
	}

	private static List<Product> getSortByPrice(List<Product> products) {
		Comparator<Product> byPrice = Comparator.comparing(Product::getPrice);
		return products.stream().sorted(byPrice).collect(Collectors.toList());
	}

	private static List<Product> getSortByStringsCount(List<Product> products) {
		Comparator<Product> byStringsCount
				= Comparator.comparingInt((Product product) -> product.getGuitar().getStringsCount());
		return products.stream().sorted(byStringsCount).collect(Collectors.toList());
	}

	private static List<Product> getProductByParameters(List<Product> products) {
		return products.stream()
				.filter(product -> (product.getPrice() < 2000))
				.filter(product -> (product.getWarranty() > 12))
				.collect(Collectors.toList());
	}
}
