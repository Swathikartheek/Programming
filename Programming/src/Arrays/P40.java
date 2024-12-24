package Arrays;

public class P40 {

	public static void main(String[] args) {
		int[]a= {10,20,30,40,50};
		int[]b=new int[a.length-1];
		int index=3;
		for(int i=0;i<a.length-1;i++)
		{
			if(i<index)
			{
				b[i]=a[i];
			}
			else
			{
				b[i]=a[i+1];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
