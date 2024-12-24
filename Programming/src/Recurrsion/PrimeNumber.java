package Recurrsion;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the range");
		int a=sc.nextInt();
		int b=sc.nextInt();
		prime(a,b);
	}
	
	public static void prime(int a,int b)
	{
		if(a>b)
		{
			return;
		}
	for(int i=a;i<=b;i++)
	{
		int count=0;
		for(int j=2;j<i;j++)
		{
		if(j%i==0)
		{
			count++;
			
		}
		}
		
		if(count==0 &&i!=1)
		System.out.println(i);

		}
		
	}
	}

