package myPackage;
import java.util.*;
public class WordsInString {
	
	static int Length(String st) {
		int c=0;
		for(int i=0;i<=(st.length()-1);i++) {
				 if(  ( (i>0)&& (st.charAt(i)!=' ') &&(st.charAt(i-1)==' ')) || ((st.charAt(i)!=' ')&&(i==0)) ) {
					 c++;
				 }
		}
		return c;
	}
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter a String -> ");
	String s = scanner.nextLine();
	
	int count=Length(s);
	System.out.println("Number of words in a given string -> "+count);
	
	
	}
}
