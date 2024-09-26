/**
 * Class representing a transaction amount.
 * It includes the amount of the transaction and the type of transaction (either DEPOSIT or WITHDRAWAL).
 */
public class Amount {

    private final double amount;
    private final TransactionType transactionType;

    /**
     * Constructor to create an Amount object representing a transaction.
     *
     * @param amount The transaction amount (double).
     * @param transactionType The type of transaction (DEPOSIT or WITHDRAWAL).
     */
    public Amount(double amount, TransactionType transactionType) {
        this.amount = amount;
        this.transactionType = transactionType;
    }

    /**
     * Gets the transaction amount.
     *
     * @return The amount of the transaction (double).
     */

    public double getAmount() {
        return this.amount;
    }

    /**
     * Gets the type of the transaction.
     *
     * @return The type of transaction (DEPOSIT or WITHDRAWAL).
     */
    public TransactionType getTransactionType() {
        return this.transactionType;
    }

    /**
     * Returns a string representation of the transaction, including the type and amount.
     *
     * @return A string that describes the transaction in the format "TRANSACTION_TYPE: amount".
     */
    @Override
    public String toString() {
        return this.transactionType + " " + this.amount;
    }
}
