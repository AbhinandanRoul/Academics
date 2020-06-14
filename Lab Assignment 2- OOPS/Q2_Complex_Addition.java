class Complex
{
	int real,imag;
	void setData(int r, int i)
	{
		real=r;
		imag=i;
	}
	public Complex add(Complex a, Complex b)
	{
		Complex k=new Complex();
		k.real=a.real+b.real;
		k.imag=a.imag+b.imag;
		return k;
	}
	void display()
	{
		System.out.println(real+"+i"+imag);
	}
}
public class Q2_Complex_Addition {

	public static void main(String[] args) {
		Complex a=new Complex();
		Complex b=new Complex();
		Complex c=new Complex();
		a.setData(4,8);
		b.setData(87,5);
		a.display();
		b.display();
		c=c.add(a,b);
		c.display();

	}

}
