package Arrays;

import java.util.Arrays;

public class P31 {

	public static void main(String[] args) {
		int[] a= {10,12,14,13,15,16,18,19};
		Arrays.sort(a, a.length/2, a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}

	}

}
