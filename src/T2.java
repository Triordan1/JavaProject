import java.io.FileNotFoundException;

// T2: Test readData() with incorrect data.
public class T2
{
    public static void main(String[] args) throws FileNotFoundException {
        School SCD = new School("SCD");

        SCD.readData("test1.txt");
        System.out.println("\n\n===== ANSWER: 3 fail messages. One instructor fail, one course fail, one student fail. =====\n");
        SCD.readData("test2.txt");
    }
}