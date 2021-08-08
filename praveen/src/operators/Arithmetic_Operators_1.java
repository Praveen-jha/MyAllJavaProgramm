package operators;
import java.util.Scanner;
public class Arithmetic_Operators_1 {

	//@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		System.out.println("enter first number....");
		int a= sc.nextInt();
		System.out.println("enter second number.....");
		int b= sc.nextInt();
		int c=a*a+b*b+2*a*b;	//(a+b)
		System.out.println("(a+b)*(a+b) of the number is =" + c);
		

	}

}

