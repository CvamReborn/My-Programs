public class SingletonClassDemo {
    private SingletonClassDemo() {
        //Do nothing
    }
    private static SingletonClassDemo instance;
    public static SingletonClassDemo getInstance()
    {
        if(instance==null) instance=new SingletonClassDemo();
        return instance;
    }

    public static void main(String[] args) {
        SingletonClassDemo variable=new SingletonClassDemo();
    }
}
