import java.util.Scanner;

class student
{
	String name;
	int roll;
	int mark;
	void setData()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter name,roll  and mark");
		name=in.next();
		roll=in.nextInt();
		mark=in.nextInt();
	}
	void display()
	{
		System.out.println("Name:"+name);
		System.out.println("Roll:"+roll);
		System.out.println("Marks:"+mark);
	}
}
public class Q9_student { // the name of the class should be StudentDetails

	public static void main(String[] args) {
		student k1=new student();
		student k2=new student();
		student k3=new student();
		k1.setData();
		k2.setData();
		k3.setData();
		k1.display();
		k2.display();
		k3.display();
		
		

	}

}
