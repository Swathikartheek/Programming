package strings;

import java.util.Scanner;

public class ReverseSentence1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.nextLine();
		String out="";
		for(int i=s.length()-1;i>=0;i--)
		{
			out=out+s.charAt(i);
		}
		System.out.println(out);
	}

}
