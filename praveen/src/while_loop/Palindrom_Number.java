package while_loop;

import java.util.Scanner;

public class Palindrom_Number {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("inter a number");
		int n=sc.nextInt();
//		int temp=n;
//		int reversedNumber=0;
//		while(temp > 0) {
//			int lastDigit=temp%10;
//		 reversedNumber=reversedNumber*10 +lastDigit;
//		 temp/=10;
//		}
//		if(reversedNumber==n) {
//			System.out.println(n+"is palindrom Number");
//		}else {
//			System.out.println(n+"is not palindrom Number");
//		}
		
		int temp=n;
		int reversedNumber=0;
		while(temp > 0) {
			
			int lastDigit=temp%10;
			
			reversedNumber=reversedNumber*10+lastDigit;
			temp/=10;
			
			
		}
		if(n==reversedNumber) {
			System.out.println(n+" is a palindrom number");
		}
		else {
			System.out.println(n+" is not a palindrom number");
		}

	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

