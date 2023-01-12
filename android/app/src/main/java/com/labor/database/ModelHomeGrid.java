package com.labor.database;

import android.graphics.drawable.Drawable;

import java.io.Serializable;

public class ModelHomeGrid implements Serializable {
    private String name ="";
    private int id =0;
    private Drawable imageIcon = null;

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

    public Drawable getImageIcon() {
        return imageIcon;
    }

    public void setImageIcon(Drawable imageIcon) {
        this.imageIcon = imageIcon;
    }
}
