package service;

import model.Administrator;

import java.util.List;
// record vs class
// MVC -> DI style ( Dependency Injection )
public interface AdminService {
    List<Administrator> getAllAdmins();
    int removeAdmin(int id);
    int updateAdmin(Administrator newAdminInfo);
    int createNewAdmin(Administrator admin);

}
