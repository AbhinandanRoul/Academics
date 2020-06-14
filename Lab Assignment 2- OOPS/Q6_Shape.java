abstract class Shape
{
	abstract void area();
	
}

class square extends Shape
{
	double side;
	square(double side)
	{
		this.side=side;
	}
	void area()
	{
		System.out.println("Area of square:"+(side*side));
	}
}
class triangle extends Shape
{
	double side, height;
	triangle(double side, double height)
	{
		this.side=side;
		this.height=height;
	}
	void area()
	{
		System.out.println("Area of triangle:"+(0.5*side*height));
	}
}
class circle extends Shape
{
	double radius;
	circle(double radius)
	{
		this.radius=radius;
	}
	void area()
	{
		System.out.println("Area of circle:"+(Math.PI*radius*radius));
	}
}
public class Q6_Shape {

	public static void main(String[] args) {
		Shape k;
		k=new square(10);
		k.area();
		k=new triangle(12.3,8.2);
		k.area();
		k=new circle(9.4);
		k.area();
		
		
		

	}

}
