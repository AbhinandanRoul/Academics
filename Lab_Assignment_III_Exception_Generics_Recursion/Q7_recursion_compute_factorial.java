import java.util.Scanner;

public class Q7_recursion_compute_factorial {
	public static int factorial(int n)
	{
		if(n==0)
			return 1;
		else
			return n*factorial(n-1);
		}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=in.nextInt();
		System.out.println(factorial(n));

	}

}
