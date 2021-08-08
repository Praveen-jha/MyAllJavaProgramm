package loops;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		int n,i;
		boolean prime = true;
		System.out.println("enter any number");
		Scanner sc = new Scanner(System.in);
		n=sc.nextInt();
		for(i=2;i*i<=n;i++) {
			if(n%i==0) {
				prime = false;
				break;
			}
			else {
				prime = true;
				break;
			}
		}
		System.out.println("is prime = "+prime);
		

	}

}
