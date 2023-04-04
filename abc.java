class abc{
int a=5,b,c1;
public void sum(){
    int c = a + b;
System.out.println("c = " + c);
}
 public void s1()
{
    int mul = a * b;
    System.out.println("mul = " + mul);
}
}


class Main
{
    public static void main(String args[])
    {
        abc a1 = new abc();
        a1.a = 10;
        a1.b = 20;
        System.out.println("This is c1 "+a1.c1);
        a1.sum();
        a1.s1();
    }
}