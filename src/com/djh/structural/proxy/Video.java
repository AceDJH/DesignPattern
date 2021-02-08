package com.djh.structural.proxy;

/**
 * @Author AceDJH
 * @Date 2021/2/8 10:12
 */
public class Video {
    private int id;
    private String name;

    public Video(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Video setName(String name) {
        this.name = name;
        return this;
    }
}
