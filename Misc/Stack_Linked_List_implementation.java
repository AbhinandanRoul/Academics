/*Abhinandan Roul
 * 1941012359
 * CSE-J
 */
import java.util.Scanner;

 class Node 
{

	int info;
	Node next;
	
}

public class stack_Linked_List
{
	static Scanner in=new Scanner(System.in);


public static Node push(Node top)
{
	
	Node p=new Node();
	System.out.println("Enter the element");
	p.info=in.nextInt();
	p.next=null;
	if(top==null)
		top=p;
	else
	{
		p.next=top;
		top=p;
	}
	return top;
	}


public static Node Pop(Node top)
{
	if(top==null)
		System.out.println("List is empty");
	else
	{
		int item=top.info;
		System.out.println(item+" is removed");
		top=top.next;
	}
	return top;
}


public static void display(Node top)
{
	Node s=top;
	while(s!=null)
	{
		System.out.println(s.info);
		s=s.next;
	}
}


public static void main(String[] args)
{
	//Scanner in=new Scanner(System.in);
	Node top;
	top=null;
	while(true)
	{
		System.out.println("****MENU****");
		System.out.println("0:Exit");
		System.out.println("1:Push");
		System.out.println("2:Pop");
		System.out.println("3:Display");
		System.out.println("Enter your choice");
		int choice=in.nextInt();
		switch(choice)
		{
		case 0:
      System.out.println("Thank You");
			System.exit(0);
		case 1:
			top=push(top);
			break;
			
		case 2:
			top=Pop(top);
			break;
			
		case 3:
			display(top);
			break;
		default:
			System.out.println("Wrong choice");
		}
	}
	}
}
