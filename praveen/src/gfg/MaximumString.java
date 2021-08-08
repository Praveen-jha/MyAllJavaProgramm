package gfg;

public class MaximumString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		String names[] = { "Geek", "Geeks", "Geeksfor",
				  "GeeksforGeek", "GeeksforGeeks" };
//		String longest(String names[], int n){
			int count = 0,pos = 0;
			for(int i = 0 ; i < n ; i++){
			int current = names[i].length();
			if (current > count){
			count = current;
			pos = i;
			}
			
			}

	}

}
