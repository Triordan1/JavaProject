import java.io.FileNotFoundException;

public class T10
{
    public static void main(String[] args) throws FileNotFoundException {
        School SCD = new School("SCD");

        SCD.readData("test10.txt");
        System.out.println("\n\n===== ANSWER: No employee with the email =====\n");
        SCD.searchByEmail("ccc@csu.edu");

        System.out.println("\n\n===== ANSWER: Employee Number: 300, Name: CCC =====\n");
        SCD.searchByEmail("ccc@csumb.edu");
    }
}