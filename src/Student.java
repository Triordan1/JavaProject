import java.util.HashMap;

public class Student extends Person {
    private HashMap<Course, String> courseGrades;
    public Student(String name, String id){
        super(name,id);
        courseGrades = new HashMap<>();
    }
    public void addGrade(Course course, String grade){
        courseGrades.put(course,grade);
    }
    public String returnGrade(Course course){
        return courseGrades.get(course);
    }
    public void graduate(){
        for(Course course: courseGrades.keySet())
        {
            course.removeStudent(this);
        }
        courseGrades.clear();
    }

    @Override
    public String toString() {
        double gradeAverage = 0;
        for(Course course: courseGrades.keySet()){
            String grade = courseGrades.get(course);
            Double points = Double.parseDouble(grade);
            gradeAverage+=points;
        }
        gradeAverage /= courseGrades.size();
        return "Student " + getName() + " - " + courseGrades.size() +  "  courses enrolled. (AVG: " + gradeAverage + ")";
    }
}
