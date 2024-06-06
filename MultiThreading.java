class Mythread implements Runnable
{

    int threadNumber;
    Mythread(int threadNumber)
    {
        this.threadNumber=threadNumber;
    }
    @Override
    public void run() {
        for(int i=0;i<10;i++)
        {
            System.out.println("Inside THREAD-"+this.threadNumber);
        }
    }
}
public class MultiThreading {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1=new Thread(new Mythread(1));
        thread1.start();
        Thread thread2=new Thread(new Mythread(2));
        thread2.start();
        thread2.join();

    }
}
