package loops;

import java.util.Scanner;

public class Negativr_Series_Sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		float result=0;
		for(float i=1;i<=n;i++) {
			if(i%2==0) {
				result -=1/i;
			}else {
				result +=1/i;
			}
		}
		System.out.println("Series sum of number is = "+result);
		

	}

}
