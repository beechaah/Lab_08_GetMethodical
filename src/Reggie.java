import java.util.Scanner;

public class Reggie
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String SSN = "";
        String MNumber = "";
        String MenuChoice = "";

        SSN = SafeInput.getRegExString(in, "Enter your SSN ", "^\\d{3}-\\d{2}-\\d{4}$");
        MNumber = SafeInput.getRegExString(in, "Enter your UC student M Number", "^(M|m)\\d{5}$");
        MenuChoice = SafeInput.getRegExString(in,"Enter your Menu Choice", "^[OoSsVvQq]$");
        System.out.println("\nYour SSN is: " + SSN);
        System.out.println("\nYour UC student M Number is: " + MNumber);
        System.out.println("\nYour Menu Choice is: " + MenuChoice);
    }
}
