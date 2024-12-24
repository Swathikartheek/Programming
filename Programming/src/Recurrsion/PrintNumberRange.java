package Recurrsion;

import java.util.Scanner;

public class PrintNumberRange {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		print(a,b);
	}
	public static void print(int a,int b)
	{
		if(a>b)
		{
			return;
		}
		System.out.println(a);
		a++;
		print(a,b);
	}

}
