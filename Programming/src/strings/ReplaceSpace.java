package strings;

import java.util.Scanner;

public class ReplaceSpace {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		String res=s.replace(' ', ch);
		System.out.println(res);
	}

}
