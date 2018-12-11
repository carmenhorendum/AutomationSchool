package product;

import utils.RandomUtils;

import java.util.Set;

public class StockManager {

	private Stock stock;

	public StockManager(Stock stock) {
		this.stock = stock;
	}

	public void initStock() {
		stock.addGuitars(GuitarFactory.createGuitars(RandomUtils.getAmount()));
	}

	public Set<Product> getConsignment(Brand brand, int amount) {
		return ProductFactory.createProducts(stock, brand, amount);
	}
}
