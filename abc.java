public class abc
{
    abc()
    {
        System.out.println("this is a");
    }
}
class xyz extends abc
   
   {
   xyz()
   {
       System.out.println("this is b");
   }

   public static void main(String args[])
   {
    abc a = new abc();
    xyz x = new xyz();
   }
   }