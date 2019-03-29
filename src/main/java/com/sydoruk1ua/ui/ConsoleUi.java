package com.sydoruk1ua.ui;

import com.sydoruk1ua.entity.User;
import com.sydoruk1ua.service.UserService;

import java.util.Scanner;

public class ConsoleUi {
    private UserService userService;
    private Scanner scanner;

    public ConsoleUi(UserService userServiceImpl) {
        this.userService = userServiceImpl;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean isLogin = false;
        String email = null;
        while (!isLogin) {
            System.out.println("Plase input your email and password");
            email = scanner.next();
            String password = scanner.next();
            isLogin = userService.login(email, password);
        }
        User user = userService.findByEmail(email);

        System.out.println(user);
    }
}
