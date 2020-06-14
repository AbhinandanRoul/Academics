import java.util.Scanner;

public class Q5_isOdd {
	
	public static boolean isOdd(int n)
	{
		while(n>0)
		{
			n=n-2;
		}
		if(n%2!=0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		System.out.println(isOdd(n));
			
		

	}

}
