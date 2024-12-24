package patterns;

public class P14 {

	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++)
		{
			int a=1;
			char ch='a';
			for(int j=0;j<n;j++)
			{
				if(i%2==0)
				{
				System.out.print(ch+++" ");
			}
			else
			{
				System.out.print(a+++" ");
			}
		}
		System.out.println();
	}}

}
