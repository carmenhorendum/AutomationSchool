import java.util.ArrayList;
import java.util.List;

public class TaskOneMain {
	public static void main(String[] args) {
		GuitarBuilder gtrBuilder = new GuitarBuilder();
		GuitarBuilderDirector gtrBuilderDirector = new GuitarBuilderDirector();

		Guitar bassGuitar = gtrBuilderDirector.buildBassGuitar(gtrBuilder);
		System.out.println(bassGuitar);

		Guitar electricGuitar = gtrBuilderDirector.buildElectricGuitar(gtrBuilder);
		System.out.println(electricGuitar);

		List<Product> products = new ArrayList<>();
		products.add(new Product("Ibanez", "749.99"));
		products.add(new Product("Fernandes", "535.99"));
		products.add(new Product("Fender", "1200"));
		products.add(new Product("Gibson", "2300"));
		products.add(new Product("Strandberg", "2700"));

		System.out.println(products);
	}
}
