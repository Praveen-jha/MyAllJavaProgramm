package method;

public class NewProgramm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println("hello world");
//		System.out.println("hello world");
//		System.out.println("hello world");
		
		int x=5;
		int y=6;
		int result=maxOf(x,y);
		System.out.println(result);
		System.out.println(maxOf(8,10));
		System.out.println(maxOf(30,50));
		
		

	}
	
	static int maxOf(int a,int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	

	}

}
