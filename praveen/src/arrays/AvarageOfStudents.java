package arrays;
import java.util.Scanner;
public class AvarageOfStudents {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter length of array:");
		
		int n=sc.nextInt();
		int marks[]=new int[n];
		System.out.println("Enter the marks");
		
		for(int i= 0;i<n;i++) {
			marks[i]=sc.nextInt();
		}
		 int avarage= 0;
		 
		 for(int i=0;i<n;i++) {
			 avarage+=marks[i];
		 }
		avarage/=n;
		System.out.println("Avarage marks is = "+avarage);

	}

}
