package Week_9;

public class BankAccountDemo {

    public static void main (String[] args) {
        BankAccount newBankAccount = new BankAccount("1874183", "Hamza Abdullah", true);

        System.out.println("Account holder: " + newBankAccount.getAccountHolder());
        System.out.println("Account number: " + newBankAccount.getAccountNumber());

        System.out.println("Setting balance to £1000...");
        newBankAccount.setBalance(1000);

        System.out.println("The current balance is £" + newBankAccount.getBalance());
    }
}
