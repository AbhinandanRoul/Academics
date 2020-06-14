import java.util.Scanner;
public class Q10_recursive_Fibonacci_nth {
	public static int fib(int n)
	{
		if(n==0)
			return 0;
		else if(n==1)
			return 1;
		else
		{
			return fib(n-1)+fib(n-2); // Logic: f(5)=f(4)+f(3) 
		}
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the term required");
		int n=in.nextInt();
		System.out.println(fib(n));

	}

}
