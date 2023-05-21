import java.util.*;

class FilterStringPrc {
    private int id;
    private String prname;
    
    public void SetId(int id) {
        if (id < 100) {
            this.id = id;
        } else {
            System.out.println("Enter Id");
            throw new IllegalArgumentException();
        }
    }

    public void SetPrname(String prname) {
        if (prname != null && prname.length() > 0) {
            this.prname = prname;
        } else {
            System.out.println("Enter Name");
            throw new IllegalArgumentException();
        }

    }

    public int GetId() {
        return this.id;
    }

    public String GetPrname() {
        return this.prname;
    }

    Product(int id, String prname) {
        SetId(id);
        SetPrname(prname);
    }
}

public class FilterStringPrc {
    public static void main(String[] args) {
        List<Product> ls = new ArrayList<>();

        Product Obj = new Product(14, "Abc");
        Product Obj1 = new Product(24, "ABC1");
        Product Obj2 = new Product(34, "ABC2");
        Product Obj3 = new Product(44, "ABC3");
        Product Obj4 = new Product(54, "ABC4");
        Product Obj5 = new Product(64, "ABC5");
        Product Obj6 = new Product(74, "ABC6");

        ls.add(Obj);
        ls.add(Obj);
        ls.add(Obj1);
        ls.add(Obj2);
        ls.add(Obj3);
        ls.add(Obj4);
        ls.add(Obj5);
        ls.add(Obj6);

      
        Iterator i = ls.iterator();
        while (i.hasNext()) {
            Product Ob = (Product) i.next();
            int PrID = Ob.GetId();
            String PrName = Ob.GetPrname();
            if (PrID > 33) {
                System.out.println("Product Id is => " + PrID + " And Product Name is => " + PrName);
            }
           
        }

    }
}