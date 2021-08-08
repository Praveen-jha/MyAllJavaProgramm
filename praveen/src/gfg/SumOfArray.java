package gfg;

import java.util.Scanner;

public class SumOfArray {

	public static void main(String[] args) {
		System.out.println("enter length of array");
		 Scanner sc =new Scanner(System.in);
		 int n=sc.nextInt();
		 int a[]=new int [n];
		System.out.println("enter elements in array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		int sum=0;
		for(int i=0;i<n;i++) sum+=a[i];
		
		System.out.println("sum of all elements is "+sum);

	}

}
