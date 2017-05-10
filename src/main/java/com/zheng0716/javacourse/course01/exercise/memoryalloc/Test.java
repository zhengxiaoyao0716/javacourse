package com.zheng0716.javacourse.course01.exercise.memoryalloc;

/**
 * Created by zhengxiaoyao0716 on 2017/5/10.
 */
public class Test {
    public static void main(String args[]) {
        int[] s;
        s = new int[10];
        for (int i = 0; i < 10; i++) {
            s[i] = 2 * i + 1;
            System.out.println(s[i]);
        }
    }
}
