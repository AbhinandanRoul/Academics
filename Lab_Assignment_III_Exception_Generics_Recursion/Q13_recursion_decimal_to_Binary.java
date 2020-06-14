import java.util.Scanner;

public class Q13_recursion_decimal_to_Binary {
	static String s="";
	public static String dectobin(int n)
	{
		if(n==0)        
			return s;
		else
		{
			int a=n%2;
			s=a+s;
			return dectobin(n/2);
			
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=in.nextInt();
		System.out.println("The binary:"+dectobin(a));

	}

}
