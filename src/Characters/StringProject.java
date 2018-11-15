package Characters;
/*
 * Alanna Botscharow
 * 11/18
 * strings 
 */
public class StringProject {

	public static void main(String[] args) {
		
		//equalsIgnoreCase (ignores case. Equal to other string) 
		
		
		String s1 = "Welcome to Java";
		String s2 = "Programming is fun";
		String s3 = "Welcome to Java";
		
		//(a) s1 == s2  
			//Returns true or false depending on if s1 and s2 match. 
				System.out.println(s1 == s2);
					//result: false
		
		//(b) s2 ==	s3
			//Returns true or false depending on if s2 and s3 match. 
				System.out.println(s2 == s3);
					//result: false
				
		//(c) s1.equals(s2) 
			//Does the exact same thing that s1 == s2 does. 
				System.out.println(s1.equals(s2));
					//result: false
				
		//(d) s1.equals(s3) 
			//Returns true or false depending on if s1 and s3 match. 
				System.out.println(s1.equals(s3));	
					//result: true
		
		//(e) s1.compareTo(s2)
				System.out.println(s1.compareTo(s2));
					//result: 7
		
		//(f) s2.compareTo(s3)
				System.out.println(s2.compareTo(s3));
					//result: -7
				
		//(g) s2.compareTo(s2)
				System.out.println(s2.compareTo(s2));
					//result: 0
				
		//(h) s1.charAt(0)
			//Returns what char is in the given position for that string.
				System.out.println(s1.charAt(0));				
					//result: W
				
		//(i) s1.indexOf('j')
			//Returns the position of 'j'
				System.out.println(s1.indexOf('j'));
					//result: -1
		
		//(j) s1.indexOf("to")
			//Returns the position of "to"
				System.out.println(s1.indexOf("to"));
					//result: 8
				
		//(k) s1.lastIndexOf('a') 
			//Returns the position of the last 'a'
				System.out.println(s1.lastIndexOf('a'));
					//result: 14
				
		//(l) s1.lastIndexOf("o",15) 
				System.out.println(s1.lastIndexOf("o",15));
					//result: 9
				
		//(m) s1.length() 
			//Returns the length of the string.
				System.out.println(s1.length());
					//result: 15
				
		//(n) s1.substring(5) 
				System.out.println(s1.substring(5));
					//result: "me to Java"
				
		//(o) s1.substring(5,11) 
				System.out.println(s1.substring(5,11));
					//result: "me to" 
				
		//(p) s1.startsWith("Wel") 
			//Returns true or false depending on if the String starts with "Wel"
				System.out.println(s1.startsWith("Wel"));
					//result: true
				
		//(q) s1.endsWith("Java") 
			//Returns true or false depending on if the String ends with "Java"
				System.out.println(s1.endsWith("Java"));
					//result: true
				
		//(r) s1.toLowerCase()
			//Returns the string in all lower case.
				System.out.println(s1.toLowerCase());
					//result: welcome to java
		
		//(s) s1.toUpperCase()
			//Returns the string in all upper case.
				System.out.println(s1.toUpperCase());
					//result: WELCOME TO JAVA
				
		//(t) s1.concat(s2) 
				System.out.println(s1.concat(s2));
					//result: Welcome to JavaProgramming is fun
				
		//(u) s1.contains(s2)
				System.out.println(s1.contains(s2));
					//result: false
				
		//(v) "\t Wel \t".trim()
				System.out.println("\t Wel \t".trim());
					//result: Wel
				
				
				
				
				
				
		

	}

}
