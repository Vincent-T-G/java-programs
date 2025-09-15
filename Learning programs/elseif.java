public class elseif 
{
    public static void main(String args[])
    {
        int x = 6;
        int y = 7;
        int z = 9;

        if (x > y && x > z)
        {
            System.out.print(x);
            System.out.print(" is the greatest");
        }
        else if (y > z)
        {
            System.out.print(y);
            System.out.print(" is the greatest");
        }
        else
        {
            System.out.print(z);
            System.out.print(" is the greatest");
        }
    }    
}
