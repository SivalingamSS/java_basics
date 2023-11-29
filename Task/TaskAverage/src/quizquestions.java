import java.util.Scanner;

    public class quizquestions
    {
        public static void main(String[] args)
        {
            String[][] quizQuestions = {
                    {"What is the capital of France?", "London", "Paris", "Berlin", "Paris"},
                    {"Which planet is known as the 'Red Planet'?", "Venus", "Mars", "Jupiter", "Mars"},
                    {"What is the chemical symbol for water?", "H2O", "CO2", "O2", "H2O"},
                    {"What is 2 + 2?", "3", "4", "5", "4"},
                    {"Which is the largest mammal?", "Elephant", "Blue Whale", "Giraffe", "Blue Whale"}
            };

            Scanner scanner = new Scanner(System.in);
            int score = 0;

            for (String[] question : quizQuestions)
            {
                System.out.println(question[0]);
                for (int i = 1; i <= 3; i++)
                {
                    System.out.println(i + ". " + question[i]);
                }
                System.out.print("enter the option number): ");
                int userAnswer = scanner.nextInt();

                if (question[userAnswer].equals(question[4]))
                {
                    System.out.println("Correct!");
                    score++;
                }
                else
                {
                    System.out.println("Incorrect. The correct answer is: " + question[4]);
                }
                System.out.println();
            }

            System.out.println("Quiz ended. Your score: " + score + "/" + quizQuestions.length);
        }
    }


