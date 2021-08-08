package oops;
// This is a class....
class cat{
	
//	Properties or State of cat
	
	boolean hasFur;
	String color, breed;
	int legs,eyes;
	
//	Giving behaviour by methods....
	
	public void walk() {
		System.out.println("My cat is walking");
		
	}
	public void eat() {
		System.out.println("cat is eating");
	}
	
//	Playing with behaviour...
	
	public void discription() {
		System.out.println("my cat has legs "+legs+" and "+eyes+" eyes");
	}
}

class Dog{
	String brid,name;
	int legs,eyes;
	
	public void jump() {
		System.out.println("dog is jumping");
	}
	public void dance() {
		System.out.println("my dog is dancing.");
	}
	public void discription() {
		System.out.println("my dog name is "+name+" it has "+legs+" legs"+" and"+eyes+" eyes");
	}
	
}

public class MainClass {

	public static void main(String[] args) {
		
		// making object of class... Cat....
		
		cat cat1=new cat();
		cat cat2=new cat();
		
		cat1.legs=3;
		cat1.eyes=2;
		
		cat2.legs=4;
		cat2.eyes=1;
		
//		cat1.walk();
//		cat2.eat();
		
		cat1.discription();
		cat2.discription();
		
		Dog Dog1=new Dog();
		Dog1.legs=2;
		Dog1.eyes=2;
		Dog1.name="jakson";
		Dog1.discription();
		Dog1.jump();
		Dog1.dance();
		
		
		

	}

}
