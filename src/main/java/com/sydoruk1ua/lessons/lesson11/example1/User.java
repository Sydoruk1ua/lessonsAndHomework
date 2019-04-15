package com.sydoruk1ua.lessons.lesson11.example1;

public class User {
    private final String name;

    protected User(UserBuilder userBuilder) {
        this.name = userBuilder.name;
    }

    public static UserBuilder builder() {
        return new UserBuilder();
    }

    public static class UserBuilder<SELF extends UserBuilder<SELF>> {
        private String name;

        protected UserBuilder() {
        }

        public User build() {
            return new User(this);
        }

        public SELF withName(String name) {
            this.name = name;
            return self();
        }

        @SuppressWarnings("unchecked")
        public SELF self() {
            return (SELF) this;
        }
    }
}
