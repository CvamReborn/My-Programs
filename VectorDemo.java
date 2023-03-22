import java.util.*;
public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		/*Vector<Integer> myvector=new Vector<Integer>();
		for(int i=0;i<5;i++)
		{
			System.out.print("myvector["+(i+1)+"]= ");
			myvector.add(sc.nextInt());
		}
		for(int i:myvector)
		{
			System.out.println(i);
		}
		/*for(int i=0;i<myvector.size();i++)
		{
			System.out.println(myvector.get(i));
		}*/
		Vector<Integer> v=new Vector<Integer>(3);
		v.add(11);
		v.add(12);
		v.add(13);
		v.add(14);
		v.add(15);
		System.out.println(v);

	}

}
