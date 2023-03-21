package javaProgramming;
abstract class Shape
{
	protected int dim1;
	protected int dim2;
	Shape(int d1,int d2)
	{
		dim1=d1;
		dim2=d2;
	}
	abstract void area();
}
class Rectangle extends Shape
{
	Rectangle(int d1, int d2) {
		super(d1, d2);
	}

	void area()
	{
		System.out.println("Area of Rectangle is "+(dim1*dim2));
	}
}
class Square extends Shape
{
	Square(int d1, int d2) {
		super(d1, d2);
	}

	void area()
	{
		System.out.println("Area of Square is "+(dim1*dim2));
	}
}
public class AbstractEx {

	public static void main(String[] args) {
		Shape s1=new Rectangle(5,6);
		Shape s2=new Square(4,4);
		s1.area();
		s2.area();

	}

}
