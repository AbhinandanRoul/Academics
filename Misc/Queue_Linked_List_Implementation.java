import java.util.*;

//Initialising the Node of queue
class Node
{
	int info;
	Node next;
}

public class Queue_Linked_List_Implementation {
	
	
	static Node rear = null;
	static Scanner in = new Scanner (System.in);
	
	public static Node insert(Node rear1, Node front)
	{
		Node k=new Node();
		k.info=in.nextInt();
		k.next=null;
		
		//When the list is empty or inserting 1st element
		if(front==null && rear ==null)
		{
			front=k;
			rear=k;
		}
		
		//When there are some elements already present in the list
		else
		{
			rear.next=k;
			rear=k;
		}
		
		return front;
	}
	
	//Deleting an element of Queue
	public static Node delete(Node rear2, Node front)
	{
		
		//When there are no elements
		if(front==null)
			System.out.println("Empty Queue");
		
		// When the queue has 1 element
		else if(front==rear)
		{
			int itm=front.info;
			front=rear=null;
			System.out.println(itm+" is deleted.");
		}
		
		//When the queue has 2 or more elements
		else
		{
			int itm=front.info;
			front=front.next;
			System.out.println(itm+" has been deleted");
		}
		return front;
	}
	
	//Displaying the Queue Elements
	public static void display(Node front)
	{
		Node f = front;
		Node r = rear;
		
		if (f==null)
			System.out.println("THE QUEUE IS EMPTY");
		
		else
		{
			while (f!=rear.next)
			{
				System.out.print(f.info + " ");
				f=f.next;
			}
		System.out.println();
		}
		//return front;
	}

	
	public static void main(String[] args) 
	{
		Node front=null;
		while(true)
		{
		System.out.println("***MENU***");
		System.out.println("0: Exit");
		System.out.println("1: Insert");
		System.out.println("2: Delete");
		System.out.println("3: Display");
		System.out.println("Enter your choice");
		Scanner in=new Scanner(System.in);
		int choice=in.nextInt();
		
		switch(choice)
		{
		case 0: System.exit(0);
		case 1: 
			front=insert(rear, front);   
			break;
		case 2: 
			front=delete(rear, front);  
			break;
		case 3: 
			display(front);  
			break;
		default:
			System.out.println("Wrong choice");
		}
		}
	}
}
