package gfg;

import java.util.Arrays;

public class MaxAndMinElementInArray {

	public static void main(String[] args) {
		int a[]= {1,9,100,30,400,50};
		int n=a.length;
		Arrays.sort(a);
//		System.out.println("min element is "+a[0]+" and maximum element is "+a[(int)(n-1)]);
		System.out.println("min element is "+a[0]+" and maximum element is "+a[(n-1)]);
	}

}
