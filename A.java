public class A
{
    public static void main(String[] args)
    {
        String s= new String("Hello.. How are you?? \n What's your age");
        System.out.print(s);
        System.out.println(s);

        System.out.println();
        System.out.println("charAt(1)");
        char c = s.charAt(1);
        System.out.println(c);

        System.out.println();
        System.out.println("subString(1,6)");
        System.out.println(s.substring(1,6));
        
        System.out.println();
        System.out.println("length");
        System.out.println(s.length());

        System.out.println();
        System.out.println("trim()");
        System.out.println(s.trim());
        System.out.println(s);

        System.out.println();
        System.out.println("split(\" \")");
        String[] arr = s.split(" ");
        for(String string : arr)
        {
            System.out.println(string);
        }
        System.out.println();
        System.out.println("s.replace(\"Hello\", \"Hi\")");
        System.out.println(s.replace("Hello", "Hi"));
        System.out.println("s.replace(\"1\", \"L\")");
        System.out.println(s.replace("1", "L"));

        System.out.println();

        System.out.println(s.concat("Would you like to join me ?"));
    }
}