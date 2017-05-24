package com.zheng0716.javacourse.course02.question1.temp;

import com.zheng0716.javacourse.course02.question1.Parent;

/**
 * Created by zhengxiaoyao0716 on 2017/5/17.
 */
public class Temp extends Parent {
    public String publicValue;
    protected String protectedValue;
    String defaultValue;
    private String privateValue;

    public Temp() {
        this.privateValue = "PRI_VALUE";
        this.defaultValue = "DEF_VALUE";
        this.protectedValue = "PRO_VALUE";
        this.publicValue = "PUB_VALUE";
    }

    public void accessField(Object obj, String key) {
        String value = null;
        switch (key) {
            case "privateValue":
                value = this.privateValue;
                break;
            case "defaultValue":
                value = this.defaultValue;
                break;
            case "protectedValue":
                value = this.protectedValue;
                break;
            case "publicValue":
                value = this.publicValue;
                break;
        }
        super.accessField(this, obj, key, value);
    }
}
