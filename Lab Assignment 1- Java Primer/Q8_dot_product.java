import java.util.Scanner;

public class Q8_dot_product {

	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no. of elements to be entered");
	int n=in.nextInt();
	int a[]=new int[n];
	int b[]=new int[n];
	int x;
	System.out.println("Enter elements of Array A");
	for(x=0;x<n;x++)
		a[x]=in.nextInt();
	System.out.println("Enter elements of Array B");
	for(x=0;x<n;x++)
		b[x]=in.nextInt();
	
	for(int i=0;i<n;i++)
		System.out.println(a[i]*b[i]+"  ");

	}

}
