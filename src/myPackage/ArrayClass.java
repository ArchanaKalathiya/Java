package myPackage;

public class ArrayClass {

	public static void main(String[] args) {
		int[] arr = new int[100];
		
		int x1[];
		int [][]x2;
		int x3[][];
		int[] a,b;
		int[] a2[],b2[];
		int a1[],b1[];
		
		System.out.println(arr.getClass().getName());
		
		int[][][] x= {{ {10,20,30}, {40,50,60}}, {{70,80}, {90,100,110} }};
		
		System.out.println(x[0][1][2]); //Ans : 60
		System.out.println(x[1][0][1]); //Ans : 80
		System.out.println(x[1][1][1]); //Ans : 100
		System.out.println(x[1][2][0]); //Exception AIOB
		System.out.println(x[2][1][0]); //Exception AIOB
		
	}

}
