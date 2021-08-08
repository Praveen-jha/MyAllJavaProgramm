package while_loop;

import java.util.Scanner;

public class Sum_of_digits {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
//		int temp=n;
//		int sum=0;
//		while(temp > 0) {
//			int lastDigit=temp%10;
//			temp /=10;
//			sum +=lastDigit;
//			System.out.println(lastDigit + " "+ temp+" "+ sum);
//		}
//		System.out.println("the sum of digit of "+n+" is "+sum);
		
		int temp=n;
		int sum=0;
		while(temp>0) {
			int lastDigit=temp%10;
			sum+=lastDigit;
			temp/=10;
			System.out.println("temp = "+temp+" lastDigit= "+lastDigit+" sum = "+sum);
		}
		System.out.println("sum of "+n+" is = "+sum);

	}

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
