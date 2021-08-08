package arrays;

import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("Enter elements in array");
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
//		int a[]= {3,6,1,9,5,2};
//		int n=a.length;
//		for(int i=0;i<n-1;i++) {
//			int minIndex=i;
//			for(int j=i;j<n;j++) {
//				if(a[j]<a[minIndex]) {
//					minIndex=j;
//				}
//			}
//			int temp =a[i];
//			a[i]=a[minIndex];
//			a[minIndex]=temp;
//		}
//		for(int e:a) {
//			System.out.print(e+" ");
//		}


		for(int i=0;i<n-1;i++) {
			int min=i;
			for(int j=i+1;j<n;j++) {
				if(a[j]<a[min]) {
					min=j;
				}
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
		for(int e:a) {
			System.out.print(e+" ");
		}
	}

}
