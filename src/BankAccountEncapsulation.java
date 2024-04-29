public class BankAccountEncapsulation {

    /*
    Create a Java class called BankAccount with the attributes accountNumber, accountHolderName and balance. Use encapsulation and provide the setter and getter methods to access and modify the balance attribute. Create an object of the BankAccount class, set an initial balance using the setter method and then deposit and withdraw some amounts using methods. Display the final balance after the transactions.
    Give the following values as input:
    Account Holder: John Doe
    Account Number: 12345
    Balance: $700.0
     */
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        bankAccount.setAccountHolderName("John Doe");
        bankAccount.setAccountNumber(12345);
        bankAccount.setBalance(700.0);

        bankAccount.deposit(100.0);
        bankAccount.withdraw(200.0);
        bankAccount.displayAccountDetails();
        //System.out.println("Final balance: $" + bankAccount.getBalance());

    }

    static class BankAccount {
        private String accountHolderName;
        private int accountNumber;
        private double balance;

        public String getAccountHolderName() {
            return accountHolderName;
        }

        public void setAccountHolderName(String accountHolderName) {
            this.accountHolderName = accountHolderName;
        }

        public int getAccountNumber() {
            return accountNumber;
        }

        public void setAccountNumber(int accountNumber) {
            this.accountNumber = accountNumber;
        }

        public double getBalance() {
            return balance;
        }

        public void setBalance(double balance) {
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            balance -= amount;
        }

        public void displayBalance() {
            System.out.println("Current balance: " + balance);
        }

        public void displayAccountDetails() {
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }

    }
}




