package Students;

import java.util.Arrays;
import java.util.stream.Stream;

public class StudentDB {
    private Student[] students;

    public StudentDB(Student[] studentArray) {
        this.students = studentArray;
    }

    public Student[] getAllStudents() {
        return this.students;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

    public Student randomStudent() {
        int randomNumber = (int)(Math.random() * this.students.length);
        return this.students[randomNumber];
    }

    public void add(Student student) {
        Student[] newArray = new Student[this.students.length + 1];
        for(int i = 0; i < this.students.length; i++) {
            newArray[i] = this.students[i];
        }
        newArray[this.students.length + 1] = student;
        this.students = newArray;
    }
/*
    public Student remove(Student student) {
        Student[] newArray = Arrays.stream(this.students).filter();
    }


 */

}
