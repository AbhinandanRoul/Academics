import java.util.Scanner;

public class Q9_recursive_digit_reverse {
	static int s=0;
	public static int drev(int m)
	{
		int a=0;
		if(m==0)
			return s;
		else
		{
			a=m%10;
			s=s*10+a;
			return drev(m/10);
		}
			
		
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		System.out.println(drev(n));
	}

}
