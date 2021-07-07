import java.util.*;

class node
{
	protected int regd_no;
	protected float mark;
	protected node next;
}

public class Linked_List {

	static Scanner in = new Scanner(System.in);
	
	//Creation of the Linked List

	public static node create(node start) 
	{

		char ch;
		node i = new node();
		do {
			node j = new node();
			System.out.println("Enter Registrstion number");
			j.regd_no = in.nextInt();
			System.out.println("Enter Mark");
			j.mark = in.nextFloat();
			j.next = null;
			if (start == null) {
				start = j;
				i = j;
			} else {
				i.next = j;
				i = j;
			}
			System.out.println("Enter Y to add next value in node.");
			ch = in.next().charAt(0);
		} while (ch == 'Y'|| ch=='y');
		return start;
	}

	// Display the Linked List
	
	public static node display(node start) {
		node n = new node();
		n = start;
		if (start == null) {
			System.out.println("Empty list");
		} else {
			System.out.println("List Created");
			while (n != null) {
				System.out.println("Registration number " + n.regd_no + " Mark " + n.mark);
				n = n.next;
			}
		}
		return start;
	}
// Inserting a Node at beginning
	
	public static node insbeg(node start) {
		Scanner in = new Scanner(System.in);
		node n = new node();
		System.out.println("Enter Registration number and marks");
		n.regd_no = in.nextInt();
		n.mark = in.nextFloat();
		n.next = start;
		start = n;
		return start;
	}

	// Inserting a node at end
	
	public static node insend(node start) {
		Scanner in = new Scanner(System.in);
		node n = new node();
		node a = new node();
		System.out.println("Enter Registration number and marks");
		a.regd_no = in.nextInt();
		a.mark = in.nextFloat();
		n = start;
		a.next = null;
		while (n.next != null) {
			n = n.next;
		}
		n.next = a;
		return start;
	}

	// Inserting a Node at any given position
	
	public static node insany(node start) {
		Scanner in = new Scanner(System.in);
		node n = new node();
		node a = new node();
		System.out.println("Enter Registration number and marks");
		a.regd_no = in.nextInt();
		a.mark = in.nextFloat();
		n = start;
		a.next = null;
		System.out.println("Enter location");
		int loc = in.nextInt();
		for (int i = 1; i < loc - 1 && n.next != null; i++)
		{
			n = n.next;
		}
		a.next = n.next;
		n.next = a;
		return start;
	}

	// Searching for a node using registration number
	
	public static node search(node start) 
	{
		node n = new node();
		n = start;
		if (start == null) 
		{
			System.out.println("List is empty.");
		} 
		else 
		{
			Scanner in = new Scanner(System.in);
			System.out.println("Enter Registration number to search");
			int q = in.nextInt();
			while (n != null)
			{
				if (q == n.regd_no) 
				{
					System.out.print("Enter marks to be updated");
					n.mark = in.nextFloat();
				}
				n = n.next;
			}
		}
		return start;
	}

	
	// Deleting a node at start
	
	public static node delbeg(node start) 
	{
		start = start.next;
		System.out.println(start);
		return start;
	}

	// Deleting a node at end
	
	public static node delend(node start) 
	{
  
		node n = start;
		node o = new node();
		while (n.next != null) // traversing till end
		{
			o = n; // keeps the last updated value
			n = n.next;
		}
		o.next = null;
		return start;
	}
	
	// Deleting a node by registration number
	
	public static node del_node_by_regno(node start)
	{
		node p=start;
		node q=new node();
		System.out.println("Enter the reg no. you want to delete");
		int flag=0;
		int reg=in.nextInt();
		while(p.next!=null)
		{
			if(p.regd_no==reg)
			{
				System.out.println("The deleted element is at:"+p+" REGD_NO is "+p.regd_no);
				q.next=p.next;
				flag=1;
				break;
				
			}
			q=p;
			p=p.next;
		}
		if(flag==0)
		{
			System.out.println("The registartion number entered is not present.");
		}
		return start;
		}
	

	// Deleting a node at given position
	
	public static node delany(node start) {

		node k = start;
		node n = new node();
		System.out.println("Enter location");
		int l = in.nextInt();
		for (int i = 1; i < l && k.next != null; i++) {
			n = k;
			k = k.next;
		}
		n.next = k.next;
		return start;
	}

	// Reversing the Linked List
	
	public static node rev(node start) 
	{
		node i = new node();
		node j = new node();
		node temp = new node();
		i = start;
		j = null;
		while (i != null) {
			temp = i.next;
			i.next = j;
			j = i;
			i = temp;
		}
		start = j;
		return start;
	}
	
	// Counting the number of Nodes in Linked List
	
	public static int count(node start)
	{
		int c = 0;
		node k = new node();
		k = start;
		while (k != null) {
			c++;
			k = k.next;
		}
		return c;
	}

	
	//Sorting algorithm uses bubble sort
	
	public static node sort(node start) {
		
		node i=start;
		node j=new node();
		for(i=start;i.next!=null;i=i.next)
		{
			for(j=start;j.next!=null;j=j.next)
			{
				if(j.mark<j.next.mark)
				{
					float temp=j.mark;
					int tmp=j.regd_no;
					j.mark=j.next.mark;
					j.regd_no=j.next.regd_no;
					j.next.mark=temp;
					j.next.regd_no=tmp;
				}
			}
		}
		
		return start;
	
	}

	public static void main(String[] args)
	{
		int c;
		node start = null;
		while (true)
		{
			System.out.println("****MENU*****");
			System.out.println("1:Creation");
			System.out.println("2:Display");
			System.out.println("3:Insert at beginning");
			System.out.println("4:Insert at end");
			System.out.println("5:Insert at specific location");
			System.out.println("6:Searching based on registration number");
			System.out.println("7:Delete at beginning");
			System.out.println("8:Delete at end");
			System.out.println("9:Delete at specific location");
			System.out.println("10:Reverse the list");
			System.out.println("11:Sorting the list");
			System.out.println("12:Number of nodes present");
			System.out.println("13: Delete Node by Regd No.");
			System.out.println("0:Exit");
			System.out.println("Enter the choice");
			c = in.nextInt();
			switch (c) {
			case 0:
				System.exit(0);
			case 1:
				start = create(start);
				break;
			case 2:
				start = display(start);
				break;
			case 3:
				start = insbeg(start);
				break;
			case 4:
				start = insend(start);
				break;
			case 5:
				start = insany(start);
				break;
			case 6:
				start = search(start);
				break;
			case 7:
				start = delbeg(start);
				break;
			case 8:
				start = delend(start);
				break;
			case 9:
				start = delany(start);
				break;
			case 10:
				start = rev(start);
				break;
			case 11:
				start = sort(start);
				break;
			case 12:
				System.out.println(count(start));
				break;
			case 13:
				System.out.println(del_node_by_regno(start));
				break;
			default:
				System.out.println("Wrong choice");
			}
		}
	}
}
