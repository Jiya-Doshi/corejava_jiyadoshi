interface Parentinterface
{
    void parentMethod();
}

interface ChildInterface extends Parentinterface
{
    void childMethod();
}

class ImplementingClass implements ChildInterface
{
    public void childMethod()
    {
        System.out.println("Child Interface Method:");
    }
    public void parentMethod()
    {
        System.out.println("Parent Method Calling:");
    }
}

class BInterface
{
    public static void main(String args[])
    {
        ImplementingClass obj = new ImplementingClass();
        obj.childMethod();
        obj.parentMethod();
    }
}