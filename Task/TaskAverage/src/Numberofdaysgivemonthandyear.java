import java.util.Scanner;

public class Numberofdaysgivemonthandyear
{
    public static void main(String args[])
    {
        int month,year;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the month: ");
        month = sc.nextInt();
        System.out.println("Enter the year:");
        year = sc.nextInt();

        if ((month ==2 )&& (year%4==0) || (year%100 !=0)&&(year%400 ==0))
        {
            System.out.println("Number of day is 29 ");
        }
        else if (month == 2)
        {
            System.out.println("Number of day is 28 ");
        }
        else if (month==1 || month==3 || month==5 || month==7 || month==8 || month==10 || month==12)
        {
            System.out.println("Number of day is 31 ");
        }
        else
        {
            System.out.println("Number of day is 30 ");
        }
    }
}
