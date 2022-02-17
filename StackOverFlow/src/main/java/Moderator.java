/**
 * Created by shivam.si on 17/02/22 1:18 pm
 */

public class Moderator extends Member{
    public boolean closeQuestion(Question question) {
        return true;
    }
    public boolean unDeleteQuestion(Question question) {
        return true;
    }
}
