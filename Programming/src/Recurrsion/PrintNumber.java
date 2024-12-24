package Recurrsion;

public class PrintNumber {

	public static void main(String[] args) {
		print(1);

	}
	public static void print(int n)
	{
		if(n>10)
		{
			return;
		}
		System.out.println(n);
		n++;
		print(n);
	}

}
