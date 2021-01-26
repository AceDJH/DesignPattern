package com.djh.behavioral.chain;

/**
 * @Author AceDJH
 * @Date 2021/1/26 9:53
 */
public class ChainClient {
    public static void main(String[] args) {
        Dialog dialog = new Dialog();
        dialog.setWikiPageUrl("http://...");
        Panel panel = new Panel();
        panel.setModalHelpText("本面板用于...");
        Button ok = new Button();
        ok.setTooltipText("这是一个确认按钮");
        Button cancel = new Button();
        Panel panelNull = new Panel();

        panel.add(ok);
        panel.add(cancel);
        dialog.add(panel);

        dialog.showHelp();
        panel.showHelp();
        ok.showHelp();
        cancel.showHelp();

        dialog.add(panelNull);
        panelNull.add(cancel);
        cancel.showHelp();
    }
}
