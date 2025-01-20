import  java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //the input scanner
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();
        int choice;
        System.out.println("Welcome to the bank");
        System.out.println("\nMenu:");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        choice = scanner.nextInt();

            if (choice == 1) {
                double deposit_amount = scanner.nextDouble();
                account.deposit(deposit_amount);
                System.out.println("Enter amount to deposit");



            } else if (choice ==2) {
                double withdrawn = scanner.nextDouble();
                account.withdraw(withdrawn);
                System.out.println("You have withdrawn: "+withdrawn);

            } else if (choice == 3) {
                account.checkBalance(account.balance);
                System.out.println("Check balance");

            } else if (choice == 4) {
                System.out.println("Exiting");

            }


        scanner.close();
    }
    // Deposit Method
    static class BankAccount{
        private double balance;

        //constructor
        public BankAccount(){
            this.balance =2500.0;
        }

        //Deposit Method

        public void deposit(double amount){
            if (amount>0){
                balance += amount;
                System.out.println("Deposited: "+amount);
            }else {
                System.out.println("invalid amount");
            }

            //Withdraw method
        }public void withdraw(double amount){
            if (amount>0 && amount<=balance){
                balance -=amount;
            } else if (amount>balance) {
                System.out.println("invalid choice");

            }
        }public void checkBalance(double amount){
            System.out.println("Current Balance: "+ balance);
        }


    }

}