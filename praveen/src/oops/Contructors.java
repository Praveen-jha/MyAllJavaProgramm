package oops;

 class Test{
	 int a;
	 
	 Test(){
		 a=5;		//initialized here
	 }
 }
 
 class Vehicle{
	 int wheels,headlightes;
	 String color;
	 
//	 Vehicle(){
//		 wheels=4;
//	 }
	 
//	 giving parameters in constructors...
	 
//	 Vehicle(int noOfWheels){
//		 wheels=noOfWheels;
//		 headlightes=2;
//	 }
	 
//	 Vehicle(int wheels){
//		 this.wheels=wheels;
//	 }
	 
//	 constructor overloading.....
	 
	 Vehicle(int wheels){
		 this.wheels =wheels;
		 headlightes=2;
	 }
	 Vehicle(int wheels , String color){
		 
		 this.color=color;
		 this.wheels=wheels;
		 headlightes=2;
	 }
 }

public class Contructors {
	
	Contructors(){
		System.out.println("Object is now created");
	}

	public static void main(String[] args) {
		
		Contructors obj=new Contructors();
		Test a1=new Test();
		System.out.println(a1.a);
		
//		Vehicle car=new Vehicle();
		
//		car.wheels=5;				// don't do this if you made a constructor and you assigned value of wheels there...
//		System.out.println("Car has "+car.wheels+" Wheels");
		
//		Here every object of Vehicle will assigned with 4 wheels automatically  
		
//		Vehicle scooty=new Vehicle();
//		Vehicle scorpio=new Vehicle();
		
//		System.out.println("wheels of scooty is "+scooty.wheels);
//		System.out.println("wheels of scorpio is "+scorpio.wheels);
		
//		But you see here some of the vehicles have 3 wheels and some have 2 but it shows us 4 wheels for every vehicles..
//      so we will pass parameter in constructors ..
		
//		Vehicle car=new Vehicle(4);
//		Vehicle scooty=new Vehicle(3);
		
//		System.out.println("wheels of car is "+car.wheels+" and "+car.headlightes+" headlightes");
//		System.out.println("wheels of scooty is "+scooty.wheels+" and "+scooty.headlightes+" headlightes");
//		
		
		Vehicle car=new Vehicle(4 , "yellow");
		System.out.println("my car have "+car.wheels+" and "+car.headlightes+" headlightes and my car color is "+car.color);
		
		
		

	}

}
