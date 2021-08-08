package while_loop;

public class MultiplyOfNumber {

	public static void main(String[] args) {
		int n=543;
		int mul=1;
		while(n>0) {
			int lastDigit=n%10;
			mul*=lastDigit;
			n/=10;
		}
		System.out.println("Multiply of that number is :"+mul);

	}

}
