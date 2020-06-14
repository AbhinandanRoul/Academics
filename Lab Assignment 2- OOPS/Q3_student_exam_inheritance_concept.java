import java.util.Scanner;

class Student
{
	int roll;
	String name;
	String course;
	Scanner in=new Scanner(System.in);
	void input_Student()
	{
		System.out.println("Enter the details");
		roll=in.nextInt();
		name=in.next();
		course=in.next();
	}
	void display_Student()
	{
		System.out.println(roll+" "+name+" "+course);
	}
}

class exam extends Student
{
	int mark1,mark2,mark3;
	void input_marks()
	{
		
		mark1=in.nextInt();
		mark2=in.nextInt();
		mark3=in.nextInt();
	}
	void display_result()
	{
		
		System.out.println(mark1+" "+mark2+" "+mark3);
	}
}
public class Q3_student_exam_inheritance_concept {

	public static void main(String[] args) {
		
		exam a[]=new exam[5];
		for(int i=0;i<5;i++)
		{
			a[i]=new exam();
		}
		for(int i=0;i<5;i++)
		{
			a[i].input_Student();
			a[i].input_marks();
			a[i].display_Student();
			a[i].display_result();
			
		}

	}

}
