package com.example.hukumunpad;

public class MyModel {
    private String title;
    private String urlImage;

    public MyModel(String title, String urlImage) {
        this.title = title;
        this.urlImage = urlImage;
    }

    public MyModel() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
