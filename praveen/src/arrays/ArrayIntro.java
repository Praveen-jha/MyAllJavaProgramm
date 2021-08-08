package arrays;

import java.util.Scanner;

public class ArrayIntro {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no.");
		
//		int n=sc.nextInt();
		
//		array decleration in single line
		
//		int [] marks=new int [5];
		
//		array declaration in two lines
//		int [] marks;
//		marks=new int[10];
		
		
//		int marks []=new int[5];
//		
//		int rollN [],classes;     // here rollN is an array but classes is a variable...
//		
//		int [] rollNo, calsses;    	// here rollNo and calsses both are arrays ...
		
//		int [] age= {2,4,5,6,7,7};
//		System.out.println(age[n]);
		
		
		
		double[] marks= {2.5,5.4,5.7,8.9};
		marks[3]=5.9;	// here you can change the value of an array...
//		System.out.println(marks[3]);
		for(int i =0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		
		
		
		
		

	}

}
