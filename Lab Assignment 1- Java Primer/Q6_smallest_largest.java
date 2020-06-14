import java.util.Scanner;

public class A6_smallest_largest {
	
	public static int largest(int a[])
	{
		int l=a.length;
		int max=a[0];
		for(int x=1;x<l;x++)
		{
			if(a[x]>max)
				max=a[x];
		}
		return max;
	}
	
	public static int smallest(int a[])
	{
		int l=a.length;
		int min=a[0];
		for(int x=1;x<l;x++)
		{
			if(a[x]<min)
				min=a[x];
		}
		return min;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter length ");
		int n=in.nextInt();
		int a[]=new int[n];
		for(int x=0;x<n;x++)
			a[x]=in.nextInt();
		
		System.out.println("Largest number="+largest(a));
		System.out.println("Smallest number="+smallest(a));
		
			

	}

}
