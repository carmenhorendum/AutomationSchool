package utils;

import java.io.*;

public class IOFileReader {

	public static void getFileInfo() {
		System.out.println("Info Written to File\n");
		File listOfProducts = new File("/Users/DzianisWin7/Documents/products.txt");
		try {
			BufferedReader getInfo = new BufferedReader(new FileReader(listOfProducts));
			String productInfo = getInfo.readLine();
			while (productInfo != null) {
				System.out.println(productInfo);
				String[] singleProductData = productInfo.split(" ");
				int productPrice = Integer.parseInt(singleProductData[2]);
				System.out.print("Product" + singleProductData[0] + "is" + productPrice + "\n");
				productInfo = getInfo.readLine();
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			System.exit(0);
		} catch (IOException e) {
			System.out.println("An I/O Error Occurred");
			System.exit(0);
		}
	}
}
