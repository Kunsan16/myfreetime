package com.start.myfreetime.bean;

import java.util.ArrayList;

/**
 * Created by w on 2017/5/20.
 */

public class LocationParam {

    private static volatile LocationParam locationParam=null;

    private LocationParam(){

    }

    public static LocationParam getInstance() {
        if (null == locationParam) {
            synchronized (LocationParam.class) {
                if (null == locationParam) {
                    locationParam = new LocationParam();
                }
            }
        }
        return locationParam;
    }

    private int loc_x;

    private int loc_y;

    private ArrayList<MovieBean.DataBean.MoviesBean> list;

    public int getLoc_x() {
        return loc_x;
    }

    public void setLoc_x(int loc_x) {
        this.loc_x = loc_x;
    }

    public int getLoc_y() {
        return loc_y;
    }

    public void setLoc_y(int loc_y) {
        this.loc_y = loc_y;
    }

    public ArrayList<MovieBean.DataBean.MoviesBean> getList() {
        return list;
    }

    public void setList(ArrayList<MovieBean.DataBean.MoviesBean> list) {
        this.list = list;
    }
}
