package strings;

import java.util.Scanner;

public class P13 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String s=sc.next();
		s=s.toUpperCase();
		int vowel=0;
		int con=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='A' && ch<='Z')
			{
				if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
				{
					vowel++;
				}
				else
				{
					con++;
				}
			}
		}
		System.out.println("Count of vowels : "+vowel);
		System.out.println("Count of Consonents : "+con);
		
	}

}
