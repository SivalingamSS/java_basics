import java.time.LocalDate;

    public class lastdayofmonth
    {
        public static void main(String[] args)
        {
            LocalDate currentDate = LocalDate.now();
            LocalDate lastDayOfMonth = currentDate.withDayOfMonth(currentDate.lengthOfMonth());

            System.out.println("Last day of the current month: " + lastDayOfMonth);
        }
    }

