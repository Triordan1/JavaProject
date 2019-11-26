import java.util.HashMap;

public class Course {
    private String  id;
    private String name;
    private String  cap;
    private String location;
    private String profId;
    private HashMap<Student,String> studentGrades;
    public Course(String aId, String aTitle, String aCap, String aLocation)
    {
        id = aId;
        name = aTitle;
        cap = aCap;
        location = aLocation;
        studentGrades = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public String getLocation() {
        return location;
    }

    public void updateLocation(String location) {
        this.location = location;
    }

    public void setProfId(String profId) {
        this.profId = profId;
    }
    public void addStudent(Student student){
        studentGrades.put(student,"0");
    }
    public void setStudentGrade(Student student,String grade){
        studentGrades.remove(student);
        studentGrades.put(student,grade);
    }
    public double calculateAverage(){
        double average = 0;
        for(Student student: studentGrades.keySet()){
            average+=Double.parseDouble(studentGrades.get(student));
        }
        if(studentGrades.size()==0){
            return 0;
        }
        return (average/studentGrades.size());
    }
    public int getSizeClass(){
        return studentGrades.size();
    }
    public boolean studentInClass(Student student){
        return studentGrades.containsKey(student);
    }
    public void removeStudent(Student student){
        studentGrades.remove(student);
    }
}
