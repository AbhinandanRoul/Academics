import java.util.*;

public class Q5_odd_even_check_without_modulo_division_mul_operators
{
	public static void main(String args[])
	{
		Scanner in =new Scanner(System.in);
		System.out.println("enter value of n");
		int n =in.nextInt();
		boolean b =isOdd(n);
		if(b==true)
			System.out.println("odd");
		else
		  System.out.println("Even");
	}
	public static boolean isOdd(int n)
	{
		while(n>1)
		{
			n =n-2;
		}
		if(n==1)
		return true;
		else
			return false;
		}	
	}