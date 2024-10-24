public class PrettyHeader
{
    public static void main(String[] args)
    {
        prettyHeader("Center Message Here");
    }

    private static void prettyHeader(String msg)
    {
        final int TOTAL_WIDTH = 60;
        final int BORDER_STAR = 3;
        int msgLength = msg.length();
        int totalSpaces = 0;
        int spaceBefore = 0;
        int spaceAfter = 0;

        if (msgLength > 54)
        {
            System.out.println("Failed to create header, message is too long");
            return;
        }

        totalSpaces = TOTAL_WIDTH - (2 * BORDER_STAR) - msgLength;
        spaceBefore = totalSpaces / 2;

        if(totalSpaces % 2 == 0)
        {
            spaceAfter = spaceBefore;
        }
        else
        {
            spaceAfter = spaceBefore + 1;
        }
        //print first row of stars
        for(int c = 1; c <= TOTAL_WIDTH; c++)
           System.out.print("*");
        System.out.println();

        //print the *** border
        for(int c = 1; c <= BORDER_STAR; c++)
            System.out.print("*");

        //print the spaces before
        for(int c = 1; c <= spaceBefore; c++)
            System.out.print("*");
        System.out.print(msg);

        for(int c = 1; c <= spaceAfter; c++)
            System.out.print("*");

        for(int c = 1; c <= BORDER_STAR; c++)
            System.out.print("*");
        System.out.println();

        //print the bottom line of stars
        for(int c = 1; c <= BORDER_STAR; c++)
            System.out.print("*");
    }
}
