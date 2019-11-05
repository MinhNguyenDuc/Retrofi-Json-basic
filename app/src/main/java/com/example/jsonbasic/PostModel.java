package com.example.jsonbasic;

public class PostModel {
    private String date;
    private TitleModel title;
    private Excerpt excerpt;
    private ImageModel better_featureed_image;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public TitleModel getTitle() {
        return title;
    }

    public void setTitle(TitleModel title) {
        this.title = title;
    }

    public Excerpt getExcerpt() {
        return excerpt;
    }

    public void setExcerpt(Excerpt excerpt) {
        this.excerpt = excerpt;
    }

    public ImageModel getBetter_featureed_image() {
        return better_featureed_image;
    }

    public void setBetter_featureed_image(ImageModel better_featureed_image) {
        this.better_featureed_image = better_featureed_image;
    }
}
