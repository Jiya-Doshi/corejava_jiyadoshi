class A 
{
    int a = 10;
    int b = 30;
    void S()
    {
        System.out.println("from A");

    }
}
class B extends A
{
    void S1()
    {
       int c = a * b;
        System.out.println("c");

    }
    void S()
    {
        super.S();
        System.out.println("from B");
    }
}
class C extends B
{
   void S2()
   {
    System.out.println("from C");
   }
}
class Main
{
    public static void main(String args[])
    {
        C ob = new C();
        ob.S1();
        ob.S();
        ob.S2();
    }
}