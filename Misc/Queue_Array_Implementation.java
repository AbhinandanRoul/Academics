import java.util.Scanner;
public class Queue_Array_Implementation 
{
	static Scanner in =new Scanner(System.in);

public static void insert(int Q[])
{
	System.out.println("Enter a element ");
	int ele=in.nextInt();
	if(rear==MAX-1)
		System.out.println("Overflow");
	else if(front==-1 && rear ==-1)
	{
		front=0;
		rear=0;
	}	
	else
		rear=rear+1;
	Q[rear]=ele;
}

public static void delete(int Q[])
{
	if(front==-1 || front>rear)
		System.out.println("Underflow");
	else
	{
		int item=Q[front];
		System.out.println("The deleted element is:"+item);
		
		
		if(front==rear)
		{
			front=-1;
			rear=-1;
		}
		else
		{
			front=front+1;
		}
	}
	
}

public static void display(int Q[])
{
	System.out.println("Displaying the elements");
	int i;
	if(rear==-1)
		System.out.println("Empty queue");
	else
	{
		for(i=front;i<=rear;i++)
			System.out.println(Q[i]);
		
	}
}

public static final int MAX=5;
public static int front=-1;
public static int rear=-1;
public static void main(String[] args)
{
	Scanner in=new Scanner(System.in);
	int queue[]=new int[MAX];
	while(true)
	{
	System.out.println("***MENU***");
	System.out.println("0: Exit");
	System.out.println("1: Insert");
	System.out.println("2: Delete");
	System.out.println("3: Display");
	System.out.println("Enter your choice");
	int choice=in.nextInt();
		switch(choice)
		{
		case 0:
			System.exit(0);
		case 1:
			insert(queue);
			break;
		case 2:
			delete(queue);
			break;
		case 3:
			display(queue);
			break;
		default:
			System.out.println("Invalid choice");
		}
	}
}
}
