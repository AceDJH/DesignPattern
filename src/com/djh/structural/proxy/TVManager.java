package com.djh.structural.proxy;

/**
 * @Author AceDJH
 * @Date 2021/2/8 10:20
 */
// 之前直接与服务对象交互的 GUI 类不需要改变，前提是它仅通过接口与服务对
// 象交互。我们可以安全地传递一个代理对象来代替真实服务对象，因为它们都实
// 现了相同的接口。
public class TVManager {
    protected ThirdPartyTVLib service;

    public TVManager(ThirdPartyTVLib service) {
        this.service = service;
    }

    public void renderVideoPage(int id){
        Video videoInfo = service.getVideoInfo(id);
        System.out.println("渲染视频页面。");
    }

    public void renderListPanel(){
        Video video = service.listVideos();
        System.out.println("渲染视频缩略图列表。");
    }

    public void reactOnUserInput(){
        renderVideoPage(3);
        renderListPanel();
    }
}
