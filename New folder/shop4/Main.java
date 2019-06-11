import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException, ParseException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat formatter = new SimpleDateFormat("dd-mm-yyyy");
		
		System.out.println("Enter the number of products:");
		Integer n=Integer.parseInt(br.readLine());
		String details[]=new String[n];
		List<Product> list=new ArrayList<Product>();
		Product p[]=new Product[n];
		for(int i=0;i<n;i++)
		{
			details[i]=br.readLine();
			String s[]=details[i].split(",");
			Date d;
			d=formatter.parse(s[5]);
			p[i]=new Product(s[0],s[1],s[2],Integer.parseInt(s[3]),Double.parseDouble(s[4]),d);
			list.add(p[i]);
		}
		System.out.println("Enter a search type:\n1.By brand name\n2.By price");
		int choice=Integer.parseInt(br.readLine());
		ProductBO PBo=new ProductBO();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter the brand name:");
			String brandName=br.readLine();
			List<Product> byBname=PBo.findProduct(list, brandName);
			if(byBname.size()!=0)
			{
				System.out.format("%-15s %-15s %-12s %-12s %-7s %s\n","Name","Product code","Brand name","Stock left","Price","Expiry date");
				for(Product v:byBname)
					v.toString();
					
			}
			else
				System.out.println("No such product is present");
		}
		break;
		case 2:
		{
			System.out.println("Enter the price:");
			double price=Double.parseDouble(br.readLine());
			List<Product> byprice=PBo.findProduct(list, price);
			if(byprice.size()!=0)
			{
				System.out.format("%-15s %-15s %-12s %-12s %-7s %s\n","Name","Product code","Brand name","Stock left","Price","Expiry date");
				for(Product v:byprice)
				v.toString();
				
			}
			else
				System.out.println("No such product is present");
			
		}
		break;
		default:System.out.print("Invalid choice");
		}
    }
}
