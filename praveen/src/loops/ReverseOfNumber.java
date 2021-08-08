package loops;

public class ReverseOfNumber {

	public static void main(String[] args) {
		int a=5432;
		int rev=0;
		while(a>0) {
		int n=a%10;
		rev=rev*10+n;
		a/=10;
		
		}
		System.out.print(rev);
		

	}

}
