import Students.Student;
import Students.StudentDB;

public class Main {

    public void emptyMethod() {

    }
    public static void main(String[] args) {

        Student christian = new Student("Christian", 30, 267);
        Student sebastian = new Student("Sebastian", 28, 965);
        Student abir = new Student("Abir", 35, 875);
        Student muslim = new Student("Muslim", 32, 273);
        Student elias = new Student("Elias" , 27, 433);

        Student[] newStudentArray = new Student[]{christian, sebastian, abir, muslim, elias};
        StudentDB javaBO_22_1 = new StudentDB(newStudentArray);

        javaBO_22_1.removeStudent(muslim);
        int numStu = javaBO_22_1.getAllStudents().length;
        System.out.println(numStu);


        //String[] stringArray = new String[] {"hello", "sebastian", "and", "Abir"};





    }
}
