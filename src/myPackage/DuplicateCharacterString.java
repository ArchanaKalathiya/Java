package myPackage;
import java.util.*;
public class DuplicateCharacterString {
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter String -> ");
		String inputString=scanner.nextLine();
		
	    System.out.println("The duplicate characters are ");
	    findduplicates(inputString);
	    scanner.close();
	}
	static void findduplicates(String inputString) {
		char[] characters = inputString.toCharArray();
		 for (int i = 0; i < characters.length; i++) {
	            for (int j = i + 1; j < characters.length; j++) {
	                if (characters[i] == characters[j]) {
	                    System.out.print(characters[i] + " ");
	                    break;
	                }
	            }
	        }
		 System.out.println();
	}

}
