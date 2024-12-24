package Arrays;

public class P27 {

	public static void main(String[] args) {
int[] a= {10,20,30,11,13,17,18,18,12};
		
		for (int i=0;i< a.length;i++) {
			
		
		
			int n=a[i];
			int count=0;
			for(int j=2;j<n;j++)
			{
				if(n%j==0)
				{
					count++;
					break;
				}
			}
			
			
				if(count==0 && n!=1)
				{
					System.out.println( n+" is a prime number");
				}
				
		}	

	}

}
