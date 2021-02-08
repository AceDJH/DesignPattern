package com.djh.structural.proxy;

/**
 * @Author AceDJH
 * @Date 2021/2/8 9:45
 */
// 服务连接器的具体实现。该类的方法可以向腾讯视频请求信息。请求速度取决于
// 用户和腾讯视频的互联网连接情况。如果同时发送大量请求，即使所请求的信息
// 一模一样，程序的速度依然会减慢。
public class ThirdPartyTVClass implements ThirdPartyTVLib{
    @Override
    public Video listVideos() {
        System.out.println("向腾讯视频发送一个 API 请求。");
        return new Video(1, "向腾讯视频发送一个 API 请求。");
    }

    @Override
    public Video getVideoInfo(int id) {
        System.out.println("获取某个视频的元数据。");
        return new Video(2, "获取某个视频的元数据。");
    }

    @Override
    public void downloadVideo(int id) {
        System.out.println("从腾讯视频下载一个视频文件" + id);
    }
}
