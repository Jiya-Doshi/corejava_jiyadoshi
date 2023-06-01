 class T1 extends Thread
{
     
      public void run()
    {
        for (int i = 0; i<20; i++);
        {
            try{Thread.sleep(500);}
            catch(InterruptedException e)
        
        {
            System.out.println("0" );
        }
    }
    }


    public static void main(String args[])
    {
        th1 t1 = new th1();
        th1 t2 = new th1();
        t1.start();
        t2.start();
}

}