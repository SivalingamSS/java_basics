import java.util.Scanner;

public class Bankdetails
{
    private int amount = 2000;
    public void currentBalance()
    {
        System.out.println("Current balance amount: " + amount);
    }

    public void withdrawAmount()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount:");
        int choice1 = scanner.nextInt();
        if (choice1 > (amount - 500))
        {
            System.out.println("Your account does not have sufficient balance (minimum balance constraint).");
        }
        else
        {
            amount -= choice1;
            System.out.println("Collect your amount: " + choice1);
        }
    }

    public void depositAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER THE AMOUNT:");
        int choice2 = scanner.nextInt();
        amount += choice2;
        System.out.println("BALANCE THE AMOUNT: " + amount);
    }

    public void mainMethods()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the pin :");
        for (int j = 0; j < 3; j++)
        {
            int pass = scanner.nextInt();
            if (pass == 1234) {
                System.out.println("WELCOME TO ATM SERVICE");
                System.out.println("1. CURRENT BALANCE");
                System.out.println("2. WITHDRAW AMOUNT");
                System.out.println("3. DEPOSIT AMOUNT");
                System.out.println("4. EXIT");
                System.out.println("ENTER THE CHOICE:");
                for (int i = 0; true; i++)
                {
                    int choice = scanner.nextInt();

                    switch (choice)
                    {
                        case 1:
                            currentBalance();
                            break;
                        case 2:
                            withdrawAmount();
                            break;
                        case 3:
                            depositAmount();
                            break;
                        case 4:
                            System.out.println("Thank you! come again!");
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Invalid choice");
                            break;
                    }

                }
            }

            else
            {
                System.out.println("Incorrect pin, try again");
                System.out.println("ENTER THE PIN......");
            }
        }
    }

    public static void main(String[] args)
    {
        Bankdetails obj = new Bankdetails();
        obj.mainMethods();
    }
}
