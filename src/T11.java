import java.io.FileNotFoundException;

// T11: Test graduateStudent().
public class T11
{
    public static void main(String[] args) throws FileNotFoundException {
        School SCD = new School("SCD");

        SCD.readData("test11.txt");

        SCD.assignInstructor (301, 300);
        SCD.assignInstructor (302, 300);
        SCD.register (301, 1111);
        SCD.register (301, 2222);
        SCD.register (302, 1111);
        SCD.register (302, 2222);

        SCD.putScore (301, 1111, 100.0);
        SCD.putScore (301, 2222, 100.0);
        SCD.putScore (302, 1111, 100.0);
        SCD.putScore (302, 2222, 100.0);

        SCD.graduateStudent(1111);

        System.out.println("\n\n===== ANSWER: There are 2 courses. Each course has only one student. =====\n");
        SCD.courseInfo();
    }
}
