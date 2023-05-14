class OddCustomException extends Exception
{
    public OddCustomException(String str)
    {
        super(str);
    }
}
class EvenCustomException extends Exception
{
    public EvenCustomException(String str)
    {
        super(str);
    }
}
 class CustomOddEvenException
{
    public static void checkOddEvenNumber(int a) throws OddCustomException,EvenCustomException
    {
        if (a % 2 == 0)
        {
            throw new OddCustomException("\nEven number is not valid\n");
        }
        else
        {
             throw new EvenCustomException("\nOdd number is not valid\n");
        }
    }

    public static void main(String args[])
    {
    Random Obj = new Random(1000);
    // int val = Obj.nextInt();
    // System.out.println("Random Integer Value => " +val);

    for (int i = 3; i < 8; i++)
    {
        int val = Obj.nextInt(i);
        System.out.println("Random Integer Value => " + val + " ");
        try
        {
            checkOddEvenNumber(val);
        }
        catch(OddCustomException e)
        {
            System.out.println("Custom Exception Error => " + e);
        }
        catch(EvenCustomException e)
        {
           System.out.println("Custom Exception Error => " + e);  
        }

    }
    }
}