package Arrays;

import java.util.Scanner;

public class P30 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size of an array");
		int size=sc.nextInt();
		int []a=new int[size];
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<a.length;i++)
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
		System.out.println("After sorting");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
	
	
