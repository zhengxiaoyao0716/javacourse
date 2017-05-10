package com.zheng0716.javacourse.course01.exercise.memoryalloc;

/**
 * Created by zhengxiaoyao0716 on 2017/5/10.
 */
public class BirthDate {
    private int day;
    private int month;
    private int year;

    public BirthDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "BirthDate{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
