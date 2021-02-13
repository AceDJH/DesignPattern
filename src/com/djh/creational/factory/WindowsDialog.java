package com.djh.creational.factory;

/**
 * @Author AceDJH
 * @Date 2021/2/13 15:14
 */
public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
