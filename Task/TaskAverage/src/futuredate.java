import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Scanner;

public class futuredate
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date in yyyy-MM-dd format: ");
        String dateString = scanner.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date inputDate = dateFormat.parse(dateString);
            Date currentDate = new Date();

            if (inputDate.after(currentDate))
            {
                System.out.println("The  date is in the future.");
            } else if (inputDate.before(currentDate))
            {
                System.out.println("The  date is in the past.");
            } else
            {
                System.out.println("The  date is the same as the current date.");
            }
        }
        catch (ParseException e)
        {
            System.out.println("Invalid date format or parsing error: " + e.getMessage());
        }
    }
}
