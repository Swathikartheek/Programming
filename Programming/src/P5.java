import java.util.Scanner;

public class P5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter two integer value");
		int x=sc.nextInt();
		int y=sc.nextInt();
		while(x<=y)
		{
			System.out.println(x);
			x++;
		}

	}

}
