import java.util.Date;

/**
 * Created by shivam.si on 26/02/22 12:58 pm
 */

public class Payment {
    public Integer paymentId;
    PaymentStatus paymentStatus;
    private Double amount;
    private Date createdOn;
    private int transactionId;
    private PaymentStatus status;
    private PaymentType paymentType;

    public void makePayment() {

    }
}
