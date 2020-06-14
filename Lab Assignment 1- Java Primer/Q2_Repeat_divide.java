
	import java.util.Scanner;

	public class Q2_Repeat_divide {

		public static void main(String[] args) {
			Scanner in=new Scanner(System.in);
			System.out.println("Enter a number");
			{


				int x=in.nextInt();
 				int c=0;
  				if(x>2)
 					{
  						while(x>=2)
   					 	{
  						x=x/2;
 						c++;
  						}
				 System.out.println(c);
				}
			}
		}
	}
  