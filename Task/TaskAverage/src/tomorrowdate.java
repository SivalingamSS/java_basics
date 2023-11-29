import java.time.LocalDate;

    public class tomorrowdate
    {
        public static void main(String[] args)
        {
            LocalDate today = LocalDate.now();
            LocalDate tomorrow = today.plusDays(1);

            System.out.println("Today date: " + today);
            System.out.println("Tomorrow date: " + tomorrow);
        }
    }


