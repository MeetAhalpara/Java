class course{
    private String courseCode;
    private String courseName;

    public course(String courseCode, String courseName) {
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
}

class student{
    private int studentId;
    private String studentName;
    private course course;

    student(int studentId, String studentName, String courseCode, String courseName) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = new course(courseCode, courseName);
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public void setCourse(String courseCode, String courseName) {
        this.course = new course(courseCode, courseName);
    }
}

public class InstanceOfClasses {
    public static void main(String[] args) {
        student s1 = new student(1, "Meet", "CST8288", "OOP With Design Patterns.");
    }
}
