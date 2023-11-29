import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Twodatescountsunday
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start date (yyyy-mm-dd): ");
        String startDateInput = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(startDateInput);

        System.out.println("Enter end date (yyyy-mm-dd): ");
        String endDateInput = scanner.nextLine();
        LocalDate endDate = LocalDate.parse(endDateInput);

        scanner.close();

        long countSundays = countSundays(startDate, endDate);
        System.out.println("Number of Sundays: " + countSundays);
    }

    public static long countSundays(LocalDate start, LocalDate end) {
        long days = ChronoUnit.DAYS.between(start, end);
        long weeks = days / 7;
        long extraDays = days % 7;

        long count = weeks * 2;
        for (int i = 1; i <= extraDays; i++)
        {
            LocalDate tempDate = start.plusDays(i);
            if (tempDate.getDayOfWeek().getValue() == 7)
            {
                count++;
            }
        }

        return count;
    }
}
