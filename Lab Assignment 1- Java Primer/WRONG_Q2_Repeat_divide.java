import java.util.Scanner;

public class Q2_Repeat_divide {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=in.nextInt();
		int c=0;
		
		
		while(n>2)
		{
			n=n/2;
			if(n%2==0)
			c++;
		}
		System.out.println(c);

	}

}




/*int x=in.nextInt();
 * int c=0;
 * if(x>2)
 * {
 * while(x>=2)
 * {
 * x=x/2;
 * c++;
 * }
 * Sopln(c);
 * */
