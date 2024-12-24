import java.util.Scanner;

public class ArmStrongNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a positive number");
		int n=sc.nextInt();
		int count=0; int temp=n;int sum=0; int n1=n;
		while(n>0)
		{
			n=n/10;
			count++;
		}
		while(temp>0)
		{
			int x=temp%10;
			int prod=1;
			for(int i=1;i<=count;i++)
			{
				prod=prod*x;
			}
			sum=sum+prod;
			temp=temp/10;
		}
		if(sum==n1)
			System.out.println(n1+" is a armstrong number");
		else
			System.out.println(n1+" is not a arm strong number");
		

	}

}
