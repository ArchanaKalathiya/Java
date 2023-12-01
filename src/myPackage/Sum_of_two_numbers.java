package myPackage;

import java.util.Scanner;
public class Sum_of_two_numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("<------ Enter two numbers ------>");
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 1st numbers ");
		int numberOne=s.nextInt();
		
		System.out.println("Enter 2nd numbers ");
		int numberTwo=s.nextInt();
		
		int sum = numberOne + numberTwo ;
		
		System.out.println("The sum of two numbers = "+ sum);		
	}

}
