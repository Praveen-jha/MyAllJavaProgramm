package string;
import java.util.Scanner;
public class AnagramCheck {

	public static void main(String[] args) {
		
		// This program is with bug...it don't check char is visited or not...
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your first word");
		String a=sc.nextLine();
		System.out.println("Enter second word");
		String b=sc.nextLine();
		
		boolean isAnagram=false;
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			isAnagram=false;
			for(int j=0;j<b.length();j++) {
				if(b.charAt(j)==c) {
					isAnagram=true;
					break;
				}
			}
			if(!isAnagram) break;
		}
		if(isAnagram) {
			System.out.println("anagram");
		}else {
			System.out.println("not anagram");
		}

	}

}
