import java.util.*;

class Product {
    private int id;
    private String prname;

    public void SetId(int id) {
        if (id < 100) {
            this.id = id;
        } else {
            System.out.println("Please Enter proper Id");
            throw new IllegalArgumentException();
        }
    }

    public void SetPrname(String prname) {
        if (prname != null && prname.length() > 0) {
            this.prname = prname;
        } else {
            System.out.println("Please Enter proper Name");
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

        Product Obj = new Product(12, "Abc");
        Product Obj1 = new Product(22, "Xyz");
        Product Obj2 = new Product(32, "Abc2");
        Product Obj3 = new Product(42, "Xyz2");
        Product Obj4 = new Product(52, "Xyz4");
        Product Obj5 = new Product(62, "Abc5");
        Product Obj6 = new Product(72, "DFG");

        ls.add(Obj);
        ls.add(Obj);
        ls.add(Obj1);
        ls.add(Obj2);
        ls.add(Obj3);
        ls.add(Obj4);
        ls.add(Obj5);
        ls.add(Obj6);

        // System.out.println(ls);
        Iterator i = ls.iterator();
        while (i.hasNext()) {
            Product Ob = (Product) i.next();
            int PrID = Ob.GetId();
            String PrName = Ob.GetPrname();
            if (PrID > 33) {
                System.out.println("Product Id is => " + PrID + " And Product Name is => " + PrName);
            }
            /* if(PrName.startsWith("Ab")){
                System.out.println("Product Id is => " + PrID + " And Product Name is => " + PrName);
            } */
        }

    }
}