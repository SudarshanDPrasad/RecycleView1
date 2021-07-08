package com.example.name_recycler;

import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Animal {
private int image;
private String name;
private String sound;
private String type;

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getSound() {
        return sound;
    }

    public String getType() {
        return type;
    }

    public Animal(int image, String name, String sound, String type) {
        this.image = image;
        this.name = name;
        this.sound = sound;
        this.type = type;
    }
}
