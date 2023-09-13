package com.example.aditinews;

public class IndianPojo {
    private String title;
    private int images;

    public IndianPojo(String title, int images) {
        this.title = title;
        this.images = images;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImages() {
        return images;
    }

    public void setImages(int images) {
        this.images = images;
    }
}
