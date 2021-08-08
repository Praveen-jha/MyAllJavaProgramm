package arrays;
import java.util.Scanner;
public class AddTwoMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		
//			Addition  of two matrix
		
		System.out.println("Enter the dimension");
		int rows=sc.nextInt();
		int cols=sc.nextInt();
		int a[][]=new int [rows][cols];
		int b[][]=new int [rows][cols];
		
		int c[][]=new int [rows][cols];
		
		System.out.println("Enter array a");
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				a[i][j]=sc.nextInt();
				
			}
		}
		System.out.println("Enter array b");
		for(int i=0 ; i<rows;i++) {
			for(int j=0;j<cols;j++) {
				b[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		System.out.println("result array c is ");
		for(int i=0;i<rows;i++) {
			for(int j=0; j<cols;j++) {
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
