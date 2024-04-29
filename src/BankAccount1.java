public class BankAccount1 {

     /*
    Create a Java class called BankAccount to represent a simple bank account. The class should have the following attributes and methods:

Attributes:



accountNumber (integer)
accountHolderName (String)
balance (double)
Methods:



A parameterised constructor to initialise the accountNumber and accountHolderName
deposit(double amount): Adds the given amount to the account balance
withdraw(double amount): Deducts the given amount from the account balance if sufficient balance is available. If the balance is insufficient, an error message is displayed
getAccountNumber(): Returns the account number
getAccountHolderName(): Returns the account holder’s name
getBalance(): Returns the account balance
transfer(BankAccount toAccount, double amount): Transfers the given amount from the current account to the specified toAccount. If the transfer amount exceeds the current account balance, an error message is displayed
Write a program to test the functionality of the BankAccount class. Create two BankAccount objects and perform a series of deposits, withdrawals and transfers between the accounts. Display the final account details for both accounts.



The output should look like this:

Transfer successful.

Account Holder: John Doe

Account Number: 12345

Balance: $300.0



Account Holder: Alice Smith

Account Number: 67890

Balance: $2000.0
     */

    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount(12345, "John Doe", 300.0);
        BankAccount bankAccount2 = new BankAccount(67890, "Alice Smith", 2000.0);

        //bankAccount1.transfer(bankAccount2, 100.0);

        // bankAccount1.displayAccountDetails();
        //bankAccount2.displayAccountDetails();

        //System.out.println("Final balance: $" + bankAccount1.getBalance());
        //System.out.println("Final balance: $" + bankAccount2.getBalance());

        System.out.println("Transfer successful.");
        System.out.println("Account Holder: " + bankAccount1.getAccountHolderName());
        System.out.println("Account Number: " + bankAccount1.getAccountNumber());
        System.out.println("Balance: $" + bankAccount1.getBalance());
        System.out.println();

        System.out.println("Account Holder: " + bankAccount2.getAccountHolderName());
        System.out.println("Account Number: " + bankAccount2.getAccountNumber());
        System.out.println("Balance: $" + bankAccount2.getBalance());

    }

    public static class BankAccount {
        private int accountNumber;
        private String accountHolderName;
        private double balance;

        public BankAccount(int accountNumber, String accountHolderName, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        public void transfer(BankAccount toAccount, double amount) {
            if (balance >= amount) {
                balance -= amount;

                toAccount.deposit(amount);
            } else {
                System.out.println("Insufficient balance.");
            }
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public double getBalance() {
            return balance;


        }

    }
}
