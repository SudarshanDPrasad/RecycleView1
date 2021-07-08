package com.example.idenditycard;

public class Identity {
    private String name;
    private int image;
    private String age;
    private String profession;

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public String getAge() {
        return age;
    }

    public String getProfession() {
        return profession;
    }

    public Identity(String name, int image, String age, String profession) {
        this.name = name;
        this.image = image;
        this.age = age;
        this.profession = profession;
    }
}
