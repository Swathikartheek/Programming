package Arrays;

public class Student {
	String name;
	int age;
	long contact;
	
	Student(String name, int age,long contact)
	{
		this.name=name;
		this.age=age;
		this.contact=contact;
	}
	
	public String toString()
	{
		return "[Name : "+name+ ", age : "+age+" , Contact : " +contact+ "]";
	}
	
	

}
