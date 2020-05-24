import java.util.*;
public class Stack {
	static Scanner in=new Scanner(System.in);
	
	public static int push(int S[],int top)
	{
		if(top==MAX-1)
			System.out.println("Stack is full");
		else
		{
			System.out.println("Enter an element");
			int item=in.nextInt();
			top=top+1;
			S[top]=item;
			System.out.println(item+" is inserted succesfully");
		}
		return top;
		
	}
	
	
	public static int pop(int S[],int top)
	{
		if(top==-1)
			System.out.println("No element is present");
		else
		{
			
			System.out.println("The element removed is:"+S[top]);
			top=top-1;
		}
		return top;
	}
	
	
	
	public static void display(int S[],int top)
	{	
		System.out.println("The elements in your stack are:");
		while(top!=-1)
		{
			System.out.println(S[top]);
			top--;
		}
			
	}
	
	
	
	public static boolean isEmpty(int top)
	{
		if(top==-1)
		{
			System.out.println("The stack is empty");
			return true;
		}
		else

		{
			System.out.println("The stack is not empty");
			return false;
		}
	}
	
	public static boolean isFull(int top)
	{
		if(top==MAX-1)
		{
			System.out.println("The stack is full");
			return true;
		}
		
		else
		{
			System.out.println("The stack is not full");
			return false;
		}
	}
	
	
	public static final int MAX=10;
	public static void main(String[] args)
	{
	//Scanner in=new Scanner(System.in);
	int stack[]=new int[MAX];
	int top=-1;
	while(true)
	{
	System.out.println("***MENU***");
	System.out.println("0: Exit");
	System.out.println("1: Push");
	System.out.println("2: Pop");
	System.out.println("3: Display");
	System.out.println("4: Check if the stack is empty");
	System.out.println("5: Check if the stack is full ");
	System.out.println("Enter your choice");
	int choice=in.nextInt();
	switch(choice)
	{
	case 0:
		System.out.println("Thank You!");
		System.exit(0);
		
		break;
	case 1:
		top=push(stack,top);
	break;
	case 2:
		top=pop(stack,top);
		break;
	case 3:
		display(stack,top);
		break;
	case 4:
		boolean k=isEmpty(top);
		break;
	case 5:
		boolean k1=isFull(top);
		break;
	default:
	System.out.println("Invalid choice");

	}
	}
	}	
}
	
