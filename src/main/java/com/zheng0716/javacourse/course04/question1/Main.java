package com.zheng0716.javacourse.course04.question1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by zhengxiaoyao0716 on 2017/6/18.
 */
public class Main {
    private final Frame frame;
    private GridBagLayout layout = new GridBagLayout();
    private GridBagConstraints constraints = new GridBagConstraints();

    private Main() {
        frame = new Frame();
        frame.setLayout(layout);
        frame.setLocationRelativeTo(null);
        constraints.weighty = 1;
        showSignIn();
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
    }

    private void addGrid(Component component) {
        addGrid(component, GridBagConstraints.REMAINDER);
    }
    private void addGrid(Component component, int width) {
        constraints.gridwidth = width;
        layout.setConstraints(component, constraints);
        frame.add(component);
    }
    
    private void showSignIn() {
        frame.removeAll();
        frame.setTitle("用户登录");
        frame.setSize(320,240);

        addGrid(new Panel());

        Panel namePanel = new Panel();
        namePanel.add(new Label("用户名："));
        namePanel.add(new TextField(20));
        addGrid(namePanel);

        Panel passwordPanel = new Panel();
        passwordPanel.add(new Label("密　码："));
        passwordPanel.add(new TextField(20));
        addGrid(passwordPanel);

        constraints.weightx = 1;
        addGrid(new Button("Ok"), 1);
        addGrid(new Button("Cancel"), 1);
        Button registerButton = new Button("Register");
        addGrid(registerButton);
        constraints.weightx = 0;

        registerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showSignUp();
            }
        });
    }

    private void showSignUp() {
        frame.removeAll();
        frame.setTitle("用户注册");
        frame.setSize(250,300);

        addGrid(new Label("员工注册", Label.CENTER));

        addGrid(new Label("姓名："),1 );
        addGrid(new TextField(10));

        addGrid(new Label("年龄："), 1);
        Choice ageChoice = new Choice();
        addGrid(ageChoice);
        for (int i = 18; i <= 60; i++) {
            ageChoice.add(String.valueOf(i));
        }

        addGrid(new Label("性别："), 1);
        addGrid(new JRadioButton("女"), 1);
        addGrid(new JRadioButton("男"));

        addGrid(new Label("邮箱："), 1);
        addGrid(new TextField(10));

        addGrid(new Label("爱好："), 1);
        addGrid(new Checkbox("玩"), 1);
        addGrid(new Checkbox("吃"));

        Button okButton = new Button("确定");
        addGrid(okButton, 2);
        addGrid(new Button("取消"));


        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showSignIn();
            }
        });

    }

    public static void main(String[] args) {
        new Main();
    }
}
