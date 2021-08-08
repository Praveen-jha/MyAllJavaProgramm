package loops;

import java.util.Scanner;

public class For_loop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,i,result=1;
		System.out.println("enter first number");
		a=sc.nextInt();
		System.out.println("enter second number5");
		b=sc.nextInt();
		for(i=1;i<=b;i++) {
			result=a*result;
		}
		System.out.println("power of number is = "+result);

	}

}
