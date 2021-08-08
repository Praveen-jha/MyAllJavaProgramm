package conditional_Statenment;
import java.util.Scanner;

public class Love_or_not {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int noOfPatels=sc.nextInt();
		if(noOfPatels%2==0) {
			System.out.println("She loves me");
		}
		else {
			System.out.println("she loves me not");
		}

	}

}
