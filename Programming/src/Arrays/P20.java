package Arrays;

import java.util.Scanner;

public class P20 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println("Enter "+size+" elements into an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		int small=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(small>a[i])
			{
				small=a[i];
			}
		}
		
		System.out.println("Smallest number is "+small);

	}

}
