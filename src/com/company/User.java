package com.company;

public class User {
    String name;
    int tries = 0;
    int TotalPoints;

    public User(String name, int tries, int totalPoints) {
        this.name = name;
        this.tries = tries;
        TotalPoints = totalPoints;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTries() {
        return tries;
    }

    public void setTries(int tries) {
        this.tries = tries;
    }

    public int getTotalPoints() {
        return TotalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        TotalPoints = totalPoints;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", tries=" + tries +
                ", TotalPoints=" + TotalPoints +
                '}';
    }
}
