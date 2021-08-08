package while_loop;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=1;
		
		do {
			System.out.println("enter a number");
			
			n=sc.nextInt();
		}
		while(n!=0);
		
		

	}

}
