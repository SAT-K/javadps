import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Vehicle implements Comparable<Vehicle>{
	private String registrationNo;
	private String name;
	private String type;
	private double weight;
	private Ticket ticket;
	
	public String getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(String registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public Ticket getTicket() {
		return ticket;
	}
	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}
	public Vehicle() {
		
	}
	public Vehicle(String registrationNo, String name, String type, double weight, Ticket ticket) {
		super();
		this.registrationNo = registrationNo;
		this.name = name;
		this.type = type;
		this.weight = weight;
		this.ticket = ticket;
	}
	static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss",Locale.ENGLISH);
	public static Vehicle createVehicle(String detail) throws ParseException{
			Vehicle s = null;
			Date d1;
			String[] arr = detail.split(",");
			d1=formatter.parse(arr[5]);
			Ticket t1=new Ticket(arr[4],d1,Double.parseDouble(arr[6]));
			s = new Vehicle(arr[0],arr[1],arr[2],Double.parseDouble(arr[3]),t1);
			return s;
			
		}

	public int compareTo(Vehicle s1) {
		
		double s2 = this.getWeight();
		double s3 = s1.getWeight();
		if (s2>s3)
			return 1;
		else if(s2<s3)
			return -1;
		else 
			return 0;
	}
	@Override
	public String toString() {
		System.out.format("%-15s %-10s %-12s %-7s %s\n",registrationNo,name,type,weight,ticket.getTicketNo());
	
	return "";
	}
	
	
}

