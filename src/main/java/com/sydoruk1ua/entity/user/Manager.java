package com.sydoruk1ua.entity.user;

public class Manager extends User {
    private String number;
    private int code;

    public Manager(Long id, String email, String password, String number, int code) {
        super(id, email, password, UserType.MANAGER);
        this.number = number;
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public String getNumber() {
        return number;
    }
}
