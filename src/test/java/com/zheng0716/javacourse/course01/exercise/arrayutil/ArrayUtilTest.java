package com.zheng0716.javacourse.course01.exercise.arrayutil;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by zhengxiaoyao0716 on 2017/5/10.
 */
public class ArrayUtilTest {
    @Test
    public void copy() throws Exception {
        //源数组
        int src[] = {1, 2, 3, 4, 5, 6};
        // 目的数组
        int dst[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        // 复制源数组中从下标0开始的source.length个元素到
        // 目的数组，从下标0的位置开始存储。
        System.arraycopy(src, 0, dst, 0, src.length);
        System.out.println(Arrays.toString(dst));
    }

}