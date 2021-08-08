package conditional_Statenment;
import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter your first number");
		float num1=sc.nextFloat();
		System.out.println("enter your second number");
		float num2=sc.nextFloat();
		System.out.println("enter operation");
		sc.nextLine();
		char operation=sc.nextLine().charAt(0);
		float result=0;
		switch(operation) {
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		case '%':
			result=num1%num2;
			break;
			default:
				System.out.println("please check your operation and data");
		}
		System.out.println(result);

	}

}
