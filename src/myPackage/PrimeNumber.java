//Program to check whether given number is Prime or not
package myPackage;
import java.util.Scanner;
public class PrimeNumber {

	static Boolean checkPrime(int n,int i) {
		if(n<2) {
			return false;
		}else if(i==n) {
			return true;
		}else if(n%i==0) {
			return false;
		}
		i+=1;
		return checkPrime(n,i);
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter number to check if it is Prime or not ->");
		int inputnumber = scanner.nextInt();
		scanner.nextLine(); 
		boolean isprime = true;
		
		int i=2;
		isprime=checkPrime(inputnumber,i);
		
		String result=isprime ? "Prime number" : "not Prime number";
		System.out.println(inputnumber+" is "+result);
		
		scanner.close();
	}
		

}
