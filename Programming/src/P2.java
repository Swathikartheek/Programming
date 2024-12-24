import java.util.Scanner;

public class P2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter one integer value");
		int n=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			int res=n%10;
			sum=sum+res;
			n=n/10;
		}
		System.out.println("sum:"+sum);

	}

}
