package com.start.myfreetime.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by w on 2017/3/31.
 */

public class MovieBean implements Serializable{


    /**
     * control : {"expires":1800}
     * status : 0
     * data : {"hasNext":true,"movies":[{"late":true,"cnms":31,"sn":436,"showDate":"","dur":115,"img":"http://p0.meituan.net/165.220/movie/7f32684e28253f39fe2002868a1f3c95373851.jpg","sc":9.1,"ver":"3D/IMAX 3D","rt":"本周二上映","nm":"末日崩塌","scm":"史无前例超级地震撕裂一切","imax":true,"snum":20129,"src":"美国","pn":74,"preSale":0,"vd":"","dir":"布拉德·佩顿","star":"巨石强森,等","cat":"剧情,动作,惊悚","wish":65386,"3d":true,"time":"","id":246363}]}
     */

    private ControlBean control;
    private int status;
    private DataBean data;

    public ControlBean getControl() {
        return control;
    }

    public void setControl(ControlBean control) {
        this.control = control;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class ControlBean {
        /**
         * expires : 1800
         */

        private int expires;

        public int getExpires() {
            return expires;
        }

        public void setExpires(int expires) {
            this.expires = expires;
        }
    }

    public class DataBean implements Serializable{
        /**
         * hasNext : true
         * movies : [{"late":true,"cnms":31,"sn":436,"showDate":"","dur":115,"img":"http://p0.meituan.net/165.220/movie/7f32684e28253f39fe2002868a1f3c95373851.jpg","sc":9.1,"ver":"3D/IMAX 3D","rt":"本周二上映","nm":"末日崩塌","scm":"史无前例超级地震撕裂一切","imax":true,"snum":20129,"src":"美国","pn":74,"preSale":0,"vd":"","dir":"布拉德·佩顿","star":"巨石强森,等","cat":"剧情,动作,惊悚","wish":65386,"3d":true,"time":"","id":246363}]
         */

        private boolean hasNext;
        private List<MoviesBean> movies;

        public boolean isHasNext() {
            return hasNext;
        }

        public void setHasNext(boolean hasNext) {
            this.hasNext = hasNext;
        }

        public List<MoviesBean> getMovies() {
            return movies;
        }

        public void setMovies(List<MoviesBean> movies) {
            this.movies = movies;
        }

        public  class MoviesBean implements Serializable{
            /**
             * late : true
             * cnms : 31
             * sn : 436
             * showDate :
             * dur : 115
             * img : http://p0.meituan.net/165.220/movie/7f32684e28253f39fe2002868a1f3c95373851.jpg
             * sc : 9.1
             * ver : 3D/IMAX 3D
             * rt : 本周二上映
             * nm : 末日崩塌
             * scm : 史无前例超级地震撕裂一切
             * imax : true
             * snum : 20129
             * src : 美国
             * pn : 74
             * preSale : 0
             * vd :
             * dir : 布拉德·佩顿
             * star : 巨石强森,等
             * cat : 剧情,动作,惊悚
             * wish : 65386
             * 3d : true
             * time :
             * id : 246363
             */

            private boolean late;
            private int cnms;
            private int sn;
            private String showDate;
            private int dur;
            private String img;
            private double sc;
            private String ver;
            private String rt;
            private String nm;
            private String scm;
            private boolean imax;
            private int snum;
            private String src;
            private int pn;
            private int preSale;
            private String vd;
            private String dir;
            private String star;
            private String cat;
            private int wish;
            @SerializedName("3d")
            private boolean _$3d;
            private String time;
            private int id;

            public boolean isLate() {
                return late;
            }

            public void setLate(boolean late) {
                this.late = late;
            }

            public int getCnms() {
                return cnms;
            }

            public void setCnms(int cnms) {
                this.cnms = cnms;
            }

            public int getSn() {
                return sn;
            }

            public void setSn(int sn) {
                this.sn = sn;
            }

            public String getShowDate() {
                return showDate;
            }

            public void setShowDate(String showDate) {
                this.showDate = showDate;
            }

            public int getDur() {
                return dur;
            }

            public void setDur(int dur) {
                this.dur = dur;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public double getSc() {
                return sc;
            }

            public void setSc(double sc) {
                this.sc = sc;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public String getScm() {
                return scm;
            }

            public void setScm(String scm) {
                this.scm = scm;
            }

            public boolean isImax() {
                return imax;
            }

            public void setImax(boolean imax) {
                this.imax = imax;
            }

            public int getSnum() {
                return snum;
            }

            public void setSnum(int snum) {
                this.snum = snum;
            }

            public String getSrc() {
                return src;
            }

            public void setSrc(String src) {
                this.src = src;
            }

            public int getPn() {
                return pn;
            }

            public void setPn(int pn) {
                this.pn = pn;
            }

            public int getPreSale() {
                return preSale;
            }

            public void setPreSale(int preSale) {
                this.preSale = preSale;
            }

            public String getVd() {
                return vd;
            }

            public void setVd(String vd) {
                this.vd = vd;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public String getCat() {
                return cat;
            }

            public void setCat(String cat) {
                this.cat = cat;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public boolean is_$3d() {
                return _$3d;
            }

            public void set_$3d(boolean _$3d) {
                this._$3d = _$3d;
            }

            public String getTime() {
                return time;
            }

            public void setTime(String time) {
                this.time = time;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }
        }
    }
}
