package builder;

import exceptions.UnmatchedPaletteException;
import product.Brand;

import java.util.Objects;

public abstract class Guitar {
	private Brand brand;
	private String color;
	private int stringsCount;

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) throws UnmatchedPaletteException {
		if (color.equals("dark-light")) {
			throw new UnmatchedPaletteException("There is no such color in palette");
		} else {
			this.color = color;
		}
	}

	public int getStringsCount() {
		return stringsCount;
	}

	public void setStringsCount(int stringsCount) {
		this.stringsCount = stringsCount;
	}

	public void play() {
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Guitar guitar = (Guitar) o;
		return stringsCount == guitar.stringsCount &&
				brand == guitar.brand &&
				Objects.equals(color, guitar.color);
	}

	@Override
	public int hashCode() {

		return Objects.hash(brand, color, stringsCount);
	}

	@Override
	public String toString() {
		return "Guitar{"
				+ brand + "#" + hashCode() +
				", color='" + color + '\'' +
				", " + stringsCount + "-string" +
				'}';
	}
}
