package com.sydoruk1ua.lessons.lesson8.patterns.example1;

public class User {
    private final String name;
    private final String surname;
    private final String nickname;
    private final String email;
    private final String password;

    private User(Builder builder) {
        this.name = builder.name;
        this.surname = builder.surname;
        this.nickname = builder.nickname;
        this.email = builder.email;
        this.password = builder.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNickname() {
        return nickname;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

  /*  public User(String name, String surname, String nickname,
                String email, String password) {
        this.name = name;
        this.surname = surname;
        this.nickname = nickname;
        this.email = email;
        this.password = password;
    }*/

    //Builder
    public static class Builder {
        private String name;
        private String surname;
        private String nickname;
        private String email;
        private String password;

        private Builder() {

        }

        public Builder(String email, String password) {
            this.email = email;
            this.password = password;
        }

        public User build() {
            return new User(this);
        }

        public Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Builder withSurname(String surname) {
            this.surname = surname;
            return this;
        }

        public Builder withNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }
    }
}
