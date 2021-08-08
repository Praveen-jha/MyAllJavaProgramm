package oops;

class Boki{
	
//	Properties or state of Boki......
	
	int Legs,Eyes,Hand,Nose,Puppy,Rabbit;
	String breed,name,address;
	boolean mind;
	
//	giving behaviour by method....
	
	public void walk() {
		System.out.println("Tania is walking");
		
	}
	
	public void look() {
		System.out.println("Tania is looking at the mountain");
	}
	
	public void discription() {
		System.out.println("My Boki name is "+name+" it's breed is "+breed+" her address is "+address+". She has "+Legs+" legs , "+Eyes+" Eyes , "+Hand+" Hand , "+Nose+" Nose , "+Puppy+" puppies , "+Rabbit+" Rabbit and She has "+mind+" mind");
	}
}

public class MainClassPractice1 {

	public static void main(String[] args) {
		
		Boki Tania=new Boki();			// object of Boki....
		Tania.Legs=2;
		Tania.Eyes=2;
		Tania.Hand=2;
		Tania.Nose=1;
		Tania.Puppy=2;
		Tania.Rabbit=2;
		Tania.breed="Alean";
		Tania.name="Tania";
		Tania.address="Jammu";
		Tania.mind=false;
		
		Tania.walk();
		Tania.look();
		Tania.discription();
		
		
		

	}

}
