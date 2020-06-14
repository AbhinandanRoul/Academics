import java.util.Scanner;

public class Q7_Odd_product_pair {
	
	public static boolean pairodd(int a[],int n)
	{		
		int flag=0;
		for(int x=0;x<n;x++)
		{
			for(int y=x+1;y<n-1;y++)
			{
				if(a[x]!=a[y])
				{
				int p=a[x]*a[y];
				if(p%2!=0)
				{
					flag++;
					
				}
					
			}
		}
		}
		if(flag>=1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter no. of elements required");
		int n=in.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		a[i]=in.nextInt();
		
		System.out.println(pairodd(a,n));
		
	}

}
