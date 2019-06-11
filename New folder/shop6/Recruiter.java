import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Recruiter {

	private String name;
	private String email;
	private int experience;
	private String companyName;
	
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
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	
	
	public Recruiter(String name, String email, int experience,String companyName) {
		super();
		this.name = name;
		this.email = email;
		this.experience = experience;
		this.companyName = companyName;
		
	}

	public static Recruiter createRecruiter(String line) throws NumberFormatException, ParseException {
		Recruiter p = null;
		String[] arr = line.split(",", 4);
		p = new Recruiter(arr[0], arr[1], Integer.parseInt(arr[2]), (arr[3]));
		return p;
	}

	public static Map<String, Integer> companyWiseCount(List<Recruiter> list) {
		Map<String, Integer> cmap = new TreeMap();
		int n = 0;
		for (Recruiter p : list) {
			if (cmap.containsKey(p.getName())) {
				n = cmap.get(p.getName());
				n++;
				
			} 
		}
		return cmap;
	}
}
