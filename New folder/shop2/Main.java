import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the name of the Shop:");
			String refid=new String(br.readLine());
			Shop t=new Shop();
			t.setName(refid);
		
		List<Product> al=new ArrayList<Product>();

      	do
			{
				System.out.println("1.Add Product\n2.Delete Product\n3.Display Products\n4.Exit\nEnter your choice:");
				int n=Integer.parseInt(br.readLine());
				//Seat seat[]=new Seat[2];
				switch(n)
				{
					case 1:
						{
							String details=br.readLine();
							Product product=Product.createProduct(details);
							if(product!=null)
							{
								t=new Shop(refid,al);
								t.addProductToShop(product);
								System.out.println("Product successfully added");
							}
						}
					break;
					case 2:
						{
							System.out.println("Enter the productCode of the product to be deleted:");
							String productCode=br.readLine();
							if(t.removeProductFromShop(productCode))
								System.out.println("Product successfully deleted");
							else
								System.out.println("Product not found in the Shop");
						}
					break;
					case 3:
					{
						//new Ticket(refid,date,al);
						if(t!=null)
							t.displayProducts();
						else
							System.out.println("No products to show");
					}
					break;
					case 4:
					{
						System.exit(0);
					}
					break;
					default:
				}
				
			}while(true);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
