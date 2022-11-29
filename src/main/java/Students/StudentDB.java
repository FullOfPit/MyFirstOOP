package Students;

import java.util.Arrays;

public class StudentDB {
    private Student[] students;

    public StudentDB(Student[] students) {
        this.students = students;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }


    public Student[] getAllStudents() {
        return this.students;
    }



    public Student randomStudent() {
        int randomNumber = (int)(Math.random() * this.students.length);
        return this.students[randomNumber];
    }

    public void addStudent(Student student) {
        Student[] newArray = new Student[this.students.length + 1];
        for(int i = 0; i < this.students.length; i++) {
            newArray[i] = this.students[i];
        }
        newArray[this.students.length] = student;
        this.students = newArray;

        //Student[] newStudents = Arrays.copyOf(students, students.length + 1);
    }
    public Student removeStudent(Student student) {
        Student[] newArray = new Student[this.students.length - 1];
        int studentIndex = Arrays.asList(this.students).indexOf(student);
        Student studentToRemove = this.students[studentIndex];

        for (int i = 0; i <= studentIndex; i++) {
            newArray[i] = this.students[i];
        }
        for (int i = studentIndex + 1; i < this.students.length -1; i++) {
            newArray[i] = this.students[i];
        }
        this.students = newArray;

        return studentToRemove;
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB = (StudentDB) o;
        return Arrays.equals(getStudents(), studentDB.getStudents());
    }
    @Override
    public int hashCode() {
        return Arrays.hashCode(getStudents());
    }
}
