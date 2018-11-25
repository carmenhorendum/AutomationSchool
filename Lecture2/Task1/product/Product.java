package product;

import builder.Guitar;

public class Product {
	private Guitar guitar;
	private double price;
	private int warranty;

	public Product(Guitar guitar, double price, int warranty) {
		this.guitar = guitar;
		this.price = price;
		this.warranty = warranty;
	}

	public Product(Guitar guitar) {
		this.guitar = guitar;
	}

	public Guitar getGuitar() {
		return guitar;
	}

	public void setGuitar(Guitar guitar) {
		this.guitar = guitar;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getWarranty() {
		return warranty;
	}

	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}

	@Override
	public String toString() {
		return "Product{"
				+ guitar +
				", price: 'USD" + price + '\'' +
				", " + warranty + "-months warranty}";
	}
}
