public class MyThread2 implements Runnable
{
    public void run()
    {
        System.out.println("Now the Thread is running....");
    }

    //main method
    public static void main(String args[])
    {
        // creating an object of the class MyThread2
        Runnable r1=new MyThread2();

        // creating an object of the class Thread using Thread(Runnnable r, String name)
    }

}