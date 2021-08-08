package loops;
import java.util.Scanner;
public class PowerOfNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number");
		int a=sc.nextInt();
		System.out.println("enter second number");
		int b=sc.nextInt();
		int result=1;
		for(int i=0;i<b;i++) {
			result*=a;
		}
		System.out.println("power of "+a+", "+b+" times is = "+result);

	}

}
