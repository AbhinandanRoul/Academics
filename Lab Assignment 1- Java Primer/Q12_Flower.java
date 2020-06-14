import java.util.Scanner;

class Flower
{
	String name;
	int petals;
	float price;
	Flower()
	{
		name="";
		petals=0;
		price=0.0f;
	}
	void input()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter name of flower, number of petals and price");
		name=in.next();
		petals=in.nextInt();
		price=in.nextFloat();
	}
	void display()
	{
		System.out.println(name);
		System.out.println(petals);
		System.out.println(price);
	}
}
public class Q12_Flower {

	public static void main(String[] args) {
		Flower k=new Flower();
		k.input();
		k.display();

	}

}
