package strings;

public class immutable {

	public static void main(String[] args) {
		String s1="hi";
		String s2="hi";
		System.out.println(s1==s2);
		s1=s1+"hello";
		if(s1==s2)
			System.out.println("Strings are not immutable");
		else
			System.out.println("Strings are immutable");
	}

}
