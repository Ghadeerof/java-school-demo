import java.util.ArrayList;

public class Course {

    private long courseId;
    private String name;
    private String code;

    private Teacher teacher;
    private ArrayList<Student> students;

    public Course() {
        teacher = new Teacher();
        students = new ArrayList<>();
    }

    public Course(long courseId, String name, String code) {
        this();
        this.courseId = courseId;
        this.name = name;
        this.code = code;
    }

    public Course(long courseId, String name, String code, Teacher teacher, ArrayList<Student> students) {
        this();
        this.courseId = courseId;
        this.name = name;
        this.code = code;
        this.teacher = teacher;
        this.students = students;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Student> getStudents() {
        return students;
    }

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student){
        this.students.add(student);
    }

    public void removeStudent(Student student){
        this.students.remove(student);
    }
}
