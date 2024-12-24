package Arrays;

public class P39 {

	public static void main(String[] args) {
		int[]a= {10,20,30,40};
		int[]b=new int[a.length+1];
		int ele=25;
		int index=2;
		b[index]=ele;
		for(int i=0;i<a.length;i++)
		{
			if(i<index)
			{
				b[i]=a[i];
			}
			else
			{
				b[i+1]=a[i];
			}
		}
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
