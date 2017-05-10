package com.zheng0716.javacourse.course01.exercise.memoryalloc;

/**
 * Created by zhengxiaoyao0716 on 2017/5/10.
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int d, int m, int y) {
        day = d;
        month = m;
        year = y;
    }

    public void display() {
        System.out.println(day + "-" + month + "-" + year);
    }
}
