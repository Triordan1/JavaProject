import java.io.FileNotFoundException;

// T4: Test addInstructor(), assignInstructor(), and addCourse().
public class T4
{
    public static void main(String[] args) throws FileNotFoundException {
        School SCD = new School("SCD");

        SCD.readData("test4.txt");

        SCD.addInstructor(200, "B. BBB", "bbb@csumb.edu", "222-222-2222");
        SCD.addInstructor(300, "C. CCC", "ccc@csumb.edu", "333-333-3333");
        SCD.addCourse(302, "CST302 - Course 302", 20, "BIT102");
        SCD.addCourse(303, "CST303 - Course 303", 30, "BIT103");
        SCD.addCourse(304, "CST304 - Course 304", 10, "BIT104");
        SCD.addCourse(305, "CST305 - Course 305", 20, "BIT105");
        SCD.assignInstructor (301, 100);
        SCD.assignInstructor (302, 200);
        SCD.assignInstructor (303, 300);
        System.out.println("\n\n===== ANSWER: Two error messages for non-existing instructors. =====\n");
        SCD.assignInstructor (304, 400);
        SCD.assignInstructor (305, 500);
    }
}