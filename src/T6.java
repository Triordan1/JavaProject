import java.io.FileNotFoundException;

// T6: Test courseInfo() for all courses.
public class T6
{
    public static void main(String[] args) throws FileNotFoundException {
        School SCD = new School("SCD");

        SCD.readData("test6.txt");
        SCD.assignInstructor (301, 300);
        SCD.assignInstructor (302, 300);
        SCD.assignInstructor (303, 300);
        SCD.register (301, 1111);
        SCD.register (301, 2222);
        SCD.register (301, 3333);
        SCD.register (302, 3333);
        SCD.register (302, 2222);
        SCD.register (302, 1111);
        SCD.register (303, 1111);
        SCD.register (303, 2222);
        SCD.register (303, 3333);
        SCD.unRegister  (303, 1111);
        SCD.unRegister  (303, 2222);
        SCD.unRegister  (303, 3333);

        System.out.println("\n\n===== ANSWER: 3 Courses with 301 (3 enrolled), 302 (3 enrolled) and 303 (0 enrolled) =====\n");
        SCD.courseInfo();
    }
}