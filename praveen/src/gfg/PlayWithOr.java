package gfg;

public class PlayWithOr {

	public static void main(String[] args) {
		
		int a[]= {1,2,3,4,5};
		for(int i=0;i<a.length-1;i++) {
			a[i]=a[i] | a[i+1];
		}
		for(int e:a) {
			System.out.print(e+" ");
		}
	}

}
