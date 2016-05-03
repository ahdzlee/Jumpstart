package com.eprize.recycler_model;

/**
 * Created by renato.antonino1 on 03/10/2015.
 */
public class Category {

    private String catName;
    private String content;
    private double price;

    private int icon;


    public Category(String catName, String content,  int icon) {
        this.catName = catName;
        this.content = content;
        this.price = price;
        this.icon = icon;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }
}
