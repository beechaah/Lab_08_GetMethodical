import java.util.Scanner;

public class CtoFTableDisplay
{
    public static void main(String[] args)
    {
        System.out.println("\tC value    F value");
        System.out.println("\t----------------");
        for(double c = -10.0; c <= 120.0; c += 0.05)
        {
            System.out.printf("%8.2f\t%8.2f\n", c, CtoF(c));
        }
    }

    private static double CtoF(double c)
    {
        return c * (9.0/5.0) + 32.0;
    }
}
