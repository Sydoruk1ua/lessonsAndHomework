package com.sydoruk1ua.lessons.lesson5.example3;

public class Service {
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void print(String str) {
        repository.print(str);
    }
}
