package Todo_Manager;
import java.util.ArrayList;
import java.util.Scanner;

public class Listmanager
{
    public static void main(String[] args)
    {

        System.out.println("Welcome to your Todo Manager!\n");
        System.out.println("Please Enter your Name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("Hello " + name);

        ArrayList<String> tasks = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        String choice;
        do {
            System.out.println("\nPlease choose an option\n");
            System.out.println("1. Enter a task ");
            System.out.println("2. Remove a task ");
            System.out.println("3. Update a task ");
            System.out.println("4. List all tasks ");
            System.out.println("5. Exit");
            choice = input.nextLine();

            switch (choice)
            {
                case "1":
                    System.out.println("Enter a task: ");
                    String newTask = input.nextLine();
                    tasks.add(newTask);
                    break;
                case "2":
                    if (tasks.isEmpty())
                    {
                        System.out.println("Task list is empty!");
                    }
                    else
                    {
                        System.out.println("Enter the task number to remove: ");
                        int taskToRemove = Integer.parseInt(input.nextLine());
                        if (taskToRemove >= 1 && taskToRemove <= tasks.size())
                        {
                            tasks.remove(taskToRemove - 1);
                            System.out.println("Task removed successfully.");
                        }
                        else
                        {
                            System.out.println("Invalid task number!");
                        }
                    }
                    break;
                case "3":
                    if (tasks.isEmpty())
                    {
                        System.out.println("Task list is empty!");
                    }
                    else
                    {
                        System.out.println("Enter the task number to update: ");
                        int taskToUpdate = Integer.parseInt(input.nextLine());
                        if (taskToUpdate >= 1 && taskToUpdate <= tasks.size())
                        {
                            System.out.println("Enter the updated task: ");
                            String updatedTask = input.nextLine();
                            tasks.set(taskToUpdate - 1, updatedTask);
                            System.out.println("Task updated successfully.");
                        }
                        else
                        {
                            System.out.println("Invalid task number!");
                        }
                    }
                    break;
                case "4":
                    if (tasks.isEmpty())
                    {
                        System.out.println("Task list is empty!");
                    }
                    else
                    {
                        System.out.println("Tasks:");
                        for (int i = 0; i < tasks.size(); i++)
                        {
                            System.out.println((i + 1) + ". " + tasks.get(i));
                        }
                    }
                    break;
                case "5":
                    System.out.println("Exiting Todo Manager. Goodbye, " + name + "!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        } while (!choice.equals("5"));
    }
}
