import java.util.Scanner;

public class Q14_recursive_product_two_number {
public static int prod(int a, int b) // add a b times
{
	if(b==0)
		return 0;
	else
		return a+prod(a,b-1);
}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=in.nextInt();
		int b=in.nextInt();
		System.out.println("The product:"+(prod(a,b)));

	}

}
