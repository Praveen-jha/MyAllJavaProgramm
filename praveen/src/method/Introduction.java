package method;

public class Introduction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int y=8;
		int result=maxOf(x,y);
		System.out.println("greater number is "+result);
		maxOf(5,20);
		
//		calling another function.....
		sayHi();
		
		System.out.println(maxOf(5,4.76f));

	}
	
	// First method....
	
	static int maxOf(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
//	another method......
	
	static void sayHi() {
		System.out.println("Hi How are you");
	}
	
	// Method Overloading.....
	
	static int maxOf(int a , float b) {
		return a;
	}
	

}
