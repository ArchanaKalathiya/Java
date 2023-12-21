package myPackage;
import java.util.Scanner;

public class Even_Odd {
	public static void main(String[] args) {
		
		Scanner num =new Scanner(System.in);
		System.out.println("Enter number to check if it is even or odd ->");
		int inputnumber = num.nextInt();
		
		String status = (inputnumber % 2 == 0)? " is Even" : " is Odd"; 
		
		System.out.println(inputnumber + status);
		num.close();
	}
}
