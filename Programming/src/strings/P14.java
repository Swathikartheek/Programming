package strings;

import java.util.Scanner;

public class P14 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.next();
		s=s.toUpperCase();
		String vowel="";
		String con="";
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					vowel=vowel+ch;
				}
				else
				{
					con=con+ch;
				}
			}
		}
		System.out.println("Vowels are: "+vowel);
		System.out.println("Consonents are: "+con);
	}

}
