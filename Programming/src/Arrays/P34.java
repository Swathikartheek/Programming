package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class P34 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println(" Enter "+size+" element");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		Arrays.sort(a);
		System.out.println("Enter the key element");
		int key=sc.nextInt();
		System.out.println(key+" smallest element is:");
		System.out.println(a[key-1]);
		
	}

}
