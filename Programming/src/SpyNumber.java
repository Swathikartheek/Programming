import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		int sum=0;
		int prod=1;
		int temp=n;
		while(n>0)
		{
			int res=n%10;
			sum=sum+res;
			prod=prod*res;
			n=n/10;
			
		}
		
		if(sum==prod)
			System.out.println(temp+"is a neon number");
		else
			System.out.println(temp+"is not a neon number");

	}

}
