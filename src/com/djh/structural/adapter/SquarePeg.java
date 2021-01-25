package com.djh.structural.adapter;

/**
 * @Author AceDJH
 * @Date 2021/1/25 10:49
 * 一个不兼容的类：方钉（SquarePeg）
 */
public class SquarePeg {
    private int width;

    public SquarePeg(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public SquarePeg setWidth(int width) {
        this.width = width;
        return this;
    }
}
