package com.djh.structural.adapter;

/**
 * @Author AceDJH
 * @Date 2021/1/25 10:43
 * 假设有两个接口相互兼容的类：圆孔（Round­Hole）和圆钉（Round­Peg）。
 */
public class RoundHole {
    private int radius;

    public RoundHole(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public RoundHole setRadius(int radius) {
        this.radius = radius;
        return this;
    }

    public boolean fits(RoundPeg peg){
        return this.getRadius() >= peg.getRadius();
    }
}
