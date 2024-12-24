package Arrays;

import java.util.Scanner;

public class P32 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println("Enter "+size+" elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the key element");
		int key=sc.nextInt();
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])
			{
				count++;
				break;
			}
		}
		if(count==1)
			System.out.println("Key element found");
		else
			System.out.println("Key element is not found");
			
	}

}
