package com.example.article_cards;

public class Article {
    private int image;
    private String name;
    private String title;

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public Article(int image, String name, String title) {
        this.image = image;
        this.name = name;
        this.title = title;
    }
}
