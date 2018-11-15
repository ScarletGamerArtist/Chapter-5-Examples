package Characters;
import java.util.Scanner; 
/*
 * Alanna Botscharow
 * 11/18
 * hexadecimal converter
 */
public class Hexdigit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 	
		//get a hexadecimal from user. 
		
			System.out.println("Enter a digit 0-9 or A-F");
			
				String hexString = input.nextLine(); 
				
		
		if (hexString.length() >= 4) {
			System.out.println("You can only enter up to 3 characters.");
			System.exit(1);
		}
		char ch = Character.toUpperCase(hexString.charAt(0));
		if (ch <= 'F' &&
				ch >= 'A') {
			int value = ch - 'A' + 10;
			System.out.println("The decimal value for hex digit " + ch + " is " + value);			
		}
		
		else if (Character.isDigit(ch)) {
			System.out.println("The decimal value for hex digit " + ch + " is " + ch);
			
		}
		else {
			System.out.println(ch +"is an invalid input.");
		}
		
		
		
		
		
		
		
		
		
	}

}
