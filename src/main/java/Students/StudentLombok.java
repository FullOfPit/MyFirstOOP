package Students;
import java.util.ArrayList;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class StudentLombok {

    private String name;
    private int age;
    private int year;
    private final ArrayList<Integer> grades;
    private double gradeAvg;
}
