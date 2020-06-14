import java.util.Scanner;

public class Q16_recursive_palindrome {
	static String ns;
	static int x=0;
public static String rev(String s, int x)
{
	
	if(x==s.length())
		return ns;
	else
	{ 
		char ch=s.charAt(x);
		ns=ch+ns;
		return rev(s,(x+1));
	}
}
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the String");
		String a=in.next();
		if(a.equals(rev(a,0)))
		{
		System.out.println("Palindrome");
		}
		else
		{
			System.out.println("NOT");
		}

	}

}
