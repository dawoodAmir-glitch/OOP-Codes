package exercise_q5;

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + " into " + accountNumber);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew " + amount + " from " + accountNumber);
        } else {
            System.out.println("Insufficient balance in " + accountNumber);
        }
    }

    void displayBalance() {
        System.out.println("Account " + accountNumber + " | Balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("PK-1001", 10000);
        BankAccount acc2 = new BankAccount("PK-1002", 5000);

        acc1.deposit(2500);
        acc2.withdraw(1500);
        acc2.withdraw(8000);   // refused

        acc1.displayBalance();
        acc2.displayBalance();
    }
}
