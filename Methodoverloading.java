class Overloading
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
byte b=10;
Overloading O=new Overloading();
O.s(b,(int)101);
}
}