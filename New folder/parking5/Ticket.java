import java.util.Date;

public class Ticket {
	private String ticketNo;
	private Date parkedTime;
	private double cost;
	public String getTicketNo() {
		return ticketNo;
	}
	public void setTicketNo(String ticketNo) {
		this.ticketNo = ticketNo;
	}
	public Date getParkedTime() {
		return parkedTime;
	}
	public void setParkedTime(Date parkedTime) {
		this.parkedTime = parkedTime;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public Ticket() {
		
	}
	public Ticket(String ticketNo, Date parkedTime, double cost) {
		super();
		this.ticketNo = ticketNo;
		this.parkedTime = parkedTime;
		this.cost = cost;
	}
}
