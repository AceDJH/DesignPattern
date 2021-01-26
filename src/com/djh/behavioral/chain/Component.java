package com.djh.behavioral.chain;

/**
 * @Author AceDJH
 * @Date 2021/1/25 11:58
 */
// 简单组件的基础类。
public abstract class Component implements ComponentWithContextualHelp{
    private String tooltipText;
    // 组件容器在处理者链中作为“下一个”链接。
    // container相当于是链表中的next
    protected Container container;

    public String getTooltipText() {
        return tooltipText;
    }

    public Component setTooltipText(String tooltipText) {
        this.tooltipText = tooltipText;
        return this;
    }

    @Override
    public void showHelp() {
        if (tooltipText != null){
            System.out.println("Component显示提示信息" + tooltipText);
        }else {
            container.showHelp();
        }
    }
}
