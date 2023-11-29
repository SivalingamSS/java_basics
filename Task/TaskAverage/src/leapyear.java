import java.util.Scanner;

public class leapyear
{
    public  static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        if(((year % 4 == 0) && (year % 100 != 0)) ||
                (year % 400 == 0))
        {
              System.out.println("It is an leap year");
        }
        else
        {
            System.out.println("It is not an leap year");
        }
    }
}
