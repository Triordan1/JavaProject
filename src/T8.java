import java.io.FileNotFoundException;

// T8: Test addStudent().
public class T8
{
    public static void main(String[] args) throws FileNotFoundException {
        School SCD = new School("SCD");

        SCD.readData("test8.txt");
        SCD.addStudent(2222, "BB BBBB");
        SCD.addStudent(3333, "CC CCCC");
        SCD.addStudent(4444, "DD DDDD");
        SCD.addStudent(5555, "FF FFFF");

        SCD.assignInstructor (301, 300);
        SCD.register (301, 1111);
        SCD.register (301, 2222);
        SCD.register (301, 3333);
        SCD.register (301, 4444);
        SCD.register (301, 5555);

        SCD.putScore (301, 1111, 95.0);
        SCD.putScore (301, 2222, 85.0);
        SCD.putScore (301, 3333, 75.0);
        SCD.putScore (301, 4444, 65.0);
        SCD.putScore (301, 5555, 55.0);

        System.out.println("\n\n===== ANSWER: Course 301 with 5 students enrolled (AVG: 75.00) =====\n");
        SCD.courseInfo(301);
    }
}