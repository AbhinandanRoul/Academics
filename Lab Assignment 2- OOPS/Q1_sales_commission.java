import java.util.Scanner;

class Commission
{
	int sales;
	
	Commission(int s)
	{
		sales=s;
	}
	double getCommission()
	{
		if(sales<500)
			return (0.02*sales);
		else if(sales>=500 && sales<5000)
			return(0.05*sales);
		else
			return (0.08*sales);
	}
}	
public class Q1_sales_commission {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int s=in.nextInt();
		if(s>0)
		{
			Commission k=new Commission(s);
			System.out.println(k.getCommission());
			
		}
		else
			System.out.println("Invalid Input");

	}

}
