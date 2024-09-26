import java.util.ArrayList;
import java.util.List;


/**
 * Class representing a personal bank account.
 * It supports depositing, withdrawing, checking balance, and viewing transaction history.
 */
public class PersonalAccount {
    private final int accountNumber;
    private final String accountHolder;
    public double balance;
    private final List<Amount> transactions;


    /**
     * Constructor to create a new PersonalAccount.
     * Initializes the account number, account holder's name, and sets the initial balance to 0.0.
     *
     * @param accountNumber The unique identifier for the account.
     * @param accountHolder The name of the account holder.
     */
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0;
        this.transactions = new ArrayList<>();
    }


    /**
     * Deposits a specified amount into the account.
     * Updates the account balance and records the deposit transaction.
     *
     * @param amount The amount to be deposited (double). It must be greater than 0.
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;  //
        }

    }

    /**
     * Withdraws a specified amount from the account.
     * Updates the account balance and records the withdrawal transaction.
     * Ensures that the withdrawal amount does not exceed the available balance.
     *
     * @param amount The amount to be withdrawn (double). It must be greater than 0 and less than or equal to the balance.
     */
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;  // Update balance
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        }
    }

    /**
     * Prints the complete transaction history for the account.
     * This includes all deposit and withdrawal transactions, along with their amounts.
     */
    public void printTransactionHistory(){
        for (Amount transaction : transactions) {
            System.out.println("Transaction: " + transaction.getTransactionType() +
                    " | Amount: " + transaction.getAmount());
        }
    }

    /**
     * Returns the current balance of the account.
     *
     * @return The current balance of the account (double).
     */
    public double getBalance() {
        return balance;
    }

    /**
     * Returns the account number of the personal account.
     *
     * @return The account number (int).
     */

    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Returns the name of the account holder.
     *
     * @return The account holder's name (String).
     */
    public String getAccountHolder() {
        return accountHolder;
    }


}
