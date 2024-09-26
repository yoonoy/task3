/**
 * The main class demonstrates how to use the PersonalAccount class by performing
 * several deposit and withdrawal transactions, checking the balance, and printing the transaction history.
 */
public class Main {
    public static void main(String[] args) {

        PersonalAccount account = new PersonalAccount(12345, "John Doe");

        // Performing some transactions
        account.deposit(400.00);
        account.withdraw(200.00);
        account.deposit(700.00);
        account.withdraw(600.00);

        // Checking the balance
        System.out.println(account.getBalance());


    }


}