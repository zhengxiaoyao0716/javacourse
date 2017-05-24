package com.zheng0716.javacourse.course02.question1.temp;

import com.zheng0716.javacourse.course02.question1.Parent;

/**
 * Created by zhengxiaoyao0716 on 2017/5/17.
 */
public class Brother extends Parent {
    public void accessField(Temp obj, String key) {
        String value = null;
        switch (key) {
            case "privateValue":
//                value = obj.privateValue; // 编译器无法通过
                break;
            case "defaultValue":
                value = obj.defaultValue;
                break;
            case "protectedValue":
                value = obj.protectedValue;
                break;
            case "publicValue":
                value = obj.publicValue;
                break;
        }
        super.accessField(this, obj, key, value);
    }
}
