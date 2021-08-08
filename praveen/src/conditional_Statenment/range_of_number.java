package conditional_Statenment;
import java.util.Scanner;
public class range_of_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
		if(number <= 10) {
			System.out.println("number is less than 10");
		}
		else if(number >= 10 && number <= 20){
			System.out.println("number is greater than 10 and smaller than 20");
		}
		else if(number >= 20 && number <=30) {
			System.out.println("number is greater than 20 and smaller than 30");
		}
		else {
			System.out.println("number is greater than 30");
		}

	}

}
