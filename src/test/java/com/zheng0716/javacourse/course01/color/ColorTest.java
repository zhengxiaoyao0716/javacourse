package com.zheng0716.javacourse.course01.color;

import org.junit.Test;

/**
 * Created by zhengxiaoyao0716 on 2017/5/10.
 */
public class ColorTest {
    @Test
    public void test() {
        System.out.println(new RedColor());
        System.out.println(new BlueColor());
        System.out.println(new GreenColor());

        Color c = new Color(0xffffff);
        System.out.println(c);
        c.setRed(0);
        c.setBlue(0);
        c.setGreen(0);
        System.out.println(c);
    }
}