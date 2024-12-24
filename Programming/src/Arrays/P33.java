package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P33 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println(" enter "+size+" elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Enter the n value from 1 to"+a.length);
		int  n=sc.nextInt();
		System.out.println(n+" Largest element is:");
		System.out.println(a[a.length-n]);
	}

}
