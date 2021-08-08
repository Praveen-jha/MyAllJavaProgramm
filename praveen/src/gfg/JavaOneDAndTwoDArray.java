package gfg;

public class JavaOneDAndTwoDArray {

	public static void main(String[] args) {
		int a[][]={ {1,2,3},{1,2,3},{1,2,3}};
		int n=a.length;	
		int sum=0;
		
		int b1[]= {1,3,5};
		int n1=b1.length;
		int max=b1[0];
		for(int i=0;i<n;i++) {
			int j=i;
			while(j==i) {
			sum+=	a[i][j];
			j++;
			}
			
		}
		for(int i=0;i<n1;i++) {
			if(b1[i]>max) {
				max=b1[i];
			}
		}
		System.out.println("sum is "+sum);
		System.out.println(max);

	}

}
