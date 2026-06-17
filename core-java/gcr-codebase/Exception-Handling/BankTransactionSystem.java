import java.util.Scanner;

import javax.naming.InsufficientResourcesException;

public class BankTransactionSystem {
    private double balance;

    public BankTransactionSystem(double initial) {
        this.balance = initial;
    }

    public void withdraw(double amount) throws InsufficientResourcesException {
        if (amount < 0) throw new IllegalArgumentException("Invalid amount");
        if (amount > balance) throw new InsufficientResourcesException("Insufficient balance");
        balance -= amount;
    }

    public double getBalance() { return balance; }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankTransactionSystem acct = new BankTransactionSystem(1000.0);
        System.out.print("Enter amount to withdraw: ");
        double amt = sc.nextDouble();
        try {
            acct.withdraw(amt);
            System.out.println("Withdrawal successful, new balance: " + acct.getBalance());
        } catch (InsufficientResourcesException e) {
            System.out.println("Insufficient balance!");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid amount!");
        } finally {
            sc.close();
        }
    }
}
