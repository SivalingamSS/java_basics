import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class countdays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter start date (yyyy-mm-dd): ");
        String startDateInput = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(startDateInput);

        System.out.println("Enter end date (yyyy-mm-dd): ");
        String endDateInput = scanner.nextLine();
        LocalDate endDate = LocalDate.parse(endDateInput);

        scanner.close();

        long countdays = countdays(startDate, endDate);
        System.out.println("Number of days: " + countdays);
    }

    public static long countdays(LocalDate start, LocalDate end)
    {
        long days = ChronoUnit.DAYS.between(start, end);
        return days;
    }
}
