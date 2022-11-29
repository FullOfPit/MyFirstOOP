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
    public void removeStudent(Student student) {
        Student[] newArray = new Student[this.students.length - 1];
        int studentIndex = Arrays.asList(this.students).indexOf(student);
        for (int i = 0; i <= studentIndex; i++) {
            newArray[i] = this.students[i];
        }
        for (int i = studentIndex + 1; i < this.students.length -1; i++) {
            newArray[i] = this.students[i];
        }
        this.students = newArray;
        /*
        Student[] newArray = Arrays.stream(this.students).filter(obj -> !obj.equals(student)).toArray(new Student[this.students.length]);
        this.students = newArray;
         */
    }



}
