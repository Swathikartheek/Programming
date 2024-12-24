package Arrays;

import java.util.Scanner;

public class P29 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n=sc.nextInt();
		int[]a=new int[n];
		System.out.println("Enter "+n+" elements to an array");
		for(int i=0;i<a.length-1;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int j=0;j<a.length-1;j++)
		{
			for(int i=0;i<a.length-1;i++)
			{
				if(a[i]>a[i+1])
				{
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
