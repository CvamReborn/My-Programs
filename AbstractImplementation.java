abstract class Shape{
	protected double length,width;
	Shape(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	abstract void findArea();
}
class rectangle extends Shape{
	rectangle(double length,double width)
	{
		super(length,width);
	}
	void findArea()
	{
		System.out.println("Area of Rectangle: "+(length*width));
	}
}
public class AbstractImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj1=new rectangle(1,3);
		obj1.findArea();

	}

}
