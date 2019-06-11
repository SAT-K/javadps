import java.text.SimpleDateFormat;
import java.util.Date;

public class Video  {
	private String name,category;
	private Date duration,postedDate;
	private int noOfViews,noOfLikes;
	private User user;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getDuration() {
		return duration;
	}
	public void setDuration(Date duration) {
		this.duration = duration;
	}
	public Date getPostedDate() {
		return postedDate;
	}
	public void setPostedDate(Date postedDate) {
		this.postedDate = postedDate;
	}
	public int getNoOfViews() {
		return noOfViews;
	}
	public void setNoOfViews(int noOfViews) {
		this.noOfViews = noOfViews;
	}
	public int getNoOfLikes() {
		return noOfLikes;
	}
	public void setNoOfLikes(int noOfLikes) {
		this.noOfLikes = noOfLikes;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public Video() {
		
	}
	static SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
	static SimpleDateFormat f1=new SimpleDateFormat("mm:ss");
	
	public Video(String name, String category, Date duration, Date postedDate, int noOfViews, int noOfLikes,User user) {
		super();
		this.name = name;
		this.category = category;
		this.duration = duration;
		this.postedDate = postedDate;
		this.noOfViews = noOfViews;
		this.noOfLikes = noOfLikes;
		this.user = user;
	}
	@Override
	public String toString() {
		System.out.format("%-25s %-10s %-10s %-10s %-8s %-8s %s\n",name,category,f1.format(duration),formatter.format(postedDate),noOfViews,noOfLikes,user.getName());
		return "";
	}
	
	
}
