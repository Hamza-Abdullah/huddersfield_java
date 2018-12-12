package Week_9;

public class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private boolean hasOverdraft;

    public BankAccount (String accountNumber, String accountHolder, boolean hasOverdraft) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.hasOverdraft = hasOverdraft;
    }

    public String getAccountNumber () {
        return accountNumber;
    }

    public void setAccountNumber (String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder () {
        return accountHolder;
    }

    public void setAccountHolder (String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public boolean isHasOverdraft () {
        return hasOverdraft;
    }

    public void setHasOverdraft (boolean hasOverdraft) {
        this.hasOverdraft = hasOverdraft;
    }

    public boolean deposit (double amount) {
        // If statement to return boolean if amount it above 0
        boolean succeeded;
        if (amount > 0) {
            this.balance += amount;
            succeeded = true;
        }
        else {
            succeeded = false;
        }
        return succeeded;
    }

    public boolean withdraw (double amount) {
        // If statement to return boolean if amount it above 0 or has overdraft
        boolean succeeded;
        if (amount > 0 || hasOverdraft) {
            this.balance -= amount;
            succeeded = true;
        }
        else {
            succeeded = false;
        }
        return succeeded;
    }

    public boolean addInterest (int interestRate) {
        boolean succeeded;
        if (interestRate > 0) {
            this.balance += this.balance * (interestRate / 100.0);
            succeeded = true;
        }
        else {
            succeeded = false;
        }
        return succeeded;
    }

    @Override
    public String toString () {
        final StringBuilder sb = new StringBuilder ("BankAccount{");
        sb.append ("accountNumber='").append (accountNumber).append ('\'');
        sb.append (", accountHolder='").append (accountHolder).append ('\'');
        sb.append (", balance=").append (balance);
        sb.append (", hasOverdraft=").append (hasOverdraft);
        sb.append ('}');
        return sb.toString ();
    }
}