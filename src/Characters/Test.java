package Characters;
import java.util.Scanner;
/*
 * Alanna Botscharow
 * 11/18
 * Strings
 */
public class Test {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String message = "Welcome to Java";
		
		String message2 = "Java is fun";
		
		/*	System.out.println(message.length()); 
		
			System.out.println("Welcome to Java".length());
					
				System.out.println(message.charAt(8));
				
						System.out.println(message + message2);
						
						System.out.println(message.concat(message2));
						
							message += " and Java is fun";
							
							message += message2; 
							
			*/				message = message + message2;
							
	//	String x = input.next(); 
	//	x = input.nextLine(); 
			
			//if (message.equalsIgnoreCase("Welcome to Java")) {
			//System.out.println("you're in");
			
		
		int x = message.compareTo(message2)	;
			System.out.println(x);
			
				boolean y = message.contains("wel"); 
					System.out.println(y);
						
						
			
		/*if (message.compareTo(message2)) {
			System.out.println("you're in");
		
		}
		
		else {
			System.out.println("you're not in.");
		}
		
		*/

	}

}
