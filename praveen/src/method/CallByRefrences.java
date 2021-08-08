package method;

//making class it is a non premetive data type....

class Dog{
	int legs;
}

public class CallByRefrences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog c=new Dog();
		Dog d=new Dog();
		c.legs=6;
		d.legs=10;
		
		swap(c,d);
		System.out.println("legs of c : "+c.legs+" legs of d : "+d.legs);
		change(c);
		System.out.println("legs of c after changing "+c.legs); // here value is changed by origional value....
		
		

	}
	static void swap(Dog a, Dog b) {
		Dog temp=a;
		a=b;
		b=temp;
	}
	
//	making a function of change the value of legs of original dog....
	
	static void change(Dog dog) {
		dog.legs=4;
	}

}
