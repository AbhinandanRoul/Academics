
package second_pack;
import Student.*;
interface Sports
{
	int score1=5;
	int score2=10;
	void grandtotalmark();
	void score();
}

class show implements Sports
{
	public void grandtotalmark()
	{
		Test t=new Test();
		t.input("aaa", 45);
		t.input(70, 11);
		t.output();
		System.out.println("Grand Total Mark"+(t.mark1+t.mark2));
	}
	
	public void score()
	{
		System.out.println("Score"+(score1+score2));
	}
}

public class third  
{
	public static void main(String[] args)
	{
		Sports k=new show();
		k.grandtotalmark();
		k.score();
				
	}
}


