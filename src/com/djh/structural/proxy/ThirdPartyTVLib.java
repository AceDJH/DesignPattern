package com.djh.structural.proxy;

/**
 * @Author AceDJH
 * @Date 2021/2/8 9:44
 * https://refactoringguru.cn/design-patterns/proxy
 */
// 远程服务接口。
public interface ThirdPartyTVLib {
    Video listVideos();
    Video getVideoInfo(int id);
    void downloadVideo(int id);
}
