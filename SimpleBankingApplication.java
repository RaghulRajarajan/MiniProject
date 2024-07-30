import java.util.Scanner;

public class SimpleBankingApplication 
{
    private static double balance = 0.0;
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) 
        {
            System.out.println("\nSimple Banking Application");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = scanner.nextInt();
            switch (choice) 
            {
                case 1:
                    checkBalance();
                    break;
                case 2:
                    deposit(scanner);
                    break;
                case 3:
                    withdraw(scanner);
                    break;
                case 4:
                    exit = true;
                    System.out.println("Thank you for using this Banking Application!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        scanner.close();
    }
    private static void checkBalance() 
    {
        System.out.printf("Your current balance is: ₹%.2f%n", balance);
    }
    private static void deposit(Scanner scanner) 
    {
        System.out.print("Enter amount to deposit: ");
        double amount = scanner.nextDouble();
        if (amount > 0) 
        {
            balance += amount;
            System.out.printf("Successfully deposited ₹%.2f%n", amount);
        } 
        else 
        {
            System.out.println("Invalid amount. Please try again.");
        }
    }
    private static void withdraw(Scanner scanner) 
    {
        System.out.print("Enter amount to withdraw: ");
        double amount = scanner.nextDouble();
        if (amount > 0 && amount <= balance) 
        {
            balance -= amount;
            System.out.printf("Successfully withdrew ₹%.2f%n", amount);
        } 
        else if (amount > balance) 
        {
            System.out.println("Insufficient funds. Please try again.");
        } else 
        {
            System.out.println("Invalid amount. Please try again.");
        }
    }
}
