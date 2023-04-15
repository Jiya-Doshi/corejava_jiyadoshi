// Java Program to illustrate invocation of constructor
// Calling without usage of
// super keyword
class Base
{
    // constructor of super class
    Base()
    {
        System.out.println("Base class constuctor called");

    }
}
class Derived extends Base
{
    Derived()
    {
    System.out.println("Derived class constructor called");
    }
}
class GFG
{
    public static void main(String args[])
    {
        Derived D = new Derived();
        // Note : Here first super class constructor will be called there after derived
        // (sub class) constructor will be called.
    }
}