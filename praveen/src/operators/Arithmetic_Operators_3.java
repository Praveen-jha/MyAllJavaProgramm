package operators;
import java.util.Scanner;
public class Arithmetic_Operators_3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number..");
		int a=sc.nextInt();
		System.out.println("enter second number....");
		int b =sc.nextInt();
		double c=(double)b/(double)a;
		System.out.println("answer is..= "+c);
	}

}
