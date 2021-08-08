package oops;

public class Encapsulation {

	public static void main(String[] args) {
		
//		Students praveen=new Students();
//		
//		praveen.name="Praveen jha";
//		praveen.age=20;
//		
//		System.out.println(praveen.name);
//		System.out.println(praveen.age);
		
		// Here as you seen that we easily access the Students class form same packages....but i want some restriction like age 
		// must less than 30 ..
		
		Students praveen=new Students();
		praveen.setAge(12);
		System.out.println(praveen.getAge());
		
		
		
		
		

	}

}
