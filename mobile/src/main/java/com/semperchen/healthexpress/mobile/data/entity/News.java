package com.semperchen.healthexpress.mobile.data.entity;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * <p></p>
 * <p/>
 * <p>Project HealthExpress.</p>
 * <p>Date 2015/8/29.</p>
 *
 * @author SemperChen
 * @version 1.0-SNAPSHOT
 */
public class News  implements Serializable{
    private int id;
    @SerializedName("username")
    private String name;
    @SerializedName("imageUrl")
    private String url;
    @SerializedName("desc")
    private String desc;

    private NewsData newsData;

    public NewsData getNewsData() {
        return newsData;
    }

    public void setNewsData(NewsData newsData) {
        this.newsData = newsData;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
