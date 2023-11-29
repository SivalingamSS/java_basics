import java.util.ArrayList;
import java.util.List;

public class sum
{
    public static void main (String args[])
    {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(60);
        numbers.add(80);
        numbers.add(70);
        numbers.add(40);
        numbers.add(30);

        int sum = 0;
        for (int num : numbers)
        {
            sum += num;
        }
        System.out.println(sum);
    }
}
