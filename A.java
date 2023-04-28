// A simple example of Inheritance.
//Create a superclass.
class A 
{
    int i,j;

    void showj()
    {
        System.out.println("i and j: " + i + " " + j);
    }
}

//Create a subclass by extending class A.
class B extends A
{
    int k;
    void showk()
    {
        System.out.println("k: " + k);
    }
    void sum()
    {
        System.out.println("i+j+k:" + (i+j+k));
    }
}