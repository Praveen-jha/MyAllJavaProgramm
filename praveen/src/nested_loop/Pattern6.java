package nested_loop;

import java.util.Scanner;

public class Pattern6 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter a number");
		
		int n=sc.nextInt();
		int number=1;
		
	for(int i=1;i<=n;i++) {
		
		for(int j=1;j<=n-i;j++) {
			
			System.out.print("  ");
		}
		for(int j=1;j<=i;j++) {
			System.out.print(number++ +"  ");
		}
		System.out.println();
	}
		

	}

}
