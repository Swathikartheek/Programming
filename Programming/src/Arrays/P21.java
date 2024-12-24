package Arrays;

import java.util.Scanner;

public class P21 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println("Enter "+size+" elements to an array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int i=0;
		int j=a.length-1;
		while(i<j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		System.out.println("Reversed array elements are ");
		for(int k=0;k<a.length;k++)
		{
			System.out.println(a[k]);
		}
		
		
	}

}
