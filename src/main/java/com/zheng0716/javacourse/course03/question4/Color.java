package com.zheng0716.javacourse.course03.question4;

import java.util.Arrays;

/**
 * 色彩
 * Created by zhengxiaoyao0716 on 2017/5/10.
 */
public abstract class Color {
    private int rgb;

    public Color(int rgb) {
        this.rgb = rgb;
    }

    public int getRgb() {
        return rgb;
    }

    public void setRgb(int rgb) {
        this.rgb = rgb;
    }

    public int getRed() {
        return rgb >> 16;
    }

    public void setRed(int red) {
        this.rgb = rgb & 0x00ffff + red << 16;
    }

    public int getGreen() {
        return (rgb & 0x00ff00) >> 8;
    }

    public void setGreen(int green) {
        this.rgb = rgb & 0xff00ff + green << 8;
    }

    public int getBlue() {
        return rgb & 0x0000ff;
    }

    public void setBlue(int blue) {
        this.rgb = rgb & 0xffff00 + blue;
    }

    private int getY(int r, int g, int b) {
        return (r * 1224 + g * 2404 + b * 467) >> 12;
    }

    public int getY() {
        return getY(getRed(), getGreen(), getBlue());
    }

    private int getU(int r, int g, int b) {
        return (int) (-0.147 * r - 0.289 * g + 0.436 * b);
    }

    public int getU() {
        return getY(getRed(), getGreen(), getBlue());
    }

    private int getV(int r, int g, int b) {
        return (int) (0.615 * r - 0.515 * g - 0.100 * b);
    }

    public int getV() {
        return getY(getRed(), getGreen(), getBlue());
    }

    public int[] toYUV() {
        int r = getRed(), g = getGreen(), b = getBlue();
        return new int[]{getY(r, g, b), getU(r, g, b), getV(r, g, b)};
    }

    @Override
    public String toString() {
        return "Color{" +
                "rgb=" + String.format("#%06X", rgb) +
                ", yuv=" + Arrays.toString(toYUV()) +
                '}';
    }

    public abstract void draw();
    public static interface Filler {
        void fill();
    }
}
