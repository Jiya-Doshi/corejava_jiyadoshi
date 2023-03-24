class A 
{
    int a = 10;
    int b = 20;
    
    void S()
    {
        System.out.print("from A");
    }
}
class B extends A 
{
    void S1()
    {
        int c = a+b;
        System.out.print("c");
    }
    void S()
    {
        super.S();
        System.out.print("from B");
    }
}
class C extends B
{
    void S2()
    {
        System.out.print("from C");
    }
}

class main
{
    public static void main(String arg[])
    {
    C ob = new C();
    
    ob.S1();
    ob.S();
    ob.S2();
    }
    }