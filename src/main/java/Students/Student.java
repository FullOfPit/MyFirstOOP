package Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.IntStream;

public class Student {
    private String name;
    private int age;
    private int year;
    private final ArrayList<Integer> grades;
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

    //    -- generate an IntStream??
    public void addStudentGrade(List<Integer> gradeList){
        for(Integer grade : gradeList) {
            this.addStudentGrade(grade);
        };
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
    public double getGradeAvg() {
        return this.gradeAvg;
    }

    public String toString() {
        return "Student name: " + this.name + ", Student age: " + this.age + ", Student year: "
                + this.year + "\nStudent grades: " + this.grades.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() && getYear() == student.getYear() && Double.compare(student.getGradeAvg(), getGradeAvg()) == 0 && Objects.equals(getName(), student.getName()) && Objects.equals(getGrades(), student.getGrades());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge(), getYear(), getGrades(), getGradeAvg());
    }

    /*

     */


}
