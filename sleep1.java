class th1 extends Thread
{
    public void run()
    {
        for (int i = 0; i<20; i++);
        {
            try{Thread.sleep(500);}
            catch(InterruptedException e)
        
        {
            System.out.println("Thread is running" );
        }
    }
    }
}

class xyz
{
    public static void main(String args[])
    {
        th1 t1 = new th1();
        t1.start();
        for (int i = 0; i<20; i++)
        {
            try{Thread.sleep(500);}
            catch(InterruptedException e)
        
        {
            System.out.println(i);
        }
        }
    }
}