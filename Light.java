// Compute distance light travels using long variable
class light
{
    public static void main(String args[])
    {
        int lightspeed;
        long days;
        long seconds;
        long distance;

        // approximate speed of light in miles per second
        lightspeed = 186000;
        days = 1000;
        seconds = days * 24 * 60 * 60; // converting into seconds
        distance = lightspeed * seconds; // compute distance
        System.out.print("In " + days);
        System.out.print(" days light will travel about ");
        System.out.println(distance + " miles "); 
    }
}