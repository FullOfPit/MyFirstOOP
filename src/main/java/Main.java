import Students.Student;

public class Main {

    public void emptyMethod() {

    }
    public static void main(String[] args) {

        Student christian = new Student("Christian", 30, 1);
        christian.addStudentGrade(3);
        christian.addStudentGrade(5);
        christian.addStudentGrade(3);
        christian.addStudentGrade(3);
        System.out.println(christian.toString());

    }
}
