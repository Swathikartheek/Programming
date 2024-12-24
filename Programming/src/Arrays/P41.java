package Arrays;

import java.util.Arrays;

public class P41 {

	public static void main(String[] args) {
		int[]a= {10,20,30,40};
		int[]b= {10,20,30,40};
		boolean res=Arrays.equals(a, b);
		if(res)
			System.out.println("Both arrays are similar");
		else
			System.out.println("Both arrays are not similar");
	}

}
