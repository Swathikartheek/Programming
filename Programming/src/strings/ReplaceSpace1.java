package strings;

import java.util.Scanner;

public class ReplaceSpace1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		System.out.println("Enter the character");
		char ch=sc.next().charAt(0);
		String res="";
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' ')
			{
				res=res+ch;
			}
			else
			{
				res=res+s.charAt(i);
			}
		}
		System.out.println(res);
	}

}
