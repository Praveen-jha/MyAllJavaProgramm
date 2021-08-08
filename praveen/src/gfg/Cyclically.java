package gfg;

public class Cyclically {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,5};
		int n=a.length;
		System.out.println(n);
		int x=a[n-1];
		for(int i=n-2;i>=0;i--) {
			a[i+1]=a[i];
		}
		a[0]=x;
		for(int e:a) {
			System.out.print(e+" ");
		}

	}

}
