package com.zheng0716.javacourse.course03.question4;

/**
 * Created by zhengxiaoyao0716 on 2017/5/10.
 */
public class GreenColor extends Color implements Color.Filler {
    public GreenColor() {
        super(0x00ff00);
    }

    @Override
    public void draw() {
        System.out.println("draw: " + this);
    }

    @Override
    public void fill() {
        System.out.println("fill: " + this);
    }
}
