package patterns;

public class P6 {

	public static void main(String[] args) {
		int n=4;
		char ch='a';
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(ch+++" ");
			}
			System.out.println();
		}
	}

}
