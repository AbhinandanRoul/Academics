import java.util.Scanner;

public class Q1_lucky_number {

	public static void checkLucky(int n) {
		
		if(n<0)
		{
			throw new NumberFormatException("It is a negative number ");
		}
		else
		{
			System.out.println("Positive number");
		}
}
	public static void main(String[] args)
	{
		System.out.println("Enter your Lucky Number");
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
	
		checkLucky(n);
	}
}

