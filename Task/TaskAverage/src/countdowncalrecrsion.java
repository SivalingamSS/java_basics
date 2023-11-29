public class countdowncalrecrsion
{

    public static void main(String[] args)
    {
        int startingNumber = 10;

        System.out.println("Counting down from " + startingNumber + " to 1:");
        countdown(startingNumber);
    }

    public static void countdown(int num)
    {
        if (num <= 0)
        {
            System.out.println("Done!");
        }
        else
        {
            System.out.println(num);

            countdown(num - 1);
        }
    }
}
