package myPackage;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String to check if it is Palindrome or not ->");
		String s = scanner.nextLine();
		
		String rev = "";
		for(int i=s.length()-1;i>=0;i--) {
			rev = rev + s.charAt(i);
		}
			if(s.equals(rev)) {
				System.out.println("String is Palindrome");
			}else {
				System.out.println("String is not Palindrome");
			}
			scanner.close();
	}

}
