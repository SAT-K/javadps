import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
	public static void main(String args[]) throws IOException, ParseException, NumberFormatException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		System.out.print("Enter Product 1 details:");
		String str = reader.readLine();
		String[] str1 = str.split(",", 6);
		String name = str1[0];
		String productCode = str1[1];
		String brandName = str1[2];
		int stockLeft = Integer.parseInt(str1[3]);
		double price = Double.parseDouble(str1[4]);
		Date d = sdf.parse(str1[5]);
		Product prod1 = new Product(name, productCode, brandName, stockLeft, price, d);
		System.out.println("\nEnter Product 2 details:");
		String s = reader.readLine();
		String[] s1 = s.split(",", 6);
		String name1 = s1[0];
		String productCode1 = s1[1];
		String brandName1 = s1[2];
		int stockLeft1 = Integer.parseInt(s1[3]);
		double price1 = Double.parseDouble(s1[4]);
		Date d1 = sdf.parse(s1[5]);
		Product prod2 = new Product(name1, productCode1, brandName1, stockLeft1, price1, d1);
		System.out.println("\nProduct 1\n");
		System.out.println(prod1);
		System.out.println("\nProduct 2\n");
		System.out.println(prod2);
		if (prod1.getName().toLowerCase().equals(prod2.getName().toLowerCase())
				&& prod1.getProductCode().toLowerCase().equals(prod2.getProductCode().toLowerCase())) {
			System.out.println("\nProduct 1 is same as Product 2");
		} else {
			System.out.println("\nProduct 1 and Product 2 are different");
		}
	}
}
