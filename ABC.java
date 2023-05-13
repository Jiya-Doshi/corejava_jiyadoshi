class A
{
    void s();
    {
        try
        s1();
    System.out.println("s");
    System.out.println("s1");
    }
}

public class Ac
{
    public void s1()
    {
        try
        {
           s2();
           System.out.println("s1");
        }
        catch(Exception e)
        {
            System.out.println("after s1");
        }
    }
}