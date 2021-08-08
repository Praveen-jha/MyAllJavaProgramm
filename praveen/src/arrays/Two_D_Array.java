package arrays;

import java.util.Scanner;

public class Two_D_Array {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the length of first array");
		int n1=sc.nextInt();
		System.out.println("enter the length of first array");
		int n2=sc.nextInt();
		int a[][]=new int[n1][n2];
		System.out.println("enter array a");
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<n1;i++) {
			for(int j=0;j<n2;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();

	}

	}
}
