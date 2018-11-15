package Characters;
/*
 * Alanna Botscharow
 * 11/18
 */
public class printFstatements {

	public static void main(String[] args) {
	/*	
		double amount = 12618.98; 
		double interestRate = 0.0013; 
		double interest = amount * interestRate; 
				System.out.printf("Interest is $%4.2f", interest);
	*/	             
					// $%4.2f = %f
					/*
					 * Format specifiers:
					 * 	%b boolean
					 * 	%c character
					 * 	%d decimal
					 * 	%f float
					 * 	%e number in scientific notation
					 * 	%s a string
					 * 
					 * Number in front = spaces, number after decimal = decimal place. %10.5 
					 * %10.5 = 10 spaces, 5 decimal places
					 */
		
		
		/*
		int count = 5;
		double amount = 45.56; 
		System.out.printf("count is %d and amount is %f", count, amount); 
		*/
		
		/*
				String word = "hello world";
				System.out.printf("%s",word);
		*/
		
		System.out.printf("%3d#%2s#%4.2f\n", 1234,"Java", 51.6653);
		
		System.out.printf("%-8d%-8s%-8.1f \n", 1234,"Java",5.63);
		System.out.printf("%8d%8s%8.1f \n", 1234,"Java",5.63);
		
		
		
		
	}

}
