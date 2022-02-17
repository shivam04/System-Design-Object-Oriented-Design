import java.util.HashMap;
import java.util.List;

/**
 * Created by shivam.si on 17/02/22 1:31 pm
 */

public class SearchCache implements Search{
    HashMap<String, List<Question>> questions;
    @Override
    public List<Question> search(String query) {
        return questions.get("query");
    }
}
