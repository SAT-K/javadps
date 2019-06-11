import java.util.Comparator;

public class ParkedTimeComparator implements Comparator<Vehicle>{

	public int compare(Vehicle s1, Vehicle s2) {
		// TODO Auto-generated method stub
		return s1.getTicket().getParkedTime().compareTo(s2.getTicket().getParkedTime());
	}
}