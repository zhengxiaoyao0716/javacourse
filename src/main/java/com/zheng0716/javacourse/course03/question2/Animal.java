package com.zheng0716.javacourse.course03.question2;

/**
 * Created by zhengxiaoyao0716 on 2017/5/24.
 */
public abstract class Animal {
    public abstract void eat();
    public abstract void say();

    public static interface Runner {
        void run();
    }
    public static interface Swimmer {
        void swim();
    }
    public static interface Singer {
        void sign();
    }
    public static interface Fighter {
        void fight();
    }
}
