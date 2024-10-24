import java.util.Scanner;

public class DevTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        /*

        String name = getNonZeroLenString(in, "Enter your name: ");
        System.out.println("Name is " + name);

        int age = getInt(in, "Enter your age: ");
        System.out.print("You said your age is " + age);

        double salary = getDouble(in, "Enter your salary");
        System.out.print("Your salary is: " + salary);

        int favNum = getRangedInt(in, "Enter your favorite number", 1, 10);
        System.out.print("You said your favorite number is " + favNum);

        double income = getRangedDouble(in, "Enter your income", 5000, 100000);
        System.out.print("You said the income is " + income);

        boolean leaveClass = getYNConfirm(in, "Are you ready to leave class?");
        System.out.print(leaveClass);

        String SSN = getRegExString(in, "Enter your SSN ", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN: " + SSN);

        */
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

    /**
     * Gets an unconstrained int value from the user
     *
     * @param pipe Scanner to use for input
     * @param prompt Prompt that tells the user what to input
     * @return An unconstrained int value
     */
    public static int getInt(Scanner pipe, String prompt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }

        } while(!done);

        return retVal;
    }

    /**
     * Gets an unconstrained double value from the user
     *
     * @param pipe Scanner to use for input
     * @param prompt Prompt that tells the user what to input
     * @return An unconstrained double value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double not " + trash);
            }

        } while(!done);

        return retVal;
    }

    /**
     * gets an int value from the user within the specified inclusive range
     *
     * @param pipe Scanner to use for input
     * @param prompt Prompt that tells the user what to input
     * @param low int
     * @param high int
     * @return an int value within a specified range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt +  " [" + low + " - " + high + "]: ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine();

                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a valid integer in range [" + low + " - " + high + "]: ");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer not " + trash);
            }

        } while(!done);

        return retVal;
    }

    /**
     * gets a double value from the user within the specified inclusive range
     *
     * @param pipe Scanner to use for input
     * @param prompt Prompt that tells the user what to input
     * @param low double
     * @param high double
     * @return a double value within a specified range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, int low, int high)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do
        {
            System.out.print(prompt +  " [" + low + " - " + high + "]: ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine();

                if(retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("You must enter a valid double in range [" + low + " - " + high + "]: ");
                }
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double not " + trash);
            }

        } while(!done);

        return retVal;
    }

    /**
     * Get a String val from the user of [Yy/Nn]
     *
     * @param pipe Scanner to use to read input
     * @param prompt Prompt to tell user what to input
     * @return true for Yy (yes) and false for Nn (no)
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String input = "";
        boolean retVal = false;
        boolean done = false;

        do
        {
            System.out.println(prompt + "[Yy/Nn]: ");
            input = pipe.nextLine();
            if(input.isEmpty())
            {
                System.out.println("You must enter Y or N!");
            }
            else if(input.equalsIgnoreCase("Y"))
            {
                retVal = true;
                done = true;
            }
            else if(input.equalsIgnoreCase("N"))
            {
                retVal = false;
                done = true;
            }
            else
            {
                System.out.println("You must enter Y or N! Not: " + input);
            }

        } while(!done);

        return retVal;
    }

    /**
     * Returns a String value that matches a regular expression
     *
     * @param pipe Scanner to use for input
     * @param prompt Tells user what to enter
     * @param regEx String regular expression pattern to match
     * @return
     */
    public static String getRegExString(Scanner pipe, String prompt, String regEx)
    {
        String retVal = "";
        boolean done = false;

        do
        {
            System.out.print(prompt + regEx + ": ");
            retVal = pipe.nextLine();
            if(retVal.matches(regEx))
            {
               done = true;
            }
            else
            {
                System.out.println("You must enter a value that matches pattern " + regEx + "not " + retVal);
            }
        } while(!done);

        return retVal;
    }
}