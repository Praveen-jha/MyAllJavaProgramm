package arrays;

import java.util.Scanner;

public class Bubble_Sort{

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of Array ");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enetr elements in array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
			
		}
		for(int i=0;i<n-1;i++) {
			boolean sorted=true;
			for(int j=0;j<n-1-i;j++) {
				if(a[j+1]<a[j]) {
					int temp =a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
					sorted=false;
				}
			}
			if(sorted) break;
		}
		System.out.print("Your Sorted Array is : ");
		for(int e:a) {
			System.out.print(e+" ");
		}

	}

}
