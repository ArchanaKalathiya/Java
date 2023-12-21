package myPackage;
import java.util.Arrays;

public class Vowel_Index {
	static char vowels[]= {'a','e','i','o','u'};
	
	static char key='i';
	
	static {
	Arrays.sort(vowels);
	int foundIndex = Arrays.binarySearch(vowels,key);
	System.out.println("The given vowel "+key+" is at index "+foundIndex);
	
	}
	public static void main(String[] args) {

	}
}
