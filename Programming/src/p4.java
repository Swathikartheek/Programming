import java.util.Scanner;

public class p4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter one integer value");
		int n=sc.nextInt();
		int prod=1;
		while(n>0)
		{
			int res=n%10;
			prod=prod*res;
			n=n/10;
		}
		System.out.println("product of the number:"+prod);

	}

}
