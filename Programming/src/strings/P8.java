package strings;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		ch-=32;
		System.out.println(ch);
	}

}
