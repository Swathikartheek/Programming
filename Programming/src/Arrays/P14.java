package Arrays;

public class P14 {

	public static void main(String[] args) {
		int[]a= {11,12,13,14,15};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println(sum);

	}

}
