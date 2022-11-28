import java.util.List;

public class Year3Student extends Student {
    private List<String> subjects;

    public Year3Student() {
        super("N/A", -1, 3);
    }

    public void addSubject(String subject) {
        this.subjects.add(subject);
    }
    public void addSubjectList(List<String> subjectList) {
        this.subjects.add(subjectList.stream().toString());
    }
}
