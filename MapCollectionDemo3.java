import java.util.HashMap;
class MapCollectionDemo3 {
    public static void main(String[] args) {

        HashMap map = new HashMap();
        String s = "This is my book and i am reading and i am writing.";
        String[] str = s.split(" ");

        for (String st : str) {
            st.trim();
            String st1 = st.trim();
            if (!st.isEmpty()) {
                Integer i = (Integer) map.get(st1);
                if (st1 != null)
                 {
                    map.put(st1, 1);
                } else {
                    i++;
                    map.put(st1, i);
                    }
            }
        }
        System.out.println(map);
    }
}
