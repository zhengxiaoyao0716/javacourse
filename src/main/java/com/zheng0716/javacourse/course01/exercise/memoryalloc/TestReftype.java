package com.zheng0716.javacourse.course01.exercise.memoryalloc;

/**
 * Created by zhengxiaoyao0716 on 2017/5/10.
 */
public class TestReftype {
    public static void main(String args[]) {
        MyDate[] m;
        m = new MyDate[10];
        for (int i = 0; i < 10; i++) {
            m[i] = new MyDate(i + 1
                    , i + 1, 1990 + i);
            m[i].display();
        }
    }
}
