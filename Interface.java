interface Animal
{
    public void animalsound();
    public void animalsleep();
}

class Pig implements Animal
{
   public void animalsound()
    {
        System.out.println( "the pig says : wee wee");

    }
   public void animalsleep()
    {
        System.out.println( "zzz zzz");

    }
}

class Main
{
    public static void main(String args[])
    {
        Pig myPig = new Pig();
        myPig.animalsound();
        myPig.animalsleep();
    }

    
}