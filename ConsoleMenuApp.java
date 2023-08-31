import java.util.Scanner;

public class ConsoleMenuApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("╔════════════════════╗");
            System.out.println("║      Main Menu     ║");
            System.out.println("╠════════════════════╣");
            System.out.println("║ 0. Exit            ║");
            System.out.println("║ 1. Option A        ║");
            System.out.println("║ 2. Option B        ║");
            System.out.println("║ 3. Option C        ║");
            System.out.println("║ 4. Option D        ║");
            System.out.println("║ 5. Option E        ║");
            System.out.println("╚════════════════════╝");
            System.out.print("Select an option: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 0:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);
                    break;
                case 1:
                    System.out.println("You selected Option A.");
                    break;
                case 2:
                    System.out.println("You selected Option B.");
                    break;
                case 3:
                    System.out.println("You selected Option C.");
                    break;
                case 4:
                    System.out.println("You selected Option D.");
                    break;
                case 5:
                    System.out.println("You selected Option E.");
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
