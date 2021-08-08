package bitwise_Operators;
import java.util.Scanner; 
public class Bitwise_Operators_1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number..");
		int a=sc.nextInt();
		System.out.println("enter second number...");
		int b =sc.nextInt();
		int c=a|b;
		System.out.println("answer is = "+c);
	}

}
