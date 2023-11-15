package helpers;

import service.AdminService;
import service.StudentService;
import service.serviceimpl.AdminServiceImpl;
import service.serviceimpl.StudentServiceImpl;

public class DIContainer {
    private AdminService adminService;
    private StudentService studentService;
//     define version of the services
    public DIContainer(){
        this.adminService = new AdminServiceImpl();
        this.studentService = new StudentServiceImpl();
    }

//    setter
    public AdminService getAdminService() {
        return adminService;
    }

    public StudentService getStudentService() {
        return studentService;
    }
}
