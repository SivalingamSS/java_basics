import java.time.LocalDate;
import java.time.Month;

    public class currentmonth
    {
        public static void main(String[] args)
        {
            LocalDate today = LocalDate.now();
            Month currentMonth = today.getMonth();

            System.out.println("Today's date: " + today);
            System.out.println("Current month: " + currentMonth);
        }
    }


