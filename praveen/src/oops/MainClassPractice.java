package oops;

class rabbit{
	
//	Rabbit's state or properties....
	
	boolean hasFur;
	String name,breed;
	int eyes,legs;
	
//		Methods....
	
	public void eat() {
		System.out.println("my rabbit is eating");
	}
	public void jump() {
		System.out.println("my rabbit is jumping");
	}
	public void discription() {
		System.out.println("my rabbit name is "+name+" and it has "+legs+" legs and "+eyes+" eyes");
	}
}

public class MainClassPractice {

	public static void main(String[] args) {
		
//		Object behaviour.args..
		
		
		rabbit jakson=new rabbit();
		jakson.name="jakson";
		jakson.breed="jermansharped";
		jakson.legs=4;			// change properties...
		jakson.eyes=2;			// change properties...
		
		jakson.discription();

	}

}
