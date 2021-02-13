package com.djh.creational.factory;

/**
 * @Author AceDJH
 * @Date 2021/2/13 15:10
 */
// 产品接口中将声明所有具体产品都必须实现的操作。
public interface Button {
    void render();
    void onClick();
}
