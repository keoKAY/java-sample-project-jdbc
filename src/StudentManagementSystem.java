import service.StudentService;
import service.serviceimpl.StudentServiceImpl;

public class StudentManagementSystem {

    public static void main(String[] args) {
        StudentService studentService = new StudentServiceImpl();

        System.out.println("Here are all the students ");
        System.out.println(studentService.getAllStudents());
    }
}
