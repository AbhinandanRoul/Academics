class Box<T>
{
	T a;
	T b;
	void input(T a, T b)
	{
		this.a =a;
		this.b =b;
	}
	void display()
	{
		System.out.println(a+"\t"+b);
	}
}

public class Q4_generic_box {

	public static void main(String[] args) {
		Box <Integer> k= new Box <Integer>();
		k.input(45, 44);
		k.display();
		
		Box<String> k1=new Box<String>();
		k1.input("ABC","Hello");
		k1.display();
		
		Box<Object> k2=new Box<Object>();
		k2.input(4554,"I am Abhinandan");
		k2.display();

	}

}
