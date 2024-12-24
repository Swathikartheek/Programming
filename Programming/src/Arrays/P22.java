package Arrays;

import java.util.Scanner;

public class P22 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an Array");
		int size=sc.nextInt();
		int []a=new int[size];
		int []b=new int[a.length];
		System.out.println("Enter "+size+"elements to an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("elements present in b array");
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=0;i<b.length;i++) {
		System.out.println(b[i]);
		}
		

	}

}
