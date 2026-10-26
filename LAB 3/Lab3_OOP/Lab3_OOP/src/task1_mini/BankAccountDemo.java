package task1_mini;

class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {           // adds the amount to the balance
        balance += amount;
        System.out.println(accountHolder + " deposited " + amount);
    }

    boolean withdraw(double amount) {       // subtracts only if funds are sufficient
        if (amount <= balance) {
            balance -= amount;
            System.out.println(accountHolder + " withdrew " + amount);
            return true;
        }
        System.out.println(accountHolder + ": insufficient funds for " + amount);
        return false;
    }

    void showBalance() {                    // holder name + current balance
        System.out.println("Account Holder: " + accountHolder + " | Balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("Ali", 5000);
        BankAccount a2 = new BankAccount("Sara", 3000);

        a1.deposit(1500);
        a2.withdraw(500);
        a2.withdraw(10000);                 // fails: insufficient funds

        if (a1.withdraw(2000)) {            // transfer 2000 from Ali to Sara
            a2.deposit(2000);
        }

        System.out.println("--- Final balances ---");
        a1.showBalance();
        a2.showBalance();
    }
}
