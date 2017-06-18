package com.zheng0716.javacourse.course04.question2;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by zhengxiaoyao0716 on 2017/6/18.
 */
public class Main {
    private final Frame frame;

    public Main() {
        frame = new Frame();
        frame.setLayout(new FlowLayout());
        frame.setLocationRelativeTo(null);
        frame.setTitle("绘图实例");
        frame.setSize(320,240);
        frame.setVisible(true);

        Color color = new RedColor();
        color.setPreferredSize(new Dimension(320, 240));
        frame.add(color);
        color.fill(Color.RECT, 20, 20, 70, 70);
        color.draw(Color.OVAL, 10, 10, 90, 90);
        color.fill(Color.OVAL, 120, 20, 70, 70);
        color.draw(Color.RECT, 110, 10, 90, 90);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }
    public static void main(String[] args) {
        new Main();
    }
}
