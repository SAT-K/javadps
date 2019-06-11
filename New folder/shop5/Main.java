import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String args[]) throws NumberFormatException, IOException, ParseException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of the stories:");
		int n;
		
		List<Story> StoryList = new ArrayList<Story>();
		n = Integer.parseInt(br.readLine());
		for(int i = 0;i < n;i++)
		{
			String line = br.readLine();
			Story pp = Story.createStory(line);
			StoryList.add(pp);
	   }
		int choice;
		System.out.println("Enter a type to sort:\n1.Sort by Name\n2.Sort by No. of Reads\n");
		choice = Integer.parseInt(br.readLine());
		switch(choice)
		{
		case 1:Collections.sort(storyList);
		System.out.format("%-20s %-12s %-8s %-15s %-12s %s\n","Name","Author Name","Genre","No. of Chapters","No. of Likes","No. of Reads");
		for(Story p:StoryList)
		{
			p.toString();
		}
		break;
		case 2:Collections.sort(productList,new PriceComparator());
		System.out.format("%-20s %-12s %-8s %-15s %-12s %s\n","Name","Author Name","Genre","No. of Chapters","No. of Likes","No. of Reads");
		for(Story p:StoryList)
		{
			p.toString();
		}
		break;
		
		}
		
		
		
	}
}