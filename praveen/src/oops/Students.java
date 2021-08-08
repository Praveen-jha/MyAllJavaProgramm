package oops;

public class Students {
	
//	int age;
//	String name;
	
//	if i did this this is easily accessable to another class but i want some restriction then do this.....
	
	private int age;
	private String name;
	
//	after making states private than make a public method  to get age....
	
	public int getAge() {
		return age;
	}
	
//	to set age use this ....
	
	public void setAge(int age) {
		if(age>20) {
			System.out.println("not valid age");
		}else {
			this.age=age;
		}
	}
	
	

	public static void main(String[] args) {
		

	}

}
