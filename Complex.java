package HelloWord;

public class Complex {
	private Double realpart;
	private Double imaginarypart;
	Complex(double realpart,double imaginarypart)//parameterized constructor
	{
		this.realpart=realpart;
		this.imaginarypart=imaginarypart;
	}
	Complex()//default constructor
	{
		this.realpart=realpart=1.00;
		this.imaginarypart=imaginarypart=1.00;
	}
	Complex add(Complex c)//Adding two Complex Object
	{
		Double realpartres=c.realpart+this.realpart;
		Double imaginarypartres=c.imaginarypart+this.imaginarypart;
		Complex sumObj=new Complex(realpartres,imaginarypartres);
		return sumObj;
	}
	Complex subtract(Complex c)//Subrtacting two Complex Object
	{
		Double realpartres=c.realpart-this.realpart;
		Double imaginarypartres=c.imaginarypart-this.imaginarypart;
		Complex subObj=new Complex(realpartres,imaginarypartres);
		return subObj;
	}
	void printComplex()
	{
		if(this.realpart>0 && this.imaginarypart>0)
		{
			System.out.println("Sum= "+this.realpart+"+"+this.imaginarypart+"i");
		}
		if(this.realpart<0 && this.imaginarypart<0)
		{
			System.out.println("Sum= "+this.realpart+this.imaginarypart+"i");
		}
		if(this.realpart<0 && this.imaginarypart>0)
		{
			System.out.println("Sum= "+this.realpart+"+"+this.imaginarypart+"i");
		}
		if(this.realpart>0 && this.imaginarypart<0)
		{
			System.out.println("Sum= "+this.realpart+this.imaginarypart+"i");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Complex c1=new Complex(5,4);
		c1.printComplex();
		Complex c2=new Complex(6,4);
		c2.printComplex();
		Complex c3=c1.add(c2);
		c3.printComplex();

	}

}
