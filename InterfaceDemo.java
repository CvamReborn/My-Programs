interface OtherHumamBeing{
    int age=5;
    void thinking(float iq);
}
interface HumanBeing{
    int age = 0;
    float height=5f;
    void talking(String language);
    void thinking(int iq);
}
abstract class HumanBeings{
    int age;
    String name;
    float height;
    HumanBeings(String name,int age,float height)
    {
        this.age=age;
        this.height=height;
        this.name=name;
    }
    public abstract void talking(String language);
    public abstract void thinking(int iq);
}
class Indian extends HumanBeings implements HumanBeing,OtherHumamBeing{
    Indian(String name,int age,float height)
    {
        super(name,age,height);
    }
    public void talking(String language)
    {
        System.out.println("I talk in "+language);
    }
    public int talking(int number){
        System.out.println("I talk in "+number);
        return 1;
    }
    public void thinking(int iq){
        System.out.println("My iq is "+iq);
    }

    @Override
    public String toString()
    {
        return "[Name: "+name+" Height: "+super.height+" age: "+OtherHumamBeing.age+"]";
    }

    @Override
    public void thinking(float iq) {
        System.out.println("My iq is "+iq);
    }
}
public class InterfaceDemo {
    public static void main(String[] args) {
        HumanBeings indian=new Indian("rohan",23,6.5f);
        indian.talking("Hindi");
        System.out.println(indian.toString());

    }

}
