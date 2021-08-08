package conditional_Statenment;
import java.util.Scanner;
public class Routine {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter days in number");
		int dayOfWeak=sc.nextInt();
		switch(dayOfWeak) {
		
		case 1:
			System.out.println("i am on leave");
			break;
		case 2:
			System.out.println("i am in office");
			break;
		case 3:
			System.out.println("i am in home");
			break;
		case 4:
			System.out.println("i am happy today");
			break;
		case 5:
			System.out.println("i am in game");
			break;
		case 6:
			System.out.println("i am a little bit sad");
			break;
		case 7:
			System.out.println("i am in collage");
			break;
			default:
				System.out.println("please enter a valid day");
					
			
	}
		
		

	}

}
