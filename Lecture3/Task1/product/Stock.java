package product;

import builder.Guitar;

import java.util.ArrayList;
import java.util.List;

public class Stock {
	private List<Guitar> guitars = new ArrayList<>();

	public void addGuitars(List<Guitar> guitars) {
		guitars.addAll(guitars);
	}

	public List<Guitar> getGuitars() {
		return guitars;
	}
}
