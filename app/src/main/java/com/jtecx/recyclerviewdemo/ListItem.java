package com.jtecx.recyclerviewdemo;


public class ListItem {
    public String title;
    public String subTitle;
    public int imageResid;
    public  boolean favourite = false;

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public boolean isFavourite() {
        return favourite;
    }

    public void setFavourite(boolean favourite) {
        this.favourite = favourite;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImageResid() {
        return imageResid;
    }

    public void setImageResid(int imageResid) {
        this.imageResid = imageResid;
    }
}
