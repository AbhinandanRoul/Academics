import java.util.Scanner;

class Node
{
	protected int regd_no;
	protected float mark;
	protected Node next;
	protected Node prev;
}


public class Double_Linked_List 
{
	static Scanner in=new Scanner(System.in);
	//static Node start;
	//static Node end;
	
	
	//Creating a NODE
	public static Node create(Node start, Node end)
	{
		Node k=new Node();
		System.out.println("Enter the registration number ");
		k.regd_no=in.nextInt();
		System.out.println("Enter the marks");
		k.mark=in.nextInt();
		k.next=k.prev=null;// as this is the 1st node next and prev is null
		start=end=k;
		System.out.println("Enter 1 to continue and 2 to stop");
		int choice=in.nextInt();
		
		// Loop to continue adding data
		while(choice==1)
		{
			Node k1=new Node();
			System.out.println("Enter the registration number ");
			k1.regd_no=in.nextInt();
			System.out.println("Enter the marks");
			k1.mark=in.nextInt();
			k1.next=k1.prev=null;
			end.next=k1;
			k1.prev=end;
			end=k1;
			System.out.println("Enter 1 to continue and 2 to stop");
			choice =in.nextInt();

		}
		return start;
	}
	
	
	// Inserting  a Node at Beginning
	public static Node insBeg(Node start, Node end)
	{
		Node p=new Node();
		//p=start;
		System.out.println("Enter the registration number to be inserted in the beginning.");
		p.regd_no=in.nextInt();
		System.out.println("Enter the marks to be inserted to the beginning");
		p.mark=in.nextFloat();
		p.next=null;
		p.prev=null;
		
		if(start==null|| end==null)
		{
			start=end=p;
		}
		else
		{
			p.next=start; // p is the new node and it links to the initial start node
			start.prev=p; // p is the previous node of initial start node
			start=p; //
		}
		return start;
	}
	
	
	//Inserting a Node at End
	public static Node insEnd(Node start, Node end)
	{
		
		
		Node p=new Node();
		System.out.println("Enter the registration number to be inserted at the End");
		p.regd_no=in.nextInt();
		System.out.println("Enter the marks to be inserted at the End");
		p.mark=in.nextFloat();
		p.next=null;
		p.prev=null;
		
		if(start==null|| end==null)
		{
		start=end=p;
		}
		else
		{
			p.prev=end;
			end.next=p;
			end=p;
		}
		return start;
	}
	
	
	//Inserting a Node at any position
	public static Node insAny(Node start, Node end)
	{
		//Creating a node to enter data
		Node p=new Node();
		System.out.println("Enter the registration number to be inserted");
		p.regd_no=in.nextInt();
		System.out.println("Enter the marks to be inserted ");
		p.mark=in.nextFloat();
		System.out.println("Enter the location where you want the element ot be inserted");
		int loc=in.nextInt();
		p.next=null;
		p.prev=null;
		
		int c=count(start);
		
		//Insert at beginning
		if(loc>=1 && loc<=c+1)
		{
			if(loc==1)
			{
				if(start==null)
					start=end=p;
			}
			else
			{
				p.next=start;
				p.prev=null;
				start.prev=null;
				start=p;
			}
		}
		
		//Insert at End
		else if(loc==c+1)
		{
			end.next=p;
			p.prev=end;
			end=p;
		}
		
		//Insert at Specific
		else
		{
			Node s=start;
			int i=1;
			while(i<loc-1)
			{
				i=i+1;
				s=s.next;
			}
			p.next=s.next;
			p.prev=s;
			s.next=p;
			s.next.prev=p;
		}
		
		return start;
		
	}
	
	//Counting the nodes
	public static int count(Node start)
	{
		Node s=start;
		int c=0;
		while(s!=null)
		{
			c=c+1;
			s=s.next;
		}
		return c;
	}
	
	
	// Delete at Beginning
	public static Node delBeg(Node start, Node end)
	{
		if(start==null)
			System.out.println("List is Empty");
		else
		{
			start=start.next;
			start.prev=null;
		}
		System.out.println("The Beginning Node is deleted successfully");
		
		return start;
	}
	
	
	//Delete at End
	public static Node delEnd(Node start, Node end)
	{
		if(start==null)
			System.out.println("List is Empty");
		else
		{
			end=end.prev;
			end.next=null;
		}
		return start;
	}
	
	
	//Delete at Any Given Position
	public static Node delAny(Node start, Node end)
	{
		System.out.println("Enter the location where you want ot delete");
		int loc=in.nextInt();
		
		
		int c=count(start);
		if(loc==1)
		{
			start=start.next;
			start.prev=null;
		}
		else if(loc==c)
		{
			end=end.prev;
			end.next=null;
		}
		else
		{
			Node s=start;
			int i=1;
			while(i<loc)
			{
				i=i+1;
				s=s.next;
			}
			s.prev.next=s.next;
			s.next.prev=s.prev;
			}
		
		return start;
		}
	
	
	
	//Searching a student based on registration number
	public static void Search(Node start)
	{

		Node s=start;
		int flag=0;
		int c=count(start);
		if(start==null)
			System.out.println("node is empty");
		else
		{
		System.out.println("Enter the Regd no. of the student you want to update marks");
		int reg=in.nextInt();
		while(s!=null)
		{
			if(s.regd_no==reg)
			{
				System.out.println("Enter updated marks");
				float new_mark=in.nextFloat();
				s.mark=new_mark;
				flag=1;
			}
			s=s.next;
			
		}
		if(flag==0)
		System.out.println("Registration number is not present in list");
		
		}
		
	}
	
	public static Node display(Node start, Node end )
	{
		Node k=start;
		while(k!=null)
		{   
		System.out.println("The registration number:"+k.regd_no+"\n"+"The mark:"+k.mark);
		k=k.next;
		}
		if(start==null)
		{
			System.out.println("Empty List");
		}
		
		return start;
	}
	public static void main(String[] args)
	{
		int c;
		Node start = null;
		Node end=null;
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
		
			System.out.println("0:Exit");
			System.out.println("Enter the choice");
			c = in.nextInt();
			switch (c) {
			case 0:
				System.exit(0);
			case 1:
				start = create(start,end);
				break;
			case 2:
				start = display(start,end);
				break;
			case 3:
				start = insBeg(start,end);
				break;
			case 4:
				start = insEnd(start,end);
				break;
			case 5:
				start = insAny(start,end);
				break;
			case 6:
						Search(start);
				break;
			case 7:
				start = delBeg(start,end);
				break;
			case 8:
				start = delEnd(start,end);
				break;
			case 9:
				start = delAny(start,end);
				break;
			
			default:
				System.out.println("Wrong choice");
			}
		}
	}

}

