package com.start.myfreetime.bean;

/**
 * Created by w on 2017/6/17.
 */

public class LocalCache {

    private static LocalCache instance;

    private int id;

    private LocalCache() {

    }

    public synchronized static LocalCache getInstance() {
        if (null == instance) {
            instance = new LocalCache();
        }
        return instance;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
