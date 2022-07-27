package com.bridgelabz;

public class Hotel {
    String name;
    int weekDayRate;
    int weekEndRate;
    int ratings;
    public Hotel() {
    }

    public Hotel(String name, int weekDayRate,int weekEndRate, int ratings) {
        this.name = name;
        this.weekDayRate = weekDayRate;
        this.weekEndRate = weekEndRate;
        this.ratings = ratings;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", weekDayRate=" + weekDayRate +
                ", weekEndRate=" + weekEndRate +
                ", ratings=" + ratings +
                '}';
    }

    public int getRatings() {
        return ratings;
    }

    public void setRatings(int ratings) {
        this.ratings = ratings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeekDayRate() {
        return weekDayRate;
    }

    public void setWeekDayRate(int weekDayRate) {
        this.weekDayRate = weekDayRate;
    }

    public int getWeekEndRate() {
        return weekEndRate;
    }

    public void setWeekEndRate(int weekEndRate) {
        this.weekEndRate = weekEndRate;
    }
}
