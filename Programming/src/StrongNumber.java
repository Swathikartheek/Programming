
public class StrongNumber {

	public static void main(String[] args) {
		for(int j=1;j<=1000;j++)
		{
			int n=j;
			int sum=0;
			int  temp=n;
			
			while(n>0)
			{
				int res=n%10;
				int fact=1;
				for(int i=1;i<=res;i++)
				{
					fact=fact*i;
				}
				sum=sum+fact;
				n=n/10;
			}
			if(sum==temp)
				System.out.println(temp);
		}

	}

}
