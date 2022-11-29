package Students;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StudentDBTest {


    @Test
    void getAllStudents() {
    }

    @Test
    void addStudent_addedStudentAtLastIndex() {
        //Given
        Student studentInDB1 = new Student("Test_1", 1, 1);
        Student studentInDB2 = new Student("Test_2", 1, 2);
        Student[] studentArrayToTest = {studentInDB1, studentInDB2};
        StudentDB newDB = new StudentDB(studentArrayToTest);

        Student studentToAdd = new Student("Test_3", 1, 3);
        //When
        newDB.addStudent(studentToAdd);
        //Then
        Assertions.assertEquals(studentToAdd, newDB.getAllStudents()[(newDB.getAllStudents().length - 1)]);
    }

    @Test
    void addStudent_studentDBLengthIncreasedByOne() {
        //Given
        Student studentInDB1 = new Student("Test_1", 1, 1);
        Student studentInDB2 = new Student("Test_2", 1, 2);
        Student[] studentArrayToTest = {studentInDB1, studentInDB2};
        StudentDB newDB = new StudentDB(studentArrayToTest);

        Student studentToAdd = new Student("Test_3", 1, 3);
        //When
        newDB.addStudent(studentToAdd);
        //Then
        Assertions.assertEquals(3, newDB.getAllStudents().length);
    }

    @Test
    void removeStudent() {
    }
}