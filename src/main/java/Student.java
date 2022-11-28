import java.util.ArrayList;

public class Student {
    private String name;
    private int age;

    private int year;
    private ArrayList<Integer> grades;
    private double gradeAvg;

    public Student() {
        this("N/A", -1, -1);
    }

    public Student(String name, int age, int year) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.grades = new ArrayList<>();
    }
    public Student(String name, int age, int year, int grade) {
        this.name = name;
        this.age = age;
        this.year = year;
        this.grades = new ArrayList<>();
        this.addStudentGrade(grade);
    }

    public void setStudentName(String name){
        this.name = name;
    }
    public void setStudentAge(int age){
        this.age = age;
    }
    public void setStudentYear(int year) {
        this.year = year;
    }

    public void addStudentGrade(int grade){
        this.grades.add(grade);
        this.updateGradeAvg();
    }

    private void updateGradeAvg() {
        this.gradeAvg = this.grades.stream().mapToDouble(a -> a).average().orElse(0.0);
    }

    public String getName(){
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public int getYear() {
        return this.year;
    }
    public ArrayList<Integer> getGrades() {
        return this.grades;
    }
    public double getGradeAverage() {
        return this.gradeAvg;
    }


}
