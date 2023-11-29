import java.util.Scanner;

public class evenodd
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = scanner.nextInt();

        System.out.print("Enter the ending number: ");
        int end = scanner.nextInt();

        int evenSum = 0;
        int oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;
        int totalSum = 0;

        System.out.println("Even numbers:");
        for (int i = start; i <= end; i++)
        {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                evenSum += i;
                evenCount++;
            } else {
                oddSum += i;
                oddCount++;
            }
            totalSum += i;
        }
        System.out.println("\nOdd numbers:");

        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println("\nTotal Sum of Even numbers: " + evenSum);
        System.out.println("Total Sum of Odd numbers: " + oddSum);
        System.out.println("Total Count of Even numbers: " + evenCount);
        System.out.println("Total Count of Odd numbers: " + oddCount);
        System.out.println("Sum of all numbers: " + totalSum);

        scanner.close();
    }
}

