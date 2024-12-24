import java.util.Scanner;

public class P1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the integer value");
		int n=sc.nextInt();
		while(n>0)
		{
			int res=n%10;
			System.out.println(res);
			n=n/10;
		}

	}

}
