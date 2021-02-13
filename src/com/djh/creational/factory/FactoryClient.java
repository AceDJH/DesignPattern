package com.djh.creational.factory;

/**
 * @Author AceDJH
 * @Date 2021/2/13 15:24
 */
public class FactoryClient {
    public Dialog dialog;

    public void initialize() throws Exception {
        // 用来模拟当前环境
        String os = "Windows";
        if (os.equals("Windows")){
            dialog = new WindowsDialog();
        }else if (os.equals("Web")){
            dialog = new WebDialog();
        }else {
            throw new Exception("错误，未知系统");
        }
    }

    public static void main(String[] args) {
        FactoryClient client = new FactoryClient();
        try {
            client.initialize();
        } catch (Exception e) {
            e.printStackTrace();
        }
        client.dialog.render();
    }
}
