
import java.util.Scanner;

public class Multipletable
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for the multiplication table: ");
        int tableNumber = scanner.nextInt();

        int i = 1;
        while (i <= tableNumber)
        {
            System.out.println("Multiplication table for " + i + ":");
            int j = 1;
            while (j <= 10)
            {
                int result = i * j;
                System.out.println(i + " * " + j + " = " + result);
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
