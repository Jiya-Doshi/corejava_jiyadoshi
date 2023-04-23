class A

    {
     private String msg="Try to accesss the private method outside the class";
    }

    class PrivateExample1
    {
        public static void main(String[] args)
    {
        
          A a=new A();  
   System.out.println(a.msg);  
      
    }
}