/* You can Pause the video and read this section ->
1. Passord length > 8
2. password should not contain username (predictable)
3. password should not contain name
4. password should not be reverse of a user input field
You can find -
-> 
	Password Strength Check codes available online. 
	Hence, we will use basic string methods and  move on to a new concept 
	i.e - encoding using the concept of Caesar Cipher.

-> We will write down a code for Caesar Cipher too , watch the video till end !

*/

import java.util.Scanner;
class PasswordCheck {
public static StringBuffer encoding(String password, int shift) {
	StringBuffer result = new StringBuffer();

	for(int i = 0; i < password.length(); i++) {
		if(Character.isUpperCase(password.charAt(i))) {
			char ch = (char)(((int)password.charAt(i) + shift - 65) % 26 + 65);
			result.append(ch);
		}
		else {
			char ch = (char)(((int)password.charAt(i) + shift - 97) % 26 + 97);
			result.append(ch);
		}
	}
	return result;
}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter Name : ");
		String name = scan.nextLine();

		System.out.print("Enter Username : ");
		String username = scan.nextLine();

		System.out.print("Enter password : ");
		String password = scan.nextLine();

		StringBuffer sbr = new StringBuffer(name);
		sbr.reverse();
		// StringBuffer Class is mutable , hence we use it to use methods
		//It is used to modify String objects.

		int shift = 6;

		try {
			if(password.contains(name)
				||password.equalsIgnoreCase(name)
				|| password.contains(username) 
				|| password.length() < 8 
				|| password.contains(sbr))
				throw new PasswordException("You entered a weak password!");
		}
		catch(PasswordException e) {
			e.printStackTrace();
		}

		//Display 
		System.out.println("User Details: ");
		System.out.println("Name: " + name);
		System.out.println("Username : " + username);
		System.out.println("Shift: " + shift);
		System.out.println("Password -> " + password);
		System.out.println("Plain text to Cipher Text : " + encoding(password, shift));
	}
}

class PasswordException extends Exception {
	public PasswordException(String password) {
		super(password);
	}
}
