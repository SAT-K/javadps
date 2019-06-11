import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException, ParseException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number of recruiters");
		int n;
		Recruiter pr = new Recruiter();
		List<Recruiter> RecruiterList = new ArrayList<Recruiter>();
		n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String line = br.readLine();
			Recruiter pp = Recruiter.createRecruiter(line);
			RecruiterList.add(pp);
		}
		System.out.format("%-15s %s\n", "Company", "Count");
		Map<String, Integer> pn = Recruiter.companyWiseCount(RecruiterList);
		for (Map.Entry<String, Integer> entry : pn.entrySet()) {
			System.out.format("%-15s %s\n", entry.getKey(), entry.getValue());
		}
	}
}
