import java.util.Scanner;

class Point
{
	int x;
	int y;
	void setPoint()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter value");
		x=in.nextInt();
		y=in.nextInt();
	}
	void findDistance(Point P, Point P1)
	{
		double dis=Math.sqrt(Math.pow(P1.x-P.x, 2)+Math.pow((P1.y-P.y),2));
		System.out.println(dis);
	}
}
public class Q11_distance_between_points {

	public static void main(String[] args) {
		Point P=new Point();
		Point P1=new Point();
		P.setPoint();
		P1.setPoint();
		P.findDistance(P, P1);

	}

}
