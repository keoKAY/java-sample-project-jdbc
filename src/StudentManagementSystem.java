import helpers.DIContainer;
import service.AdminService;
import service.StudentService;
import service.serviceimpl.AdminServiceImpl;
import service.serviceimpl.StudentServiceImpl;

public class StudentManagementSystem {

    public static void main(String[] args) {
        DIContainer diContainer = new DIContainer();
        System.out.println(diContainer.getStudentService().getAllStudents());
        System.out.println(diContainer.getAdminService().getAllAdmins());

    }
}
