package while_loop;

import java.util.Scanner;

public class NumberOfDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int temp=n;
		int noOfDigits=(int)Math.log10(temp)+1;
		System.out.println(noOfDigits);
		
//		finding palindrom number
		
		
//		int reversedNumber=0;
//		
//		for(int i=1;i<=noOfDigits;i++) {
//			int lastDigit=temp%10;
//			temp/=10;
//			reversedNumber=reversedNumber*10+lastDigit;
//		}if(n==reversedNumber) {
//			System.out.println("is palindrom number");
//		}
//		else {
//			System.out.println("is not palindrom number");
//		}
		
		
//		finding sum of digits....
		
		int sum=0;
		for(int i=1;i<=noOfDigits;i++) {
			int lastDigit=temp%10;
			sum+=lastDigit;
			temp/=10;
		}
		System.out.println("sum of number is ="+sum);

	}

}
