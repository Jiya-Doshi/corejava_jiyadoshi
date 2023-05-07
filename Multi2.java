class Multi2 implements Runnable 
{
    public void run()
    {
        System.out.println("Thread is running");
    }

    public static void main(String args[])
    {
        Multi2 t1 = new Multi2();
        Thread m1 = new Thread(t1); // Using constructor Thread(Runnable r)
        m1.start();
    }
}