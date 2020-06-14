interface EmpInterface
{
	void displayEmp();
	void giveBonus(double amount);
}
abstract class Employee 
{
	long empID;
	String fName;
	String lName;
	double salary;
	
	
}
class Manager extends Employee implements EmpInterface
{
	Manager(long empID, String fName, String lName, double salary)
	{
		this.empID=empID;
		this.fName=fName;
		this.lName=lName;
		this.salary=salary;
	}
	public void displayEmp()
	{					
		System.out.println("Employee ID:"+empID);
		System.out.println("First Name:"+fName);
		System.out.println("Last Name:"+lName);
		System.out.println("Salary:"+salary);
	}
	public void giveBonus(double amount)
	{
		
		System.out.println("Bonus:"+amount);
	}
	
}


public class Q8_Employee {

	public static void main(String[] args) {
		Manager k=new Manager(87412354,"Suresh","Sharma",89125.47);
		k.displayEmp();
		k.giveBonus(100);

	}

}
