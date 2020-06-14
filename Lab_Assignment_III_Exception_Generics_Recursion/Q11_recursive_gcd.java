import java.util.Scanner;

public class Q11_recursive_gcd {
public static int gcd(int a,int b)
{
	if(b==0)
		return a;
	else
		return gcd(b,a%b);
}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println("The GCD:"+gcd(a,b));

	}

}
