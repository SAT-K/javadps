import java.util.ArrayList;
import java.util.List;

public class Shop {
	String name;
	List<Product> productList=new ArrayList<Product>();
	
	public Shop() {
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public void setProductList(List<Product> productList) {
		this.productList = productList;
	}

	public Shop(String name, List<Product> productList) {
		super();
		this.name = name;
		this.productList = productList;
	}

	public void addProductToShop(Product product){
	 productList.add(product);
	 //System.out.println("" +productList);
	}
	
	public Boolean removeProductFromShop(String productCode){
		Boolean b=new Boolean(false);
		for(Product p : productList){
			if(p.getProductCode().equals(productCode) ){
				
				productList.remove(p);
				//productList.remove(productList.get(p.g));
				return true;
			}
				
			
		}
		return b;
	}
	public void displayProducts(){
		if(productList.size()==0)
			System.out.println("No products to show");
		else
		{
			System.out.println("Products in "+name);
			System.out.format("%-15s %-15s %-12s %-12s %-7s %s\n","Name","Product code","Brand name"
					, "Stock left","Price","Expiry date");
			for(Product p : productList)
				System.out.println(p.toString());
		}
	}
}
