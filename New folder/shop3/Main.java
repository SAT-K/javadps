import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the password to be validated:");
		String password = reader.readLine();
		boolean b2 = validatePassword(password );
		if (b2) {
			System.out.println("Password is valid");
		} else {
			System.out.println("Password is invalid");
		}
	}

	static Boolean validatePassword(String password) {
		if (password.matches("((?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{7,})")) {
			return true;
		} else {
			return false;
		}
	}
}
