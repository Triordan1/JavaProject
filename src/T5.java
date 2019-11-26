import java.io.FileNotFoundException;

// T5: Test register(), putScore(), getCourse(), updateLocation(), and courseInfo().
public class T5
{
    public static void main(String[] args) throws FileNotFoundException {
        School SCD = new School("SCD");
        Course course305;

        SCD.readData("test5.txt");

        SCD.assignInstructor (305, 100);
        SCD.register (305, 1111);
        SCD.register (305, 2222);
        SCD.putScore (305, 1111, 100.0);
        SCD.putScore (305, 2222, 50);

        course305 = SCD.getCourse(305);
        course305.updateLocation("ERROR ROOM");
        course305.updateLocation("BIT 104");

        System.out.println("\n\n===== ANSWER: CST305 (A. AAA, Course 305) at BIT 104 with 2 students (AVG: 75.00) =====\n");
        SCD.courseInfo(305);
    }
}