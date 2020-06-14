import java.util.Scanner;

public class Q2_Favourite_Colors {

	public static void main(String[] args) {
		
		String favcolor []=new String [5];
		Scanner in=new Scanner(System.in);
		System.out.println("Enter your 5 favourite colors");
		try
		{
		for(int i=0;i<=favcolor.length;i++)
			favcolor[i]=in.next();
		}
		
		catch(Exception e1 )
		{
			System.out.println("You've entered more than 5 colours");
		}
		System.out.println("Exit");
		for(int i=0;i<favcolor.length;i++)
			System.out.print(favcolor[i]+"\t");
	}

}
