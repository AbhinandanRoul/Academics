import java.util.Scanner;

class Person
{
String name;
 int age;
 Person()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter name and age");
		name=in.next();
		age=in.nextInt();
	}
}

class student extends Person
{
	String course;
	int roll;
	int marks;
	
	student()
	{
		super();
		System.out.println("Enter course, roll and mark");
		Scanner in=new Scanner(System.in);
		course=in.next();
		roll=in.nextInt();
		marks=in.nextInt();
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
	
	Teacher()
	{
		super();
		System.out.println("Enter suject and contatc hrs");
		Scanner in=new Scanner(System.in);
		subject_assigned=in.next();;
		contact_hour=in.next();
	}
	void display()
	{
		System.out.println("Name:"+name+"\n"+" Age:"+age);
		System.out.println("Subject:"+subject_assigned+"\n"+"Contact hours"+contact_hour);
	}
}
public class A2_Person_teacher_student {

	public static void main(String[] args) {
		/*student a[]=new student[5];
		//calls student class constructors
		for(int x=0;x<5;x++)
			a[x]=new student();
		//display
		for(int x=0;x<5;x++)
			a[x].display();
		
		
		Teacher b[]=new Teacher[5];
		//calls student class constructor
		for(int x=0;x<5;x++)
			b[x]=new Teacher();
		//display
		for(int x=0;x<5;x++)
			b[x].display();
		*/
		student k=new student();
		k.display();
		Teacher k1=new Teacher();
		k1.display();
		
		

	}

}

