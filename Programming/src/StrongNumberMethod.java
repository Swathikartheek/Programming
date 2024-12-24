import java.util.Scanner;

public class StrongNumberMethod {
	
	public static String isStrongNumber(int n)
	{
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
			return "Strong Number";
		
		else
			return "Not a strong number";

	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		
		int n=sc.nextInt();
		String s=isStrongNumber(n);
		
		if(s=="Strong Number")
			System.out.println(n+" is a strong number");
		else
			System.out.println(n+" is not a strong number");
		
		

	}

}
