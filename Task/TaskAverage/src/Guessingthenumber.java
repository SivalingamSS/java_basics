import java.util.Random;
import java.util.Scanner;

public class Guessingthenumber
{
    public static void main(String args[])
    {
        Random random = new Random();
        int guessthenumber = random.nextInt(100);
        int numberoftries = 0;

        Scanner input = new Scanner(System.in);
        int guess;

        boolean win = false;
        while (win == false) {
            System.out.println("guess the number of 1 to 100 :");
            guess = input.nextInt();
            numberoftries++;

            if (guess == guessthenumber)
            {
               win = true;
            }
            else if (guess < guessthenumber)
            {
                System.out.println("your guess is too low ");

            }
            else if (guess > guessthenumber )
            {
                System.out.println("your guess is too high ");

            }

        }
        System.out.println("you win ");
        System.out.println("the number is:" + guessthenumber);
        System.out.println("It took you "  + numberoftries +  "tries");

    }
}
