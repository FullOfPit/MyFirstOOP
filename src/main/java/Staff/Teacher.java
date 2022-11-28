package Staff;

import java.util.List;

public class Teacher {
    private String name;
    private List<String> subjectsTaught;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setSubjectsTaught(List<String> subjectList) {
        this.subjectsTaught = subjectList;
    }

    public List<String> getSubjectsTaught() {
        return this.subjectsTaught;
    }


}
