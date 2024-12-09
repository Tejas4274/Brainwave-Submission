package Task1;

import java.util.Scanner;

public class ATM {
    private static double balance = 1000.00; 
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Welcome to the ATM!");
        boolean exit = false;

        while (!exit) {
            displayMenu();
            int choice = getUserChoice();
            switch (choice) {
                case 1 -> checkBalance();
                case 2 -> withdrawMoney();
                case 3 -> depositMoney();
                case 4 -> {
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    exit = true;
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void displayMenu() {
        System.out.println("\nATM Main Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
    }

    private static int getUserChoice() {
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a number between 1 and 4.");
            scanner.next(); 
        }
        return scanner.nextInt();
    }

    private static void checkBalance() {
        System.out.printf("Your current balance is: %.2f%n", balance);
    }

    private static void withdrawMoney() {
        System.out.print("Enter amount to withdraw: ");
        double amount = getUserAmount();
        if (amount > balance) {
            System.out.println("Insufficient balance. Transaction failed.");
        } else if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
        } else {
            balance -= amount;
            System.out.printf("You have successfully withdrawn %.2f. Your new balance is $%.2f.%n", amount, balance);
        }
    }

    private static void depositMoney() {
        System.out.print("Enter amount to deposit: ");
        double amount = getUserAmount();
        if (amount <= 0) {
            System.out.println("Invalid amount. Please enter a positive number.");
        } else {
            balance += amount;
            System.out.printf("You have successfully deposited %.2f. Your new balance is $%.2f.%n", amount, balance);
        }
    }

    private static double getUserAmount() {
        while (!scanner.hasNextDouble()) {
            System.out.println("Invalid input. Please enter a valid amount.");
            scanner.next(); 
        }
        return scanner.nextDouble();
    }
}

