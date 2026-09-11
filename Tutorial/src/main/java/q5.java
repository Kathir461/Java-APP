import student.student;
import course.course;
public class q5 {
    public static void main(String[] args) {
        student student = new student(
                "Kathir",
                101,
                "Computer Science"
        );
        course course = new course(
                "Java Programming",
                "CS201",
                4
        );
        student.displayStudent();
        System.out.println();
        course.displayCourse();
    }
}