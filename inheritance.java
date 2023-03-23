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
class main
{
    public static void main(String arg[]){

    
    B ob = new B();
    ob.S1();
    ob.S();}

}