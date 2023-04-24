// Java program to get the square of a given no. using static method
class Calculate
{
    static int square(int x)
    {
        return x*x;

    }
    public static void main(String args[])
    {
        int result = Calculate.square(3);
        System.out.println(result);
    }
}