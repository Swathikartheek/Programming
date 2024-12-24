package strings;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a sentence");
		String s=sc.nextLine();
		String out="";
		String[] arr=s.split(" ");
		for(int i=arr.length-1;i>=0;i--) 
		{
			if(i==0)
				out=out+arr[i];
			else
				out=out+arr[i]+" ";
		}
		System.out.println(out);
	}

}
