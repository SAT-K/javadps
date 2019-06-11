import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException, ParseException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss",Locale.ENGLISH);
		System.out.println("Enter the number of the vehicles:");
		int n;
		Date d1;
		n = Integer.parseInt(br.readLine());
		
		List<Vehicle> productList = new ArrayList<Vehicle>();
		List<Ticket> pro=new ArrayList<>();
		for(int i = 0;i < n;i++)
		{
			String line=br.readLine();
			String str[]=line.split(",");
			d1=formatter.parse(str[5]);
			Ticket t1=new Ticket(str[4],d1,Double.parseDouble(str[6]));
			Vehicle v1=new Vehicle(str[0],str[1],str[2],Double.parseDouble(str[3]),t1);
			productList.add(v1);
			pro.add(t1);
			//productList.add(Vehicle.createVehicle(br.readLine()));
	   }
		int choice;
		System.out.println("Enter a type to sort:\n1.Sort by weight\n2.Sort by parked time");
		choice = Integer.parseInt(br.readLine());
		switch(choice)
		{
		case 1:Collections.sort(productList);
		
		System.out.format("%-15s %-10s %-12s %-7s %s\n","Registration No","Name","Type","Weight","Ticket No");
		
			
			for(Vehicle p:productList)
		{
				//System.out.format("%-15s %-10s %-12s %-7s %s \n",p.getRegistrationNo(),p.getName(),p.getType(),p.getWeight(),p.getTicket());
			p.toString();
		}
			
		//Set<Vehicle> s=new TreeSet<Vehicle>(productList);
		
		break;
		case 2:Collections.sort(productList, new ParkedTimeComparator());
		System.out.format("%-15s %-10s %-12s %-7s %s\n","Registration No","Name","Type","Weight","Ticket No");
		
			for(Vehicle p:productList)
		{
			//System.out.format("%-15s %-10s %-12s %-7s %s \n",p.getRegistrationNo(),p.getName(),p.getType(),p.getWeight(),p.getTicket());
			p.toString();
		}
		
		break;
		
		       
		}
	}
}