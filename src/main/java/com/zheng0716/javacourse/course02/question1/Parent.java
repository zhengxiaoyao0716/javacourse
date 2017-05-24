package com.zheng0716.javacourse.course02.question1;

/**
 * Created by zhengxiaoyao0716 on 2017/5/17.
 */
public class Parent {
    public void accessField(Object from, Object obj, String key, String value) {
        System.out.print("\t从" + from + "获取" + obj + "中的" + key + "字段：" + value);
    }
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
