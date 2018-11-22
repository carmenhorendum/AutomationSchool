package builder;

import exceptions.UnmatchedPaletteException;
import product.Brand;

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
	public String toString() {
		return "Guitar{"
				+ brand +
				", color='" + color + '\'' +
				", " + stringsCount + "-string" +
				'}';
	}
}
