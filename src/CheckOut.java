import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemCost = 0;
        boolean done = false;

        do
        {
            itemCost = SafeInput.getRangedDouble(in, "Enter the item price as a double", 0.5, 10.00);
            done = SafeInput.getYNConfirm(in, "Are you done scanning items?");
        } while(!done);
    }
}
