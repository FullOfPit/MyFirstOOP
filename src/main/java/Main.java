import Students.Student;

public class Main {

    public void emptyMethod() {

    }
    public static void main(String[] args) {

        Student christian = new Student("Christian", 30, 267);
        Student sebastian = new Student("Sebastian", 28, 965);
        Student abir = new Student("Abir", 35, 875);

        Student[] newStudentArray = new Student[]{christian, sebastian, abir};

        //String[] stringArray = new String[] {"hello", "sebastian", "and", "Abir"};

        int randomNumber = (int)(Math.random() * 5);
        System.out.println(newStudentArray[2]);




    }
}
