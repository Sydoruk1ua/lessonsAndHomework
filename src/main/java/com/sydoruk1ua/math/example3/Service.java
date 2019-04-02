package com.sydoruk1ua.math.example3;

public class Service {
    private Repository repository;

    public Service(Repository repository) {
        this.repository = repository;
    }

    public void print(String str) {
        repository.print(str);
    }
}
