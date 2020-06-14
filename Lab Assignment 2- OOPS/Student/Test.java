package Student;
public class Test extends Student
{
	public int mark1;
	public int mark2;
	
	public void input(int mark1, int mark2)
	{
		this.mark1=mark1;
		this.mark2=mark2;
	}
	public void output()
	{
		super.output();
		System.out.println("Mark 1:"+mark1+"\n"+"Mark 2:"+mark2);
	}
}