package com.djh.structural.adapter;

/**
 * @Author AceDJH
 * @Date 2021/1/25 10:43
 */
public class RoundPeg {
    private int radius;

    public RoundPeg() {
    }

    public RoundPeg(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public RoundPeg setRadius(int radius) {
        this.radius = radius;
        return this;
    }
}
