package Arrays;

import java.util.Arrays;

public class P28 {

	public static void main(String[] args) {
		int[]a= {10,20,40,50,70,80,90,60};
		Arrays.sort(a, a.length/2, a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
