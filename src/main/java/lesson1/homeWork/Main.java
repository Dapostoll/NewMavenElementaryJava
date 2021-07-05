package lesson1.homeWork;

import lesson1.homeWork.classes.Admin;
import lesson1.homeWork.classes.User;
import lesson1.homeWork.services.AdminService;
import lesson1.homeWork.services.UserService;

/*
* my github
* https://github.com/Dapostoll
* */

public class Main {
    public static void main(String[] args) throws Exception {

        String filePath = "C:/Users/Danil/IdeaProjects/NewElementaryJava/src/resources/FileUser.txt";

        User user = new User();
        user.setName("Lol");
        user.setLastName("Kek");
        user.setAge(12);
        user.setEmail("Lol@gmail.com");
        user.setPassword("kek123");

        Admin admin = new Admin();
        admin.setName("MrT");
        admin.setLastName("Teacher");
        admin.setAge(99);
        admin.setEmail("MrTmail@gmail.com");
        admin.setPassword("1922");

        UserService userService = new UserService();
        userService.setFilePath(filePath);

        AdminService adminService = new AdminService();
        adminService.setFilePath(filePath);

        userService.signUpUserData(user);
        adminService.signUpUserData(admin);
        adminService.signUpUserData(user);

        System.out.println(userService.checkUser(admin));
        System.out.println(adminService.checkUser(user));
    }
}
