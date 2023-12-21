package myPackage;

public class ReverseString {

	
	public static void main(String[] args) {
		String s="ARCHANA";		//Original String
		String rev=""; 			//Initialized an empty string to store reversed string 
		
		for(int i=s.length()-1;i>=0;i--) {	//loop through the characters of the original string in reverse order 
			rev = rev + s.charAt(i);		//Concatenating each character in reverse order 
		}
		System.out.println("String is "+s+"\nReversed String is  "+rev);
	}

}
