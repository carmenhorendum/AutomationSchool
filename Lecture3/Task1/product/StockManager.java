package product;

import utils.RandomUtils;

import java.util.List;

public class StockManager {

	private Stock stock;

	public StockManager(Stock stock) {
		this.stock = new Stock();
	}

	public void initStock() {
		stock.addGuitars(GuitarFactory.createGuitars(RandomUtils.getAmount()));
	}

	public List<Product> getConsignment(Type type, int amount) {
		return ProductFactory.createProducts(stock, RandomUtils.getType(), RandomUtils.getAmount());
	}
}
