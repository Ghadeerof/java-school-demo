import java.util.ArrayList;

public class Teacher {

    private long teacherId;
    private String fullName;
    private int age;
    private String spec;

    private ArrayList<Course> courses;

    public Teacher() {
        courses = new ArrayList<>();
    }

    public Teacher(long teacherId, String fullName, int age, String spec) {
        this();
        this.teacherId = teacherId;
        this.fullName = fullName;
        this.age = age;
        this.spec = spec;
    }

    public Teacher(long teacherId, String fullName, int age, String spec, ArrayList<Course> courses) {
        this();
        this.teacherId = teacherId;
        this.fullName = fullName;
        this.age = age;
        this.spec = spec;
        this.courses = courses;
    }

    public long getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(long teacherId) {
        this.teacherId = teacherId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSpec() {
        return spec;
    }

    public void setSpec(String spec) {
        this.spec = spec;
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
