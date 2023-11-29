import java.util.Date;
import java. text.SimpleDateFormat;
public class yesturdaytime
{
    public static void main(String[] args)
    {
            Date currentDate = new Date();

            currentDate.setTime(System.currentTimeMillis());

            Date yesterdayDate = new Date(currentDate.getTime() - (1000 * 60 * 60 * 24));

            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

            String yesterdayDateString = dateFormat.format(yesterdayDate);

            System.out.println("Yesterday's date: " + yesterdayDateString);
    }
}

