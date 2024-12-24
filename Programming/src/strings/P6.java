package strings;

import java.util.Scanner;

public class P6 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		char[] ch=s.toCharArray();
		boolean[] b=new boolean[ch.length];
		for(int i=0;i<ch.length;i++)
		{
			
			if(b[i]==false)
			{
				int count=1;
				for(int j=i+1;j<ch.length;j++)
				{
					if(ch[i]==ch[j])
					{
						count++;
						b[j]=true;
					}
				}
			
			System.out.println(ch[i]+"-->"+count);
			}
		}
		
	}

}
