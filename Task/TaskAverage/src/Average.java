import java.util.ArrayList;
import java.util.List;

public class Average
{
   public static void main(String args[])
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int sum = 0;
        for (int num : numbers)
        {
            sum += num;
        }
        double num = (double) sum / numbers.size();
        System.out.println("Average of list is " + num);

    }
}
