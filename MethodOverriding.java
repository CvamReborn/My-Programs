class Animal{
	protected void walk()
	{
		System.out.println("Every animal walks....");
	}
	protected void talk()
	{
		System.out.println("Every animal talks....");
	}
}
class Human extends Animal{
	protected void walk()
	{
		System.out.println("Human walks using two legs...");
	}
	protected void talk()
	{
		System.out.println("Human talks using high level language...");
	}
	public void think()
	{
		System.out.println("Humans have brains to think...");
	}
}
class Dog extends Animal{
	protected void walk()
	{
		super.walk();
		System.out.println("Dog walks from four legs...");
	}
	protected void talk()
	{
		super.talk();
		System.out.println("Dog talks in dog language...");
	}
}
public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Animal newHuman=new Human();
        Animal newDog=new Dog();
        newHuman.talk();
        newDog.talk();
        //newHuman.think();
        //Human myhuman=new Animal();
        }

}
