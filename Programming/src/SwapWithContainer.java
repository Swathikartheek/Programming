import java.util.Scanner;

public class SwapWithContainer {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=sc.nextInt();
		System.out.println("Enter b value");
		int b=sc.nextInt();
		System.out.println("Before swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		int temp=a;
		a=b;
		b=temp;
		System.out.println("After swapping");
		System.out.println("a: "+a);
		System.out.println("b: "+b);
		

	}

}
