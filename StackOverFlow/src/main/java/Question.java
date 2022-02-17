import java.util.Date;
import java.util.List;

/**
 * Created by shivam.si on 17/02/22 1:23 pm
 */

public class Question {
    private String title;
    private String description;
    private int viewCount;
    private List<Vote> voteList;
    private Date creationTime;
    private Date updateTime;
    private QuestionStatus status;
    private Member askingMember;
    private List<Answer> answers;
    private List<Tag> tags;

    public boolean close() {
        return true;
    }

    public boolean unDelete() {
        return true;
    }

    public boolean addAnswers(Answer answer) {
        answers.add(answer);
        //some operation
        return true;
    }

    public boolean updateQuestion() {
        this.updateTime = new Date();
        return true;
    }

    public void setTag(Tag tag) {
        this.tags.add(tag);
    }
}
