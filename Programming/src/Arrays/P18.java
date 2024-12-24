package Arrays;

public class P18 {

	public static void main(String[] args) {
		
		Student[] s=new Student[3];
		s[0]= new Student("Kar",10,987654321l);
		s[1]=new Student ("Swa",11,976854321l);
		s[2]=new Student("nag",12,9482102374l);
		
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}

	}

}
