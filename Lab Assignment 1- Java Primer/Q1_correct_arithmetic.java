import java.util.Scanner;

public class Q1_correct_arithmetic {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter a,b,c");
		int a=in.nextInt();
		int b=in.nextInt();
		int c=in.nextInt();
		if((a+b==c) || (a==b-c) ||	(a*b==c))
			System.out.println("They can be used in correct arithmetic formulae ");
		else
			System.out.println("They can't be used");

	}

}
