import java.util.ArrayList;
import java.util.List;

public class ProductBO {
	public List<Product> findProduct(List<Product> ProductList,String brandName){
		List<Product> search=new ArrayList<Product>();
		for(Product v:ProductList)
		{
			if(v.getBrandName().equalsIgnoreCase(brandName))
				search.add(v);
		}
		return search;
	}
	
	public List<Product> findProduct(List<Product> ProductList,Double price){
		List<Product> search=new ArrayList<Product>();
	
		for(Product v:ProductList)
		{
			if(v.getPrice()==price)
				search.add(v);
			}
		
		return search;
	}

}
