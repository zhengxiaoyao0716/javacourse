package com.zheng0716.javacourse.course03.question3;

/**
 * 题目3： 编写代码，画出每条语句执行后，堆栈的内存分布图。
 * Created by zhengxiaoyao0716 on 2017/5/24.
 */
public class A {
    private int s = 111;
    public class B {
        private int s = 222;
        public void mb(int s) {
            System.out.println(s); // 局部变量s
            System.out.println(this.s); // 内部类对象的属性s
            System.out.println(A.this.s); //  外层类对象属性s
        }
    }
    public static void main(String args[]){
        A a = new A();
        A.B b = a.new B();
        b.mb(333);
    }
}
