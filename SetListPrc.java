import java.util.*;
 class SetListPrc
{
    public static void main(String[] args)
    {
        Set<Integer> s = new HashSet<>();
        s.add(10);
        s.add(20);
        s.add(30);
        Iterator<Integer> i = s.iterator();
        while(i.hasNext())
        {
            Integer it = (Integer)i.next();  
            System.out.println(it);
        }
    }
}