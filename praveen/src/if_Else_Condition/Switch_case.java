package if_Else_Condition;

import java.util.Scanner;

public class Switch_case {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,result;
		char operator;
		System.out.println("enter the value of a & b");
		 a=sc.nextInt();
		 b=sc.nextInt();
		 System.out.println("enter operator");
		 operator=sc.next().charAt(0);
		 switch(operator) {
		 case '+':
			 result=a+b;
			 System.out.println("addition is"+result);
		 }
		 
		 
		

	}

}
