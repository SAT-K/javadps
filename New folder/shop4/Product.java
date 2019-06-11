import java.text.SimpleDateFormat;
import java.util.Date;

public class Product {
	private String name,productCode,brandName;
	private int stockLeft;
	private double price;
	private Date expiryDate;
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
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public Product() {
		
	}
	SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
	public Product(String name, String productCode, String brandName, int stockLeft, double price, Date expiryDate) {
		super();
		this.name = name;
		this.productCode = productCode;
		this.brandName = brandName;
		this.stockLeft = stockLeft;
		this.price = price;
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		System.out.format("%-15s %-15s %-12s %-12s %-7s %s\n",name,productCode,brandName,stockLeft,price,formatter.format(expiryDate));
		return "";
	}
	
	
	
}
