package com.djh.structural.proxy;

/**
 * @Author AceDJH
 * @Date 2021/2/8 10:25
 * https://refactoringguru.cn/design-patterns/proxy
 */
// 程序可在运行时对代理进行配置。
public class ProxyClient {
    public static void main(String[] args) {
        new ProxyClient().init();
    }
    public void init(){
        ThirdPartyTVClass atvService = new ThirdPartyTVClass();
        CachedTVClass atvProxy = new CachedTVClass(atvService);
        TVManager tvManager = new TVManager(atvProxy);
        tvManager.reactOnUserInput();
    }
}
