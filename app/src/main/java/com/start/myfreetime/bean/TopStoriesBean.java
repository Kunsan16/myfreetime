package com.start.myfreetime.bean;

import android.os.Parcel;
import android.os.Parcelable;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by w on 2017/4/13.
 */

public class TopStoriesBean extends RealmObject implements Parcelable  {


    private String image;
    private int type;
    @PrimaryKey
    private int id;
    private String ga_prefix;
    private String title;


    public static final Parcelable.Creator<ZhihuDailyNews.TopStoriesBean> CREATOR = new Parcelable.Creator<ZhihuDailyNews.TopStoriesBean>() {
        @Override
        public ZhihuDailyNews.TopStoriesBean createFromParcel(Parcel in) {
            return new ZhihuDailyNews.TopStoriesBean(in);
        }

        @Override
        public ZhihuDailyNews.TopStoriesBean[] newArray(int size) {
            return new ZhihuDailyNews.TopStoriesBean[size];
        }
    };

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGa_prefix() {
        return ga_prefix;
    }

    public void setGa_prefix(String ga_prefix) {
        this.ga_prefix = ga_prefix;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(image);
        parcel.writeInt(type);
        parcel.writeInt(id);
        parcel.writeString(ga_prefix);
        parcel.writeString(title);

}
}
