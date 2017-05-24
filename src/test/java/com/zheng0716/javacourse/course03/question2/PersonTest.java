package com.zheng0716.javacourse.course03.question2;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by zhengxiaoyao0716 on 2017/5/24.
 */
public class PersonTest {
    @Test
    public void test() {
        Person person = new Person();
        ((Animal) person).eat();
        ((Animal) person).say();
        ((Animal.Fighter) person).fight();
        ((Animal.Runner) person).run();
        ((Animal.Singer) person).sign();
        ((Animal.Swimmer) person).swim();
    }
}