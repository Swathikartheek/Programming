package Arrays;

import java.util.Scanner;

public class P35 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int []a=new int[size];
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		System.out.println("Enter the n value from 1 to"+a.length);
		int n=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			int count=0;
			for(int j=0;j<a.length;j++)
			{
				if(a[j]>a[i])
				{
					count++;
				}
			}
			if(count==n-1)
				System.out.println(a[i]);
		}
		
		
		
	}

}
