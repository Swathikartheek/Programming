import java.util.Scanner;

public class SpecialTwoDigitNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two digit number");
		int n=sc.nextInt();
		if(n>10 &&n<99)
		{
			int first=n/10;
			int last=n%10;
			int sum=(first*last)+(first+last);
			if(sum==n)
			System.out.println(n +" is a special 2 digit number");
			else
				System.out.println(n + " is not a special 2 digit number");
		}
		else
		{
			System.out.println("Enter 2 digit number");
		}
		
	}

}
