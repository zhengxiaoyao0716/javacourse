package com.zheng0716.javacourse.course03.question1;

/**
 * Created by zhengxiaoyao0716 on 2017/5/24.
 */
public class Child extends Parent {
//    @Override
//    public final void finalFunc() {}

    public static final Child INSTANCE = new Child();

//    public static final Child INSTANCE ;
//    static { INSTANCE = new Child(); }

    public final String finalStr;
    public Child() {
        finalStr = "finalStr";
//        finalStr = "finalStr2";

        final int finalInt = 0;
//        finalInt = 1;
    }
}
