package com.djh.creational.factory;

/**
 * @Author AceDJH
 * @Date 2021/2/13 15:23
 */
public class WebDialog extends Dialog{
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
