package Arrays;

public class P17 {

	public static void main(String[] args) {
		Emp [] e=new Emp[5];
	    e[0] = new Emp("dinga",1,25000);
		e[1]=new Emp("Kar",2,15000);
		e[2]=new Emp("swa",3,10000);
		e[3]=new Emp("La",4,5000);
		e[4]=new Emp("Sam",5,17000);
		for(int i=0;i<e.length;i++)
		{
			System.out.println(e[i]);
		}

	}

}
