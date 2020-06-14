class Person
{
	String name;
	int age;
	Person(String n, int a)
	{
		name=n;
		age=a;
	}
}

class student extends Person
{
	String course;
	int roll;
	int marks;
	
	student(String c, int r, int m)
	{
		super("Neil Walter",18);
		course=c;
		roll=r;
		marks=m;
	}
	void display()
	{
		System.out.println("Name:"+name+"\n"+" Age:"+age);
		System.out.println("Course:"+course+"\n"+"Roll no."+roll+"\n"+"Marks:"+marks);
	}
	
	
}

class Teacher extends Person
{
	String subject_assigned;
	String contact_hour;
	
	Teacher(String sa, String c)
	{
		super("Vidya Kaur",58);
		subject_assigned=sa;
		contact_hour=c;
	}
	void display()
	{
		System.out.println("Name:"+name+"\n"+" Age:"+age);
		System.out.println("Subject:"+subject_assigned+"\n"+"Contact hours"+contact_hour);
	}
}
public class Q5_Person {

	public static void main(String[] args) {
		student k1=new student("CSE",15,100);
		k1.display();
		Teacher k2=new Teacher("International Trade"," 9 am to 3 pm");
		k2.display();
		
		

	}

}
