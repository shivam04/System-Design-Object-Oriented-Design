import java.util.List;

/**
 * Created by shivam.si on 11/02/21 1:30 pm
 */
public class ATM {
    private Address address;
    private String atmId;
    private Screen screen;
    private KeyPad keypad;
    private CashDispenser cashDispenser;
    private Printer printer;
    private List<Transaction> transactionList;

    public boolean authenticateUser() {
        return true;
    }

    public boolean makeTransaction(Customer customer, Transaction transaction) {
        Withdraw withdrawTransaction = (Withdraw)transaction;
        this.cashDispenser.dispenseCash(withdrawTransaction.getAmount());
        return customer.makeTransaction(transaction);
    }
}
