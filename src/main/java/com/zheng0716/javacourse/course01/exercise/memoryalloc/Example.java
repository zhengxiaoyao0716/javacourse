package com.zheng0716.javacourse.course01.exercise.memoryalloc;

/**
 * Example
 * Created by zhengxiaoyao0716 on 2017/5/10.
 */
public class Example {
    public static void main(String args[]) {
        Example ex = new Example();
        int date = 9;
        BirthDate d1 = new BirthDate(7, 7, 1970);
        BirthDate d2 = new BirthDate(1, 1, 2000);
        ex.change1(date);
        ex.change2(d1);
        ex.change3(d2);
        System.out.println("date=" + date);
        d1.display();
        d2.display();
    }

    public void change1(int i) {
        i = 1234;
    }

    public void change2(BirthDate b) {
        b = new BirthDate(22, 2, 2004);
    }

    public void change3(BirthDate b) {
        b.setDay(22);
    }
}
