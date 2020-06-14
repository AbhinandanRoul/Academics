class PointType
{
	int x,y;

	void setPoint(int x1,int y1)
	{
		x=x1;
		y=y1;
	}
	void printCoordinates()
	{
		System.out.println("X coordinates:"+x);
		System.out.println("Y coordinates:"+y);
		
	}
	public int xcoordinate()
	{
		return x;
	}
	public int ycoordinate()
	{
		return y;
	}
	
	
}

class CircleType extends PointType
{
	int radius;
	PointType centre;
	
	void setRadius(int r)
	{
		radius=r;
	}
	void printRadius()
	{
		System.out.println("The radius:"+radius);
	}
	void area()
	{
		System.out.print("The area:");
		System.out.println(Math.PI*radius*radius);
	}
	void circumference()
	{
		System.out.print("The circumference:");
		System.out.println(2*Math.PI*radius);
	}
	
}
public class Q4_PointType {

	public static void main(String[] args) {
		CircleType k=new CircleType();
		k.setRadius(25);
		k.setPoint(4,5);
		k.printCoordinates();
		k.printRadius();
		k.area();
		k.circumference();

	}

}
