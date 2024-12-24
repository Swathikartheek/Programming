import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sq=n*n;
		int sum=0;
		while(sq>0)
		{
			int res=sq%10;
			sum=sum+res;
			sq=sq/10;
			
		}
		if(sum==n)
			System.out.println(n+" is a neon number");
		else
			System.out.println(n+" is not a neon number");

	}

}
