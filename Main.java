import java.util.Scanner;  

public class Main {  
    public static void main(String[] args) {  
        // Get input from the user  
        Scanner scanner = new Scanner(System.in);  
        // Assign function BankAccount to a new variable called account  
        BankAccount account = new BankAccount();  
        int choice;  

        // Print out the welcome message and menu  
        System.out.println("Welcome to the bank");  
        
        do {  
            System.out.println("\nMenu:");  
            System.out.println("1. Deposit");  
            System.out.println("2. Withdraw");  
            System.out.println("3. Check Balance");  
            System.out.println("4. Exit");  
            System.out.print("Enter your choice: ");  
            choice = scanner.nextInt();  

            switch (choice) {  
                case 1:  
                    System.out.print("Enter amount to deposit: ");  
                    double depositAmount = scanner.nextDouble();  
                    account.deposit(depositAmount);  
                    break;  

                case 2:  
                    System.out.print("Enter amount to withdraw: ");  
                    double withdrawnAmount = scanner.nextDouble();  
                    account.withdraw(withdrawnAmount);  
                    break;  

                case 3:  
                    account.checkBalance();  
                    break;  

                case 4:  
                    System.out.println("Exiting");  
                    break;  

                default:  
                    System.out.println("Invalid choice. Please try again.");  
            }  
        } while (choice != 4);  

        scanner.close();  
    } 
    // Deposit Method  
    static class BankAccount {  
        private double balance;  
        // Constructor  
        public BankAccount() {  
            this.balance = 2500.0;  
        }  
        // Deposit Method  
        public void deposit(double amount) {  
            if (amount > 0) {  
                balance += amount;  
                System.out.println("Deposited: " + amount);  
            } else {  
                System.out.println("Invalid amount. Please enter a positive value.");  
            }  
        }  
        // Withdraw Method  
        public void withdraw(double amount) {  
            if (amount > 0 && amount <= balance) {  
                balance -= amount;  
                System.out.println("You have withdrawn: " + amount);  
            } else if (amount > balance) {  
                System.out.println("Insufficient funds.");  
            } else {  
                System.out.println("Invalid amount. Please enter a positive value.");  
            }  
        }  
        // Check Balance Method  
        public void checkBalance() {  
            System.out.println("Current Balance: " + balance);  
        }  
    }  
}