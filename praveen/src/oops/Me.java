package oops;

class vehiclee{
	int wheels,headlightes;
	String color;
	
	vehiclee(){
//		wheels=4;
	}
	
//	vehiclee(int noOfWheels){
//		wheels=noOfWheels;
//		headlightes=2;
//	}
	
	vehiclee(int wheels , String color){
		this.wheels=wheels;
		this.color=color;
		headlightes=3;
	}
	
}

public class Me {
	
	public static void main(String [] args) {
//		vehiclee carr=new vehiclee();
//		
//		vehiclee boi=new vehiclee();
////		carr.wheels=4;
//		System.out.println(carr.wheels);
//		System.out.println(boi.wheels);
		
		vehiclee car=new vehiclee(3 , "yellow");
		
		System.out.println(car.wheels);
		System.out.println(car.headlightes);
		System.out.println(car.color);
		
		vehiclee random123=new vehiclee();
		
		random123.color="red";
		System.out.println(random123.color);
		
		
	}

}
