package com.sydoruk1ua.ui;

import com.sydoruk1ua.entity.user.Admin;
import com.sydoruk1ua.entity.user.User;
import com.sydoruk1ua.entity.user.UserType;
import com.sydoruk1ua.service.UserService;

import java.util.ResourceBundle;
import java.util.Scanner;

public class ConsoleUi {
    private ResourceBundle resourceBundle;
    private UserService userService;
    private Scanner scanner;

    public ConsoleUi(UserService userServiceImpl) {
        this.userService = userServiceImpl;
        this.scanner = new Scanner(System.in);
        this.resourceBundle = ResourceBundle.getBundle("message_ru_Ru");
    }

    public void run() {

        boolean isLogin = false;
        String email = null;
        while (!isLogin) {
            System.out.println("1-Login/2-Create account");
            int choose = scanner.nextInt();
            System.out.println(resourceBundle.getString("input.email"));
            email = scanner.next();
            System.out.println("Input password");
            String password = scanner.next();

            isLogin = choose == 1 ? userService.login(email, password)
                    : userService.create(new User(100L, email, password)) != null;
        }
        User user = userService.findByEmail(email);

        UserType userType = user.getUserType();
        if (userType == UserType.ADMIN) {
            Admin admin = (Admin) user;
            System.out.println("Hello admin " + admin.getKey());
        }

        System.out.println(user);
    }
}
