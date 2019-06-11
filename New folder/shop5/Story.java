import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Formatter;

public class story implements Comparable<story>{
	private String name,authorName,genre;
	private int noOfChapters,noOfLikes,noOfReads;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
public String getAuthorName() {
	return authorName;
}public void setAuthorName(String authorName) {
	this.authorName = authorName;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int getNoOfChapters() {
	return noOfChapters;
}public void setNoOfChapters(int noOfChapters) {
	this.noOfChapters = noOfChapters;
}public int getNoOfLikes() {
	return noOfLikes;
}public void setNoOfLikes(int noOfLikes) {
	this.noOfLikes = noOfLikes;
}public int getNoOfReads() {
	return noOfReads;
}public void setNoOfReads(int noOfReads) {
	this.noOfReads = noOfReads;
}
	
	
	public story(String name, String authorName, String genre, int noOfChapters, int noOfLikes,int noOfReads) {
		super();
		this.name = name;
		this.authorName = authorName;
		this.genre = genre;
		this.noOfChapters = noOfChapters;
		this.noOfLikes = noOfLikes;
		this.noOfReads = noOfReads;

	}
		public static story createStory(String detail) throws ParseException{
			story s = null;
		
			String[] arr = detail.split(",");
		
			s = new story(arr[0],arr[1],arr[2],Integer.parseInt(arr[3]),Integer.parseInt(arr[4]),Integer.parseInt(arr[5]));
			return s;
		}
		public int compareTo(story p) {
			
			int p1=this.getStockLeft();
			int p2=p.getStockLeft();
			if (p1>p2)
				return 1;
			else if(p1<p2)
				return -1;
			else 
				return 0;
		}
		@Override
		public String toString() {
			System.out.format("%-20s %-12s %-8s %-15s %-12s %s\n", name,authorName,genre,noOfChapters,noOfLikes,noOfReads);
			return "";
		}
		
		
		
}
