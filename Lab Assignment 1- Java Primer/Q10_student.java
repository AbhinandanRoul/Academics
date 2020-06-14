class stu
{
	String name;
	int roll;
	double mark;
	
	void setData(String s,int n,double m)
	{
		name=s;
		roll=n;
		mark=m;
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll:"+roll);
		System.out.println("Marks:"+mark);
	}
}



public class Q10_student {

	public static void main(String[] args) {
		stu k=new stu();
		k.setData("Neel",10,100.23);
		k.display();

	}

}
