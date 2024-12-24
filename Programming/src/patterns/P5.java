package patterns;

public class P5 {
	public static void main(String[] args) {
		int n=3; char ch='A';
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(ch+++" ");
			}
			System.out.println();
		}
	}

}
