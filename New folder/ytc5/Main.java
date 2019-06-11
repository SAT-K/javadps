import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat f = new SimpleDateFormat("mm:ss");
		System.out.println("Enter the number of videos:");
		Integer n=Integer.parseInt(br.readLine());
		String details[]=new String[n];
		List<Video> videolist=new ArrayList<Video>();
		Video p[]=new Video[n];
		for(int i=0;i<n;i++)
		{
			details[i]=br.readLine();
			String s[]=details[i].split(",");
			Date d;
			d=formatter.parse(s[3]);
			User name=User.prefill().get(0);
			p[i]=new Video(s[0],s[1],f.parse(s[2]),d,Integer.parseInt(s[4]),Integer.parseInt(s[5]),name);
			videolist.add(p[i]);
		}
		System.out.println("Enter a search type:\n1.By Category\n2.By Username");
		int choice=Integer.parseInt(br.readLine());
		VideoBO VBo=new VideoBO();
		switch(choice)
		{
		case 1:
		{
			System.out.println("Enter the Category:");
			String category=br.readLine();
			List<Video> bycategory=VBo.findVideo(videolist, category);
			if(bycategory.size()!=0)
			{
				System.out.format("%-25s %-10s %-10s %-10s %-8s %-8s %s\n","Name","Category","Duration","Posted Date","Views","Likes","Posted By");
				for(Video v:bycategory)
					v.toString();
					
			}
			else
				System.out.println("No such video is present");
		}
		break;
	case 2:
		{
		System.out.println("Enter the price:");
			String username=br.readLine();
			List<Video> byusername=VBo.findVideo(videolist,username);
			if(byusername.size()!=0)
			{
				System.out.format("%-15s %-15s %-12s %-12s %-7s %s\n","Name","Product code","Brand name","Stock left","Price","Expiry date");
				for(Video v:byusername)
				v.toString();
				
			}
			else
				System.out.println("No such video is present");
			
		}
			break;
		default:System.out.print("Invalid choice");
		}
  	}
}
