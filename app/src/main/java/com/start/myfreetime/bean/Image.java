package com.start.myfreetime.bean;

import io.realm.RealmModel;
import io.realm.annotations.RealmClass;

/**
 * Created by w on 2017/5/1.
 */
@RealmClass
public class Image implements RealmModel{

    private String images;

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }
}
