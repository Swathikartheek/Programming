import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rev=0;
		int temp=n;
		while(n>0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==temp)
		System.out.println(temp + " is a palindrome series");
		else
			System.out.println(temp+ " is not a palindrome series");

	}

}		
