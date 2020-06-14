package Student;
public class Student
{
	public String name;
	public int roll;
	
	public void input(String name, int roll)
	{
		this.name=name;
		this.roll=roll;
	}
	
	public void output()
	{
		System.out.println("Name:"+name+"\n"+"Roll no."+roll);
	}
}

