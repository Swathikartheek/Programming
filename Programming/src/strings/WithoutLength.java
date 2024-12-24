package strings;

import java.util.Scanner;

public class WithoutLength {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String s=sc.next();
		int count=0;
		char[]ch=s.toCharArray();
		for(char c:ch)
		{
			count++;
		}
		System.out.println("Length :"+count);
	}

}
