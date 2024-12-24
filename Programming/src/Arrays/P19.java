package Arrays;

import java.util.Scanner;

public class P19 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of an integer array");
		int size= sc.nextInt();
		int[]a=new int[size];
		System.out.println("Enter "+size+" elements into an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int large=a[0];
		for(int i=0;i<a.length;i++)
		{
		if(a[i]>large)
		{
			large=a[i];
		}
		}
		System.out.println("Largest Element is "+large);

	}

}
