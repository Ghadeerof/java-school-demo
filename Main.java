public class Main {
    public static void main(String[] args){
        Course java = new Course(1,"Java","JC1");
        Course math = new Course(2,"Math","ME1");
        Course web = new Course(3,"Web","WS1");
        Course database = new Course(3,"Web","WS1");

        Teacher t1 = new Teacher(1,"Ghadeer Al Hasan",25,"Software Developer");
        Teacher t2 = new Teacher(2,"Abdo Al Ahmad",30,"Software Developer");
        Teacher t3 = new Teacher(3,"Mohmad Al Ahmad",32,"Software Developer");

        Student s1 = new Student(1,"User 1",1);
        Student s2 = new Student(2,"User 2",1);
        Student s3 = new Student(3,"User 3",2);
        Student s4 = new Student(4,"User 4",2);
        Student s5 = new Student(5,"User 5",3);
        Student s6 = new Student(6,"User 6",3);

        java.setTeacher(t1);
        web.setTeacher(t1);
        math.setTeacher(t2);;
        database.setTeacher(t3);

        t1.addCourse(java);
        t1.addCourse(web);

        s1.addCourse(java);
        s3.addCourse(java);
        s2.addCourse(java);
        java.addStudent(s1);
        java.addStudent(s2);
        java.addStudent(s3);

        s3.addCourse(web);
        s5.addCourse(web);
        s4.addCourse(web);
        web.addStudent(s3);
        web.addStudent(s4);
        web.addStudent(s5);

        s5.addCourse(math);
        s6.addCourse(math);
        math.addStudent(s5);
        math.addStudent(s6);


        for(Student std : java.getStudents()){
            System.out.println(std.getFullName());
        }

        for(Course course : t1.getCourses()){
            System.out.println(course.getName());
        }
    }
}
