import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class School {
    private String name;
    private ArrayList<Professor> professors = new ArrayList<>();
    private ArrayList<Course> courses = new ArrayList<>();
    private ArrayList<Student> students = new ArrayList<>();
    public School(String name) {
        this.name = name;
    }
    public void readData(String fileName) throws FileNotFoundException {
        File f = new File(fileName);
        Scanner s = new Scanner(f);
        getTeacherData(s);
        getCourseData(s);
        getStudentData(s);
        System.out.println("Done");
    }
    public void schoolInfo(){
        System.out.println("School Name: " + this.name);
        System.out.println("Instructor Information");
        for(int i = 0; i < professors.size(); i++){
            System.out.println(professors.get(i).getName());
        }
        System.out.println("Course Information");
        for(int i = 0; i < courses.size(); i++){
            System.out.println(courses.get(i).getName());
        }
        System.out.println("Student Information");
        for(int i = 0; i < students.size(); i++){
            System.out.println(students.get(i).getName());
        }
    }
    public void searchByEmail(String email){
        System.out.println("Search Key: " + email);
        boolean found = false;
        for (Professor professor : professors) {
            if (professor.getEmail().equals(email)) {
                System.out.println("Employee Number: " + professor.getId());
                System.out.println("Name: " + professor.getName());
                System.out.println("Phone: " + professor.getPhoneNumber());
                found = true;
            }
        }
        if (!found){
            System.out.println("No employee with email " + email);
        }
    }
    private void getTeacherData(Scanner s) {

            int numTeachers = Integer.parseInt(s.nextLine());
            for(int i = 0; i < numTeachers; i++) {
                boolean found = false;
                String teacherInfo = s.nextLine();
                String[] info = teacherInfo.split(",");
                String id = info[0];
                String name = info[1];
                String email = info[2];
                String phone = info[3];
                for (Professor professor:professors) {
                    if(professor.getId().equals(id)){
                        found = true;
                    }
                }
                if(!found) {
                    Professor prof = new Professor(name, id, email, phone);
                    professors.add(prof);
                }
                else{
                    System.out.println("Instructor info reading failed - Employee number " + id + " already used.");
                }

            }
    }
    private void getCourseData(Scanner s){
        int numCourses = Integer.parseInt(s.nextLine());
        for(int i = 0; i < numCourses; i++) {
            boolean found = false;
            String courseInfo = s.nextLine();
            String[] info = courseInfo.split(",");
            String id = info[0];
            String title = info[1];
            String cap = info[2];
            String building = info[3];
            for(Course course:courses)
            {
                if(course.getId().equals(id)){
                    found = true;
                }
            }
            if (!found) {
                Course course = new Course(id, title, cap, building);
                courses.add(course);
            }
            else {
                System.out.println("Course addition failed - Course number " + id + " already used");
            }
        }
    }
    private void getStudentData(Scanner s)
    {
        int numStudents = Integer.parseInt(s.nextLine());
        for(int i = 0; i < numStudents; i++) {
            boolean found = false;
            String studentInfo = s.nextLine();
            String[] info = studentInfo.split(",");
            String id = info[0];
            String name = info[1];
            for (Student student:students) {
                if(student.getId().equals(id)){
                    found = true;
                }
            }
            if(!found) {
                Student student = new Student(name,id);
                students.add(student);
            }
            else{
                System.out.println("Student info reading failed - Student ID " + id + " already used.");
            }

        }
    }
    public void addCourse(int id, String name, int cap, String building){
        String sId = Integer.toString(id);
        String sCap = Integer.toString(cap);
        for(Course course: courses){
            if(course.getId().equals(sId)){
                System.out.println("Course addition failed - Course number " + sId + " already used.");
                return;
            }
        }
        courses.add(new Course(sId,name,sCap,building));
    }
    public void addInstructor(int id,String name, String email, String phoneNumber){
        String sId = Integer.toString(id);
        for(Professor professor: professors){
            if(professor.getId().equals(sId)){
                System.out.println("Professor addition failed - Employee number " + sId + " already used.");
                return;
            }
        }
        professors.add(new Professor(name,sId,email,phoneNumber));
    }
    public void addStudent(int studentId, String name){
        for(Student student: students){
            if(student.getId().equals(Integer.toString(studentId))){
                System.out.println("Student addition failed - Student id " + studentId + " Already used");
                return;
            }
        }
        Student student = new Student(name,Integer.toString(studentId));
        students.add(student);
    }
    public void assignInstructor(int cId, int pId){
        String courseId = Integer.toString(cId);
        String profId = Integer.toString(pId);
        for(Professor professor: professors){
            if(profId.equals(professor.getId())){
                professor.addClass(courseId);
                return;
            }
        }
        System.out.println("Instructor " + profId + " does not exist");

    }
    public Course getCourse(int id){
        for(Course course:courses){
            if (course.getId().equals(Integer.toString(id))){
                return course;
            }
        }
        System.out.println("No such class exists");
        return null;
    }
    public Student getStudent(int id){
        for (Student student: students){
            if(student.getId().equals(Integer.toString(id))){
                return student;
            }
        }
        System.out.println("No student with that ID exists");
        return null;
    }
    public void register(int cId, int sId){
        String courseId = Integer.toString(cId);
        String studentId = Integer.toString(sId);
            for(Student student:students){
                if(student.getId().equals(studentId)){
                    for(Course course: courses){
                        if(course.getId().equals(courseId)){
                            course.addStudent(student);
                            return;
                        }
                    }
                    System.out.println("Error - Course ID " + courseId + " Does not exist");
                    return;
                }
            }
        System.out.println("Error - No student exists with ID " + studentId);
    }
    public void putScore(int courseId, int studentId,double grade){
        for(Student student:students){
            if(student.getId().equals(Integer.toString(studentId))){
                for(Course course: courses){
                    if(course.getId().equals(Integer.toString(courseId))){
                        course.setStudentGrade(student,Double.toString(grade));
                        student.addGrade(course,Double.toString(grade));
                        return;
                    }
                }
                System.out.println("Error - Course ID " + courseId + " Does not exist");
            }
        }
        System.out.println("Error - No student exists with ID " + studentId);
    }
    public void courseInfo(int courseId){
        for(Course course:courses){
            if(course.getId().equals(Integer.toString(courseId))){
                System.out.println("Course number: " + course.getId());
                for(Professor professor: professors){
                    if(professor.checkList(Integer.toString(courseId))){
                        System.out.println("Instructor: " + professor.getName());
                    }
                }
                System.out.println("Course Title: " + course.getName());
                System.out.println("Room: " + course.getLocation());
                System.out.println("Total Enrolled: " + course.getSizeClass());
                System.out.println("Course Average: " + course.calculateAverage());
            }
        }
    }
    public void unRegister(int courseId,int studentId){
        for(Course course: courses){
            if(course.getId().equals(Integer.toString(courseId))){
                for(Student student:students){
                    if(student.getId().equals(Integer.toString(studentId))&&course.studentInClass(student)){
                        course.removeStudent(student);
                    }
                }
            }
        }
    }
    public void courseInfo(){
        System.out.println("Number of Courses: " + courses.size());
        for(Course course: courses){
            System.out.println(course.getId() + ": " + course.getSizeClass() + " enrolled");
        }
    }
    public void deleteCourse(int courseId){
        for(int i = 0; i < courses.size(); i++){
            if(courses.get(i).getId().equals(Integer.toString(courseId))){
                if(courses.get(i).getSizeClass() >= 1){
                    System.out.println("Course deletion failed - Enrolled student(s) in the class");
                }
                else{
                    courses.remove(i);
                }
            }
        }
    }
    public void graduateStudent(int studentId){
        for(Student student: students){
            if(student.getId().equals(Integer.toString(studentId))){
                student.graduate();

                return;
            }
        }
        System.out.println("Error - no student with ID " + studentId);
    }

}
