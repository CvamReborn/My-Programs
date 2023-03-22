class StaticEx{
	public static int num;
	public static void show() {
		System.out.println("Value of num = "+num);
	}
	
}
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticEx.num++;
		//StaticEx s1=new StaticEx();
		//s1.show();
		StaticEx.show();
	}

}
