package com.djh.creational.factory;

/**
 * @Author AceDJH
 * @Date 2021/2/13 15:21
 */
public class HTMLButton implements Button{
    @Override
    public void render() {
        System.out.println("返回一个按钮的 HTML 表述。");
    }

    @Override
    public void onClick() {
        System.out.println("绑定网络浏览器的点击事件。");
    }
}
