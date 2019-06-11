import java.util.ArrayList;
import java.util.List;

public class User {
	
	String name;
	String email;
	List<Video> videoList;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Video> getVideoList() {
		return videoList;
	}
	public void setVideoList(List<Video> videoList) {
		this.videoList = videoList;
	}
	public User(String string, String string2, ArrayList<Video> arrayList) {
		
	}
	public static List<User> prefill(){
		List<User> list = new ArrayList<>();
		list.add(new User("Walter","walter@gmail.com",new ArrayList<Video>()));
		list.add(new User("Winn","winn@gmail.com",new ArrayList<Video>()));
		list.add(new User("James","james@gmail.com",new ArrayList<Video>()));
		list.add(new User("John","john@gmail.com",new ArrayList<Video>()));
		list.add(new User("Dean","dean@gmail.com",new ArrayList<Video>()));
		list.add(new User("Sam","sam@gmail.com",new ArrayList<Video>()));
		return list;
	}
}
