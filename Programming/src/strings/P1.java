package strings;

import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		for(int i=0;i<s.length();i++)
		{
			System.out.println(s.charAt(i));
		}
	}

}
