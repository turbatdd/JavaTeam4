package assignmentLesson12.prob2;

public class CustomerAccount {
    private String cusName;
    private String accNo;
    private double balance;

    public CustomerAccount(String cusName, String accNo, double balance) {
        this.cusName = cusName;
        this.accNo = accNo;
        this.balance = balance;
    }

    public boolean deposit(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Deposit amount must be positive. Amount: " + amount);

        balance += amount;
        return true;
    }

    public boolean withdraw(double amount) throws AccountException {

        if (amount <= 0)
            throw new IllegalArgumentException("Withdrawal amount must be positive. Withdraw amount: " + amount);

        if (amount > balance)
            throw new AccountException("Insufficient funds! Withdrawal amount exceeds balance. Withdraw amount: " + amount + " Balance: " + getBalance());

        if (balance - amount < 100)
            throw new AccountException("Low balance warning! Balance cannot go below $100. Withdraw amount: " + amount + " Balance: " + getBalance());

        balance -= amount;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}
