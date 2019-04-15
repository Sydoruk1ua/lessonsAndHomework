package com.sydoruk1ua.lessons.lesson11.example1;

public class Admin extends User {
    private int password;

    public Admin(AdminBuilder adminBuilder) {
        super(adminBuilder);
        this.password = adminBuilder.password;
    }

    public static class AdminBuilder extends UserBuilder<AdminBuilder> {
        private int password;

        public AdminBuilder() {

        }

        public Admin build() {
            return new Admin(this);
        }

        public AdminBuilder withPassword(int password) {
            this.password = password;
            return self();
        }

        @Override
        public AdminBuilder self() {
            return this;
        }
    }
}
