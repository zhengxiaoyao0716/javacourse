package com.zheng0716.javacourse.course02.question1;

import com.zheng0716.javacourse.course02.question1.temp.Brother;
import com.zheng0716.javacourse.course02.question1.temp.Temp;
import com.zheng0716.javacourse.course02.question1.temp.child.Child;

/**
 * 修饰符校验.
 * Created by zhengxiaoyao0716 on 2017/5/17.
 */
public class Main {
    public static final void main(String[] args) {
        new Check();
    }

    public static class Check extends Parent {
        private Temp temp;
        private Brother brother;
        private Child child;
        public Check() {
            temp = new Temp();
            brother = new Brother();
            child = new Child();
            checkFiled("privateValue");
            checkFiled("defaultValue");
            checkFiled("protectedValue");
            checkFiled("publicValue");
        }

        void checkFiled(String key) {
            System.out.println("[" + key + "]");
            temp.accessField(temp, key);
            brother.accessField(temp, key);
            child.accessField(temp, key);
            this.accessField(temp, key);
            System.out.println();
        }
        public void accessField(Temp obj, String key) {
            String value = null;
            switch (key) {
                case "privateValue":
//                value = obj.privateValue; // 编译器无法通过
                    break;
                case "defaultValue":
//                    value = obj.defaultValue;
                    break;
                case "protectedValue":
//                    value = obj.protectedValue;
                    break;
                case "publicValue":
                    value = obj.publicValue;
                    break;
            }
            super.accessField(this, obj, key, value);
        }
    }
}
