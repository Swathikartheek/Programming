package Recurrsion;

public class PrintNumberupto100 {

	public static void main(String[] args) {
		print(1);
	}
	public static void print(int n)
	{
		if(n>100)
		{
			return;
		}
		System.out.println(n);
		n++;
		print(n);
	}

}
