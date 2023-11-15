import helpers.DIContainer;
import helpers.TableUtils;
import helpers.ValidationUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    public static void main(String[] args) {
        DIContainer diContainer = new DIContainer();
        Scanner scanner = new Scanner(System.in);
        List<String> studentMenu =
                new ArrayList<>(
                        List.of("Add New Student",
                                "Edit Student ",
                                "Delete Student ",
                                "Show All Student ",
                                "Search Students ",
                                "Exit Program"));
        int option;

        do{
            TableUtils.renderMenu(
                    studentMenu,
                    "Student Management System"
            );
            option = ValidationUtils
                    .readInteger(">>> Choose Your Option:",scanner);
        }while (option!= studentMenu.size());






    }
}
