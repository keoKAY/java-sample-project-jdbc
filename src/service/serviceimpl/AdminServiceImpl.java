package service.serviceimpl;

import helpers.PropertiesUtils;
import model.Administrator;
import service.AdminService;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class AdminServiceImpl implements AdminService {
    private static final Properties properties = PropertiesUtils.readProperties();
//    username + password + url
    private final  String USERNAME =  properties.getProperty("db.username");
    private final String PASSWORD = properties.getProperty("db.password");
    private final String URL = properties.getProperty("db.url");


    @Override
    public List<Administrator> getAllAdmins() {
        List<Administrator> adminList = new ArrayList<>();
        try(
                Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD) ;
                Statement statement = connection.createStatement();
                ){

        ResultSet rs = statement.executeQuery("select * from admin_tb");
        while (rs.next()){
//            create admin object from rs
            Administrator admin = new Administrator(
                    rs.getInt("id"),
                    rs.getString("username"),
                    rs.getString("secretpass"),
                    rs.getTimestamp("created_date")

            );
//            add obj to the list
            adminList.add(admin);
        }

        return adminList;

        }catch (SQLException ex ){
            ex.printStackTrace();
            return null;
        }

    }

    @Override
    public int removeAdmin(int id) {
        return 0;
    }

    @Override
    public int updateAdmin(Administrator newAdminInfo) {
        return 0;
    }

    @Override
    public int createNewAdmin(Administrator admin) {
        return 0;
    }
}
