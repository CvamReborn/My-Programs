package javaProgramming;
class A
{
	int num;
	static class B{
		void print()
		{
			System.out.println("B class");
		}
	}
	class C{
		void print()
		{
			num++;
			System.out.println("C class"+num);
		}
	}
	void print1()
	{
		System.out.println("A class");
	}
	
}
public class NestedClassEx {

	public static void main(String[] args) {
		A.B b=new A.B();
		A.C c= new A().new C();
		c.print();
		b.print();
	}

}
