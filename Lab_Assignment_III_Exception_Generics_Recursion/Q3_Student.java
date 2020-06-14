import java.util.Scanner;
class MarksOutOfBoundException extends Exception 
{ 
	String s1;
	MarksOutOfBoundException(String s1)
	{
		this.s1=s1;
	}
	public String toString()
	{
		return "MarksOutOfBoundException "+s1;
		} 
}
 
public class Q3_Student 
{ 
    
    public static void main(String args[]) 
    { 
    	Scanner in=new Scanner(System.in);
    	System.out.println("Enter name of the student and marks");
    	String name=in.nextLine();
    	int marks=in.nextInt();
        try
        { 
        	if(marks>100)
        		throw new MarksOutOfBoundException("You've entered more marks");
		
		else
		{
			System.out.println("Name:"+name+"\n"+"Marks:"+marks);
		}
        }   
        catch (MarksOutOfBoundException e) 
        { 
            System.out.println(e); 
  
              
        } 
    } 
} 
	
	
