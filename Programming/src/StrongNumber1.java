import java.util.Scanner;

public class StrongNumber1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		int sum=0;
		int  temp=n;
		
		while(n>0)
		{
			int res=n%10;
			int fact=1;
			for(int i=1;i<=res;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==temp)
			System.out.println(temp+"is a strong number");
		else
			System.out.println(temp+"is not a strong number");

	}

}
