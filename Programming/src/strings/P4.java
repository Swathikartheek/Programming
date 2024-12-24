package strings;

import java.util.Scanner;

public class P4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		String rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev))
			System.out.println("Palindrome string");
		else
			System.out.println("Not a palindrome string");
		
	}

}
