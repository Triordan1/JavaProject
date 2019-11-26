import java.io.FileNotFoundException;

public class T9
{
    public static void main(String[] args) throws FileNotFoundException {
        School SCD = new School("SCD");

        SCD.readData("test9.txt");

        SCD.assignInstructor (301, 300);
        SCD.assignInstructor (302, 300);
        SCD.register (301, 1111);
        SCD.register (301, 2222);
        SCD.register (301, 3333);
        SCD.register (302, 2222);

        SCD.putScore (301, 1111, 95.0);
        SCD.putScore (301, 2222, 85.5);
        SCD.putScore (301, 3333, 75.0);
        SCD.putScore (302, 2222, 84.5);


        Student student1 = SCD.getStudent(2222);
        System.out.println("\n\n===== ANSWER: Student BB BBBB - 2 courses enrolled. (AVG: 85.0)  =====\n");
        System.out.println(student1);
    }
}