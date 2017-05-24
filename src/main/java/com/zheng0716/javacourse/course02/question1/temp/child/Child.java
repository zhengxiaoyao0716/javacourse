package com.zheng0716.javacourse.course02.question1.temp.child;

import com.zheng0716.javacourse.course02.question1.temp.Temp;

/**
 * Created by zhengxiaoyao0716 on 2017/5/17.
 */
public class Child extends Temp {
    public void accessField(Temp obj, String key) {
        String value = null;
        switch (key) {
            case "privateValue":
//                value = super.privateValue; // 编译器无法通过
                break;
            case "defaultValue":
//                value = super.defaultValue;
                break;
            case "protectedValue":
                value = super.protectedValue;
                break;
            case "publicValue":
                value = obj.publicValue;
                break;
        }
        super.accessField(this, obj, key, value);
    }
}
