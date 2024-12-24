package strings;

import java.util.Scanner;

public class P9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		char[]ch=s.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A' && ch[i]<='Z')
			{
				ch[i]+=32;
			}
		}
		String res=new String(ch);
		System.out.println(res);
	}

}
