interface shapes{
	double findArea();
	double findPeri();
}
class Rect implements shapes{
	private double length,width;
	Rect(double length,double width)
	{
		this.length=length;
		this.width=width;
	}
	public double findArea()
	{
		return length*width;
	}
	public double findPeri()
	{
		return 2*(this.length+this.width);
	}
}
class Square implements shapes{
	private double side;
	Square(double side)
	{
		this.side=side;
	}
	public double findPeri()
	{
		return 4*side;
	}
	public double findArea()
	{
		return side*side;
	}
}
public class InterfaceImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Rect obj1=new Rect(1,2);
         Square obj2=new Square(4);
         shapes obj3;
         obj3=new Rect(2,3);
         System.out.println("Area of Rectangle: "+obj3.findArea());
        /*System.out.println("Area of Rectanhgle: "+obj1.findArea());
        System.out.println("Perimeter of Rectanhgle: "+obj1.findPeri());
        System.out.println("Area of Square : "+obj2.findArea());
        System.out.println("Perimeter of Sqaure: "+obj2.findPeri());*/
	}

}
