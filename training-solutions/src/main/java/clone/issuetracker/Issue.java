package clone.issuetracker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Issue {

    private String name;
    private LocalDateTime time;
    private Status status;
    private List<Comment> comments=new ArrayList<>();


    public Issue(Issue issue, CopyMode copyMode) {

        if (copyMode.equals(CopyMode.WITHOUT_COMMENTS)) {
            this.name = issue.name;
            this.time = issue.time;
            this.status = issue.status;
        } else if (copyMode.equals(CopyMode.WITH_COMMENTS)) {
            this.name = issue.name;
            this.time = issue.time;
            this.status = issue.status;

            List<Comment> copiedComments = new ArrayList<>();
            for (Comment c : issue.comments) {
                copiedComments.add(new Comment(c));
            }
            this.comments=copiedComments;
        }
    }

    public Issue(String name, LocalDateTime time, Status status) {
        this.name = name;
        this.time = time;
        this.status = status;
    }

    public Issue(String name, LocalDateTime time, Status status, List<Comment> comments) {
        this.name = name;
        this.time = time;
        this.status = status;
        this.comments = comments;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public Status getStatus() {
        return status;
    }

    public List<Comment> getComments() {
        return comments;
    }
}
