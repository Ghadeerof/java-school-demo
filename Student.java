import java.util.ArrayList;

public class Student {

    private long studentId;
    private String fullName;
    private int year;

    private ArrayList<Course> courses;

    public Student() {
        courses = new ArrayList<>();
    }

    public Student(long studentId, String fullName, int year) {
        this();
        this.studentId = studentId;
        this.fullName = fullName;
        this.year = year;
    }

    public Student(long studentId, String fullName, int year, ArrayList<Course> courses) {
        this();
        this.studentId = studentId;
        this.fullName = fullName;
        this.year = year;
        this.courses = courses;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course){
        this.courses.add(course);
    }

    public void removeCourse(Course course){
        this.courses.remove(course);
    }
}
