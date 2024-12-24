import java.util.Scanner;

public class PrimeNumberEnding3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the starting range");
		int j=sc.nextInt();
		System.out.println("Enter the ending range");
		int nRange=sc.nextInt();
		for(int i=j;i<=nRange;i++)
		{
			int n=i;int count=0;
			for(int p=2;p<=n/2;p++)
			{
				if(n%p==0)
				{
				count++;	
				}
				
			}
			if(count==0 && n!=1)
			{
				if(n%10==3)
					System.out.println(n+" is a prime number");
				
				
				
				
				
				
				
			}
			}
				
	}

}
