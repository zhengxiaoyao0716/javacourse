package com.zheng0716.javacourse.course03.question2;

/**
 * Created by zhengxiaoyao0716 on 2017/5/24.
 */
public class Person extends Animal implements Animal.Fighter, Animal.Runner, Animal.Singer, Animal.Swimmer {
    @Override
    public void eat() {
        System.out.println("eat");
    }

    @Override
    public void say() {
        System.out.println("say");
    }

    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public void swim() {
        System.out.println("swim");
    }

    @Override
    public void sign() {
        System.out.println("sign");
    }

    @Override
    public void fight() {
        System.out.println("fight");
    }
}
