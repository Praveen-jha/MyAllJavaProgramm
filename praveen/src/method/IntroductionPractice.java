package method;

import java.util.Scanner;

public class IntroductionPractice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number that you want to fibonacci series");
		int a=sc.nextInt();
		
		
		fibonacci(a);
		System.out.println();
		fibonacci(10);
		

	}
	
	static void fibonacci(int a) {
		int a1=0;
		int b1=1;
		System.out.print(a1+" ");
		System.out.print(b1+" ");
		for(int i=2;i<=a;i++) {
			int c=a1+b1;
			a1=b1;
			b1=c;
			System.out.print(c+" ");
		}

	}

}
