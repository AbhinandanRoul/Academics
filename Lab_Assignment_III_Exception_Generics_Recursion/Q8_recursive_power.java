import java.util.Scanner;

public class Q8_recursive_power {
public static int pow(int x,int n)
{
	if(n==0)
		return 1;
	else
		return x*pow(x,n-1);
}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter x^n");
		int x=in.nextInt();
		int n=in.nextInt();
		System.out.println(pow(x,n));

	}

}
