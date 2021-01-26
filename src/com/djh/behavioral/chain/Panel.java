package com.djh.behavioral.chain;

/**
 * @Author AceDJH
 * @Date 2021/1/26 9:50
 */
public class Panel extends Container{
    private String modalHelpText;

    public String getModalHelpText() {
        return modalHelpText;
    }

    public Panel setModalHelpText(String modalHelpText) {
        this.modalHelpText = modalHelpText;
        return this;
    }

    @Override
    public void showHelp() {
        if (modalHelpText != null){
            System.out.println("Panel显示包含帮助文字的模态窗口" + modalHelpText);
        }else {
            super.showHelp();
        }
    }
}
