package conditional_Statenment;

import java.util.Scanner;

public class If_Statenment {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age : ");
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println("you can vote ");
		}
		else {
			System.out.println("you can't vote now");
		}
		

	}

}
