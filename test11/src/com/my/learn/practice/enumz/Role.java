package com.my.learn.practice.enumz;

public enum Role {
    STUDENT(5,18),
    TEACHER(20,60),
    DIRECTOR(40,70),
    SECURITY_GUARD(18,50);

    private int ageFrom;
    private int ageTo;

    Role(int ageFrom, int ageTo) {
        this.ageFrom = ageFrom;
        this.ageTo = ageTo;
    }

    public int getAgeFrom() {
        return ageFrom;
    }

    public void setAgeFrom(int ageFrom) {
        this.ageFrom = ageFrom;
    }

    public int getAgeTo() {
        return ageTo;
    }

    public void setAgeTo(int ageTo) {
        this.ageTo = ageTo;
    }
}
