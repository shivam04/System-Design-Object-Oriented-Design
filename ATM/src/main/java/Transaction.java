import enums.TransactionStatus;

import java.util.Date;

/**
 * Created by shivam.si on 11/02/21 1:32 pm
 */
public abstract class Transaction {
    private int transactionId;
    private Date creationTime;
    private TransactionStatus status;
}
