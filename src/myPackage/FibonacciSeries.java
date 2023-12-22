package myPackage;

import java.util.Scanner;

public class FibonacciSeries {
	
	static void Fibonacci(int n) {
		int firstTerm = 0, secondTerm = 1;
		
		for(int i=0; i<n;i++) {
			System.out.println(firstTerm+" ");
			int nextTerm = 	firstTerm+secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of terms for Fibonacci Series ->");
		int n=sc.nextInt();
		System.out.println("Fibonacci series up to "+n+" terms : ");
		Fibonacci(n);
		
		sc.close();
	}

}
