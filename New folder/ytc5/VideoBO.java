import java.util.ArrayList;
import java.util.List;

public class VideoBO {
	public List<Video> findVideo(List<Video> videoList,String category){
		
		List<Video> search=new ArrayList<Video>();
		for(Video v:videoList)
		{
			if(v.getCategory().equalsIgnoreCase(category))
				search.add(v);
		}
		
		return search;
		
	}
	public List<Video> findVideo(List<Video> videoList,List<String> username){
		List<Video> search=new ArrayList<Video>();
		
		for(Video v:videoList)
		{
			if(v.getName().equals(username))
				search.add(v);
		}	
		
		return search;
		
	}
}
