interface A
{
    void s();
}
interface B extends A
{
    void s1();
}

class C implements B 
{
    public void s()
    {
        System.out.println("This day");
    }
    public void s1()
    {
        System.out.println("This week");
    }
    void s2()
    {
        System.out.println("This year");
    }
}

class Main
{
    public static void main(String args[])
    {
        B b = new C();
        b.s();
        b.s1();
    }
}