import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String name = getNonZeroLenString(in, "Enter your name: ");
        System.out.println("Name is " + name);
    }

    /**
     * gets a String value from the user which must be at least one character
     *
     * @param pipe Scanner to use to read the input
     * @param prompt Prompt to tell the user what to input
     * @return String that is at least one character
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt)
    {
        String retVal = "";

        do
        {
            System.out.print(prompt + ": ");
            retVal = pipe.nextLine();
            if(retVal.isEmpty())
            {
                System.out.println("You must enter at least one character!");
            }
        } while(retVal.isEmpty());

        return retVal;
    }
}