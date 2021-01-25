package com.djh.structural.adapter;

/**
 * @Author AceDJH
 * @Date 2021/1/25 10:44
 * https://refactoringguru.cn/design-patterns/adapter
 */
public class AdapterClient {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        System.out.println(roundHole.fits(roundPeg));

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(10);
        // roundHole.fits(smallSquarePeg); 类型不一样，无法编译

        SquarePegAdapter smallAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeAdapter = new SquarePegAdapter(largeSquarePeg);
        System.out.println(roundHole.fits(smallAdapter));
        System.out.println(roundHole.fits(largeAdapter));
    }
}
