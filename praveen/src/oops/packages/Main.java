package oops.packages;

//import oops.packages.models.Students;    
import oops.packages.models.*;	//to access all class of models package..

//import java.util.Scanner;  

import java.util.*;		// to access all classes of util packages..

public class Main {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		
		Students obj=new Students("Tom");
		System.out.println(obj.getName());

	}

}
