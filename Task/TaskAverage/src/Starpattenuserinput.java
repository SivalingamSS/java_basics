import java.util.Scanner;

public class Starpattenuserinput
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int tableNumber = scanner.nextInt();

        for (int i = 0; i < tableNumber; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}
