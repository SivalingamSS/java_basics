import java.time.DayOfWeek;
import java.time.LocalDate;

    public class currentday
    {
        public static void main(String[] args)
        {
            LocalDate today = LocalDate.now();
            DayOfWeek dayOfWeek = today.getDayOfWeek();

            System.out.println("Today's date: " + today);
            System.out.println("Today is: " + dayOfWeek);
        }
    }


