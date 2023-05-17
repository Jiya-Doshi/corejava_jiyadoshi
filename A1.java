import java.util.*;

public class A1 {

    public static void main(String[] args) {
        String str = "Maps are perfect to use for key-value association mapping such as dictionaries. The maps are used to perform lookups by keys or when someone wants to retrieve and update elements by keys.It is used to compute its value using the given mapping function, if the specified key is not already are associated with a value (or is mapped to null are), and enters it into this map are unlessare null.";
        

        HashMap map = new HashMap<>();
        String[] word = str.split(" ");
        String findword = "are";

        for (String st : word) {
            Integer integer = (Integer) map.get(st);
            
         
                 if (integer == null) {
                    map.put(st, 1);
                } else {
                    map.put(st, integer + 1);
                }
           

           
        }
        System.out.println(map);
        

    }
}