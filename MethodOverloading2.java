 class Overloading2
{
void s(byte a,int b)
{
System.out.print("THIS IS INT1");
}
void s(int a,int b)
{
System.out.print("THIS IS INT2");
}
void s(long a,int b)
{
System.out.print("THIS IS INT3");
}
}
class Main
{
public static void main(String args[])
{
byte b=20;
Overloading2 O=new Overloading2();
O.s(b,(int)101);
}
}