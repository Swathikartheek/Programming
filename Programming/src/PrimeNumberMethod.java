import java.util.Scanner;

public class PrimeNumberMethod {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the positive number");
		int p=sc.nextInt();
		boolean res= isPrime(p);
		if (res)
			System.out.println(p +" is a prime number");
		else
			System.out.println(p+" is not a prime number");
		
		
		

	}
	
	public static boolean isPrime(int n)
	{
	
		int q=n;
		int count=0;
		for(int i=2;i<=q/2;i++)
		{
			if(q%i==0)
			{
				return false;
			}
			
		}
		
	
	return true;
	}

}
