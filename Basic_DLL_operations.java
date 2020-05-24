/*Abhinandan Roul
*CSE-J
*1941012359
*/
import java.util.*;
class Node 
{
	protected int regd_no;
	protected float mark;
	protected Node next;
	protected Node prev;

}

public class Double_Linked_List_Student_Marks 
{

	static Scanner in = new Scanner(System.in);

	public static Node create(Node start, Node end) 
	{

		Node p = new Node();
		Node q;
		
		System.out.println("Enter the registration number:");
		p.regd_no = in.nextInt();
		System.out.println("Enter the marks:");
		p.mark = in.nextFloat();
		
		p.next = p.prev = null;
		start = end = p;
		System.out.println("To continue press 1");
		int option = in.nextInt();
		while (option == 1) 
		{
			q = new Node();
			System.out.println("Enter the registration number:");
			q.regd_no = in.nextInt();
			System.out.println("Enter the Marks");
			q.mark = in.nextFloat();
			q.next = q.prev = null;
			p.next = q;
			q.prev = p;
			p = q;
			end = p;
			System.out.println("to continue press 1");
			option = in.nextInt();
		}
		return start;
	}

	// Insertion at the beginning
	public static Node insBeg(Node start, Node end) 
	{

		Node p = new Node();
		System.out.println("Enter the Registration number");
		p.regd_no = in.nextInt();
		System.out.println("Enter Mark");
		p.mark = in.nextInt();
		p.next = null;
		p.prev = null;

		if (start == null || end == null) 
		{

			start = end = p;
		}

		else 
		{
			start.prev = p;
			p.next = start;
			start = p;
		}
		return start;
	}

	// Insertion at the end
	public static Node insEnd(Node start, Node end)
	{

		Node p = new Node();
		end = start;
		System.out.println("Enter the Registration number");
		p.regd_no = in.nextInt();
		System.out.println("Enter Mark");
		p.mark = in.nextInt();
		p.next = null;
		p.prev = null;
		if (start == null || end == null) {
			start = end = p;
		} 
		else
		{
			while (end.next != null)
			{
				end = end.next;
			}
			end.next = p;
			p.prev = end;

		}
		return start;
	}

	// Insertion at any position
	public static Node insAny(Node start, Node end)
	{

		Node p = new Node();
		System.out.println("Enter the location in which you want to insert");
		int loc = in.nextInt();
		System.out.println("Enter the Registration number");
		p.regd_no = in.nextInt();
		System.out.println("Enter the mark");
		p.mark = in.nextFloat();
		p.next = null;
		p.prev = null;

		Node s = start;
		int i = 1;

		while (i < loc - 1)
		{

			i++;
			s = s.next;
		}
		p.next = s.next;
		p.prev = s;
		s.next = p;
		s.next.prev = p;

		return start;
	}

// Deletion at the beginning
	public static Node delBeg(Node start, Node end)
	{

		if (start == null)
		{

			System.out.println("List is empty");
		}

		else 
		{

			start = start.next;
			start.prev = null;

		}
		return start;
	}

	// Deletion at the end
	public static Node delEnd(Node start, Node end) 
	{

		Node p = start;
		end = new Node();

		while (p.next != null) 
		{

			end = p;
			p = p.next;
		}
		p.prev = null;
		end.next = null;

		return start;
	}

	// Deletion at any position
	public static Node delAny(Node start, Node end) 
	{

		System.out.println("Enter the location in which you want to delete");
		int loc = in.nextInt();

		if (loc == 1) 
		{
			start = start.next;
			start.prev = null;
		} 
		else 
		{
			Node s = start;
			int i = 1;
			while (i < loc) 
			{
				i++;
				s = s.next;
			}
			s.prev.next = s.next;
			s.next.prev = s.prev;
			System.out.println(s.regd_no + " deleted");
		}

		return start;
	}

	// searching in double linked list

	public static void search(Node start) {
		int flag = 0;
		Node p = start;
		System.out.println("Enter the Registration number you want to search");
		int element = in.nextInt();
		while (p != null) {
			if (p.regd_no == element) {
				System.out.println("Registration number found :" + p);
				System.out.println("Enter the mark to be updated :");
				float m = in.nextFloat();
				p.mark = m;
				System.out.println("Mark updated");
				flag=1;
			}
			p = p.next;
		}
		if (flag == 0)
		{
			System.out.println("Not found");
		}
	}

// display
	public static void display(Node start, Node end) {
		Node s = start;
		System.out.println("Registration number" + " " + " Mark");
		while (s != null) {
			System.out.println(s.regd_no + "                      " + s.mark);
			s = s.next;
		}
	}

	public static void main(String[] args) {
		Node start = new Node();
		Node end = new Node();
		while (true) {
			System.out.println("******************MENU********************");
			System.out.println("0:Exit");
			System.out.println("1:Creation");
			System.out.println("2:Insert node at the beginning");
			System.out.println("3:Insert node at the end");
			System.out.println("4:Insert Node at specific locaton");
			System.out.println("5:Delete node at the beginning");
			System.out.println("6:Delete node at the end");
			System.out.println("7:Delete node at specific location");
			System.out.println("8:Search and update mark");
			System.out.println("9:Display");
			System.out.println("******************************************");
			System.out.println("Enter  choice:");

			int choice = in.nextInt();

			switch (choice) {

			case 0:
				System.out.println("Thank You!");
				System.exit(0);
			case 1:
				start = create(start, end);
				break;

			case 2:
				start = insBeg(start, end);
				break;

			case 3:
				start = insEnd(start, end);
				break;

			case 4:
				start = insAny(start, end);
				break;

			case 5:
				start = delBeg(start, end);
				break;

			case 6:
				start = delEnd(start, end);
				break;

			case 7:
				start = delAny(start, end);
				break;

			case 8:
				search(start);
				break;

			case 9:
				display(start, end);
				break;

			default:
				System.out.println("Wrong choice");

			}
		}
	}
}
