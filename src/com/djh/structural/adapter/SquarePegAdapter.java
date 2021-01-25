package com.djh.structural.adapter;

/**
 * @Author AceDJH
 * @Date 2021/1/25 11:23
 */
// 适配器类让你能够将方钉放入圆孔中。它会对 RoundPeg 类进行扩展，以接收适
// 配器对象作为圆钉。
public class SquarePegAdapter extends RoundPeg{
    // 在实际情况中，适配器中会包含一个 SquarePeg 类的实例。
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    // 适配器会假扮为一个圆钉，
    // 其半径刚好能与适配器实际封装的方钉搭配起来。
    @Override
    public int getRadius() {
        return (int) (peg.getWidth() * Math.sqrt(2) / 2);
    }
}
