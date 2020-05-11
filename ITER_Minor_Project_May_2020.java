package testing;

import java.util.*;
class Node {

	int coef;
	int exp;
	Node next;
}
public class polynomial {
	static Node poly1 = null;
	static Node poly2= null;
	static Node q;
	static Scanner sc = new Scanner(System.in);
	public static Node create(Node start)
	{

		int ch;
		Node p = new Node();
		//System.out.println("Accepting Data for Polynomial");
		System.out.println("Enter the 1st term of the polynomial");
		System.out.println("Input coef");
		p.coef = sc.nextInt();
		System.out.println("Input Exponent");
	    p.exp=sc.nextInt();
		p.next = null;
		if (start == null) {
			start = p;
			q = p;
		}

		System.out.println("To continue press 1");
		System.out.println("To start entering data for new polynomial press 2");
		ch=sc.nextInt();
		while(ch==1)
		{
			p=new Node();
			System.out.println("Enter new term of same polynomial");
			System.out.println("Enter coefficient");
			p.coef=sc.nextInt();
			System.out.println("Enter Exponent");
			p.exp=sc.nextInt();
			p.next=null;
			q.next=p;
			q=p;
			System.out.println("To continue press1");
			System.out.println("To start entering data for new polynomial press 2");
			ch=sc.nextInt();
		}
		return start;
	}



	public static void display(Node start)
	{
		System.out.println("The polynomial is:");
		Node s = start;
		while (s != null) {
			System.out.print(s.coef+"X^"+s.exp+"+");
			s = s.next;
		}
		System.out.println("0");
	}


	//sorting
		public static void Bsort(Node s) {
			 Node i=new Node ();
			 Node j= new Node();
			 for (i=s;i.next!=null;i=i.next)
				 for(j=s;j.next!=null;j=j.next) {
					 if(j.exp<j.next.exp) {
						 int temp=0;
						 temp = j.exp;
						 j.exp = j.next.exp;
						 j.next.exp = temp;
					 }
				 }
			 System.out.println("the list has been sorted in descending order of exponent");
	     }




	static void poly_add(Node poly1, Node poly2)
	{
		Node ptr1;
		Node ptr2;
		ptr1=poly1;
		ptr2=poly2;
		Node ptr=new Node();
		Node poly=ptr;

		while((ptr1!=null) && (ptr2!=null))
		{
			if(ptr1.exp>ptr2.exp) // The term with higher exponent is added first
			{
				ptr.coef=ptr1.coef;
				ptr.exp=ptr1.exp;
				ptr1=ptr1.next;
			}
			else if(ptr1.exp<ptr2.exp)// The term with higher exponent is added first
			{
				ptr.coef=ptr2.coef;
				ptr.exp=ptr2.exp;
				ptr2=ptr2.next;
			}
			else
			{
				// In case if both the terms have same exponent then the coefficients are added
				ptr.coef=ptr1.coef+ptr2.coef;
				ptr.exp=ptr1.exp;
				ptr1=ptr1.next;
				ptr2=ptr2.next;

			}

			ptr.next=new Node();
			ptr=ptr.next;


		}
		while(ptr2 !=null) {

			ptr.coef=ptr2.coef;
			ptr.exp=ptr2.exp;
			ptr2=ptr2.next;
			ptr.next=new Node();
			ptr=ptr.next;
		}
		while (ptr1!=null) {
			ptr.coef=ptr1.coef;
			ptr.exp=ptr1.exp;
			ptr1=ptr1.next;

		    ptr.next=new Node();
			ptr=ptr.next;
		}

		ptr.next=null;

	display(poly);

	}


public static void main(String[] args) {
	System.out.println("Accepting data for 1st Polynomial");
		poly1=create(poly1);
		Bsort(poly1);
	System.out.println("Accepting Data for 2nd Polynomial");
		poly2=create(poly2);
		Bsort(poly2);
	System.out.println("Displaying Both the Polynomials");
		display(poly1);
		display(poly2);
	System.out.println("After ADDITION");
		poly_add(poly1, poly2);
		}

}
