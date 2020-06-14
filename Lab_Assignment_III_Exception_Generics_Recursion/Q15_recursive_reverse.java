import java.util.Scanner;

public class Q15_recursive_reverse {
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
		System.out.println(rev(a,0));

	}

}
