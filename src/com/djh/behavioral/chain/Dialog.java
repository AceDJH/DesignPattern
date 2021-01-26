package com.djh.behavioral.chain;

/**
 * @Author AceDJH
 * @Date 2021/1/26 9:52
 */
public class Dialog extends Container{
    private String wikiPageUrl;

    public String getWikiPageUrl() {
        return wikiPageUrl;
    }

    public Dialog setWikiPageUrl(String wikiPageUrl) {
        this.wikiPageUrl = wikiPageUrl;
        return this;
    }

    @Override
    public void showHelp() {
        if (wikiPageUrl != null){
            System.out.println("Dialog打开百科帮助页面" + wikiPageUrl);
        }else {
            super.showHelp();
        }
    }
}
