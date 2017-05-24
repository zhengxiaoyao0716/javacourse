package com.zheng0716.javacourse.course02.question3.color;

import org.junit.Test;

/**
 * Created by zhengxiaoyao0716 on 2017/5/17.
 */
public class ColorTest {
    @Test
    public void testFill() {
        new RedColor().fill();
        new BlueColor().fill();
        new GreenColor().fill();
    }

    @Test
    public void testDraw() {
        new RedColor().draw();
        new BlueColor().draw();
        new GreenColor().draw();
    }
}