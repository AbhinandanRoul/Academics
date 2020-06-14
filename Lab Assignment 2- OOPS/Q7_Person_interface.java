interface Demo
{
	void display();
	void count();
}
class person implements Demo
{
	static int  maxcount;
	String name;
	person(String name)
	{
		this.name=name;
	}
	public void count()
	{
		name=name.trim();
		maxcount=name.length();
	}
	
	public void display()
	{
		System.out.println("Name:"+name);
		name=name.trim();
		int l=name.length();
		System.out.println("No. of characters "+l);
		
	}
}


public class Q7_Person_interface {

	public static void main(String[] args) {
		person p=new person("Abhinandan Roul");
		p.display();

	}

}
