package Arrays;

import java.util.Scanner;

public class P16 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int []a=new int[size];
		System.out.println("enter "+size+" number of elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("array after entering the element");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
