// Program to demonstrate the static variable
class Student
{
    int rollno;
    String name;
    static String college = "SAL";
    Student(int r, String n)
    {
        rollno = r;
        name = n;

    }
    void display()
    {
        System.out.println(rollno  + " "+ name +" " +  college);
     }
 }
 
    class TestStaticVariable1
{
    public static void main(String args[])
    {
        Student s1 = new Student(12,"Jiya");
        Student s2 = new Student(72,"Princy");
        s1.display();
        s2.display();
    }
}