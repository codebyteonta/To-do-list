// Main.java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            System.out.println("\nOptions:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Completed");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task description: ");
                    String description = scanner.nextLine();
                    todoList.addTask(description);
                    break;

                case 2:
                    System.out.print("Enter task index to remove: ");
                    int removeIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    todoList.removeTask(removeIndex - 1);
                    break;

                case 3:
                    System.out.print("Enter task index to mark as completed: ");
                    int completeIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    todoList.markTaskAsCompleted(completeIndex - 1);
                    break;

                case 4:
                    todoList.displayTasks();
                    break;

                case 5:
                    System.out.println("Exiting program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
