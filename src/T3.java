import java.io.FileNotFoundException;

public class T3
{
    public static void main(String[] args) throws FileNotFoundException {
        School SCD = new School("SCD");

        SCD.readData("test3.txt");

        System.out.println("\n\n===== ANSWER: The program should display three failed course additions. =====\n");
        SCD.addCourse(301, "CST301 - Incorrect Course A", 10, "ERROR301");
        SCD.addCourse(308, "CST308 - Course 308", 30, "BIT103");
        SCD.addCourse(309, "CST309 - Course 309", 40, "BIT104");
        SCD.addCourse(308, "CST308 - Incorrect Course B", 10, "ERROR308");
        SCD.addCourse(305, "CST305 - Incorrect Course C", 10, "ERROR305");
        SCD.addCourse(310, "CST310 - Course 310", 50, "BIT105");
    }
}