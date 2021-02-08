package com.djh.structural.proxy;

/**
 * @Author AceDJH
 * @Date 2021/2/8 9:47
 */
// 为了节省网络带宽，我们可以将请求结果缓存下来并保存一段时间。但你可能无
// 法直接将这些代码放入服务类中。比如该类可能是第三方程序库的一部分或其签
// 名是`final（最终）`。因此我们会在一个实现了服务类接口的新代理类中放入
// 缓存代码。当代理类接收到真实请求后，才会将其委派给服务对象。
public class CachedTVClass implements ThirdPartyTVLib{
    private  ThirdPartyTVLib service;
    private Video listCache, videoCache;
    private boolean needReset;

    public CachedTVClass(ThirdPartyTVLib service) {
        this.service = service;
    }

    @Override
    public Video listVideos() {
        if (listCache == null || needReset){
            listCache = service.listVideos();
        }
        return listCache;
    }

    @Override
    public Video getVideoInfo(int id) {
        if (videoCache == null || needReset){
            videoCache = service.getVideoInfo(id);
        }
        return videoCache;
    }

    @Override
    public void downloadVideo(int id) {
        // 此处还需一个判断是否已下载的函数
        if (needReset){
            service.downloadVideo(id);
        }
    }
}
