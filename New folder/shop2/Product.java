import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
   private String name;
    private String productCode;
  private  String brandName;
   private int stockLeft;
  private  double price;
   private Date expirydate;
   SimpleDateFormat fr=new SimpleDateFormat("dd-MM-yyyy");
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getProductCode() {
	return productCode;
}

public void setProductCode(String productCode) {
	this.productCode = productCode;
}

public String getBrandName() {
	return brandName;
}

public void setBrandName(String brandName) {
	this.brandName = brandName;
}

public int getStockLeft() {
	return stockLeft;
}

public void setStockLeft(int stockLeft) {
	this.stockLeft = stockLeft;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public Date getExpirydate() {
	return expirydate;
}

public void setExpirydate(Date expirydate) {
	this.expirydate = expirydate;
}

	public Product() {
	super();
}

	public Product(String name, String productCode, String brandName, int stockLeft, double price, Date expirydate) {
	super();
	this.name = name;
	this.productCode = productCode;
	this.brandName = brandName;
	this.stockLeft = stockLeft;
	this.price = price;
	this.expirydate = expirydate;
}

	public static Product createProduct(String product) throws NumberFormatException, ParseException{
		String s[]=product.split(",");
		SimpleDateFormat fr=new SimpleDateFormat("dd-MM-yyyy");
		Product obj=new Product(s[0],s[1],s[2],Integer.parseInt(s[3]),Double.parseDouble(s[4]),fr.parse(s[5]));
		//System.out.println(s[5]);
		return obj;
	
	}

	@Override
	public String toString() {
		System.out.format("%-15s %-15s %-12s %-12s %-7s %s",name,productCode,brandName,stockLeft,price,fr.format(expirydate));
	return "";
	}
	
}
