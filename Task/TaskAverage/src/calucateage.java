import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

    public class calucateage
    {
        public static void main(String[] args)
        {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter your birth year:");
            int year = scanner.nextInt();

            System.out.println("Enter your birth month:");
            int month = scanner.nextInt();

            System.out.println("Enter your birth day:");
            int day = scanner.nextInt();

            LocalDate birthDate = LocalDate.of(year, month, day);
            LocalDate currentDate = LocalDate.now();

            int age = calculateAge(birthDate, currentDate);
            System.out.println("Your age is: " + age + " years");

            scanner.close();
        }

        public static int calculateAge(LocalDate birthDate, LocalDate currentDate)
        {
            return Period.between(birthDate, currentDate).getYears();
        }
    }


