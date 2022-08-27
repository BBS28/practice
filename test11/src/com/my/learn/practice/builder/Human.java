package com.my.learn.practice.builder;

public class Human {

    private String name;
    private String lastName;
    private String email;

    public Human() {
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", LastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public static class Builder {

        private Human human;

        public Builder() {
            human = new Human();
        }

        public Builder buildName(String name) {
            human.name = name;
            return this;
        }

        public Builder buildLastName(String lastName) {
            human.lastName = lastName;
            return this;
        }

        public Builder buildEmail(String email) {
            human.email = email;
            return this;
        }

        public Human build(){
            return human;
        }
    }
}
