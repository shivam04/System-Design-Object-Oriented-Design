import enums.TransactionType;

/**
 * Created by shivam.si on 11/02/21 1:31 pm
 */
public class Screen {
    public boolean showMessage(String message) {
        return true;
    }
    public TransactionType getInput() {
        return TransactionType.BALANCE_INQUIRY;
    }
}
