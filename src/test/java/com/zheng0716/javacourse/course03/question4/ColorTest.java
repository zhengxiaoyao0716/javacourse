package com.zheng0716.javacourse.course03.question4;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhengxiaoyao0716 on 2017/5/24.
 */
public class ColorTest {
    @Test
    public void test() {
        Color.Filler filler = new RedColor();
        filler.fill();
        
        Color color = new BlueColor();
        color.draw();
    }
}