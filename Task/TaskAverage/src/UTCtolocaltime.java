import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

    public class UTCtolocaltime
    {
        public static void main(String[] args)
        {
           Date date =  new Date(258407589L);
            DateFormat format = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
            format.setTimeZone(TimeZone.getTimeZone("PST"));
            System.out.println(format.format(date));
        }
    }

