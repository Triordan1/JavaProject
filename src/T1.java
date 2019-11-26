import java.io.FileNotFoundException;

// T1: Test readData() and schoolInfo().
public class T1
{
    public static void main(String[] args) throws FileNotFoundException {
        School SCD = new School("SCD");

        SCD.readData("test1.txt");

        System.out.println("\n\n===== ANSWER: 1 Instructor (Y. Byun), 1 Course (CST338), 1 Student (Alice Otter) =====\n");
        SCD.schoolInfo();
    }
}