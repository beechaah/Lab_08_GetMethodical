import java.util.Scanner;

public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        int year = SafeInput.getRangedInt(in, "Enter the year you were born", 1950, 2015);
        int month = SafeInput.getRangedInt(in, "Enter the month you were bron", 1, 12);
        int day = switch (month) {
            case 2 -> SafeInput.getRangedInt(in, "Enter the day you were bron", 1, 29);
            case 1, 3, 5, 7, 8, 10, 12 -> SafeInput.getRangedInt(in, "Enter the day you were bron", 1, 31);
            case 4, 6, 9, 11 -> SafeInput.getRangedInt(in, "Enter the day you were bron", 1, 30);
            default -> 0;
        };

        int hour = SafeInput.getRangedInt(in, "Enter the hour you were bron", 1, 24);
        int minute = SafeInput.getRangedInt(in, "Enter the minute you were bron", 0, 59);

        System.out.println("\nYou were born: "  + month + " " + day + " " + year + " at " + hour + " " + minute);
    }
}
