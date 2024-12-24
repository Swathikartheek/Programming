import java.util.Scanner;

public class XToThePowerOfN {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter x value");
		int x=sc.nextInt();
		System.out.println("Enter n value");
		int n=sc.nextInt();
		int prod=1;
		for(int i=1;i<=n;i++)
		{
			prod=prod*x;
		}
		System.out.println(prod);

	}

}
