import enums.CustomerStatus;

/**
 * Created by shivam.si on 11/02/21 12:15 pm
 */
public class Customer {
    private String name;
    private String email;
    private String phone;
    private Address address;
    private CustomerStatus status;
    private Card card;
    private Account account;

    public boolean makeTransaction(Transaction transaction) {
        if(transaction instanceof Withdraw) {
            /// do some work
        } else if(transaction instanceof BalanceInquiry) {
            //// get balance
        }
        return true;
    }
}
