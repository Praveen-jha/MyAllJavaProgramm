package loops;

import java.util.Scanner;

public class Sum_Of_N_Numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int result=0;
		for(int i=0;i<=n;i++) {
			result +=i;
			
		}
		System.out.println("sum of n numbers is = "+ result);

	}

}
