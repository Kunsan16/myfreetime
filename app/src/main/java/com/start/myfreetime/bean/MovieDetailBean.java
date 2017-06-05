package com.start.myfreetime.bean;

import java.util.List;

/**
 * Created by w on 2017/4/6.
 */

public class MovieDetailBean {


    /**
     * control : {"expires":3600}
     * status : 0
     * data : {"MovieDetailModel":{"cat":"剧情,爱情","dealsum":0,"dir":"张柏瑞 ","dra":"<p>故事发生在民国时代的福建晋江五店市，庄家陶瓷的继承人庄家树（王德顺 饰）和唱\u201c高甲戏\u201d少女吴彩凤（李纯 饰）发展了一段刻骨铭心的恋情，却阴差阳错分隔海角两地。多年后，老年庄家树携徒弟颜永晴从马来西亚回到晋江五店市，开启一段寻根之旅，途中泪点笑点并存，亲情爱情友情错综复杂。吴彩凤始终为爱坚守，庄家树却已另娶良人；吴彩凤与庄家树的孙女陈楠将与颜永晴展开怎样的爱情纠葛，默默守护陈楠的高丰将何去何从？吴彩凤与庄家树是否有情人终成眷？一段世纪之恋和当代跨国之恋，两段爱情又将走向何方？<\/p>","dur":107,"id":344268,"imax":false,"img":"http://p1.meituan.net/165.220/movie/346aae0dbf033f7ac5fcd2b4e82eb34385981.jpg","isShowing":true,"late":false,"mk":0,"nm":"海角有个五店市","photos":["http://p0.meituan.net/w.h/mmdb/1d646d08a7282467efe8434f52efecd610240.jpeg","http://p1.meituan.net/w.h/mmdb/098344c64c974b4c46888a9f4f57857420480.jpeg","http://p1.meituan.net/w.h/mmdb/50328b684e8d85a96b269b5fe7c01c0224576.jpeg","http://p0.meituan.net/w.h/mmdb/6752ed4d0107498eba5835001934db4418432.jpeg","http://p0.meituan.net/w.h/mmdb/3a8cd9d634ebec93003c294a44a74c5020480.jpeg","http://p1.meituan.net/w.h/mmdb/b0f241ebcf4bbb2cae582428868e746f20480.jpeg","http://p1.meituan.net/w.h/mmdb/5f98ede2d5a1afc78df4a3382b558fa120480.jpeg","http://p0.meituan.net/w.h/mmdb/c392aeeff30dbfe33a2ebdd787f92b0b14336.jpeg","http://p1.meituan.net/w.h/mmdb/55a1714310dba5c02156a29642281d1020480.jpeg","http://p1.meituan.net/w.h/mmdb/ff57ea96bcddde8158d60ac8b04b3e2f24576.jpeg","http://p1.meituan.net/w.h/mmdb/54b9f0d50a6f4679524d95e379b5e6dc14336.webp","http://p0.meituan.net/w.h/mmdb/cec05bdb4b1680a4395aba252a527fce6144.webp","http://p0.meituan.net/w.h/mmdb/b92505511fedd505a2dcd9f4d6b93b068192.webp","http://p0.meituan.net/w.h/mmdb/d12f5046ca813b04be22c418ba8b817310240.webp","http://p0.meituan.net/w.h/mmdb/ca777a7575563a1ba1e29a862519e7288192.jpeg","http://p1.meituan.net/w.h/movie/760ecdebe7d16432326597b8d6dd3af031662.jpg"],"pn":16,"preSale":0,"rt":"本周五上映","sc":0,"scm":"爱情跨世纪，笑泪永铭记","showSnum":false,"snum":40,"src":"中国大陆,台湾,马来西亚","star":"王德顺 李纯 班杰 徐明辉 金于宸 ","vd":"http://maoyan.meituan.net/movie/videos/854x480787a36d4d2184b4c95c554f4a9a583cf.mp4","ver":"2D","vnum":1,"wish":421,"wishst":0},"CommentResponseModel":{"cmts":[{"vipInfo":"","score":5,"nickName":"ZWb13799500470","userId":34979032,"nick":"ZWb137****0470","approve":0,"oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/622577dae989dfa2af065ba362be599323794.jpg","time":"2017-04-05 20:26","id":101736079,"content":"太好看了！光听名字就有看的冲动！"},{"vipInfo":"","score":5,"nickName":"阿祖","userId":129421553,"nick":"McW492608239","approve":0,"oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/9035fb1e9787e1ad46668368b55442c7149358.jpg","time":"2017-04-05 07:55","id":101677777,"content":"青岛也没有排片的"},{"vipInfo":"","score":5,"nickName":"CDf220270796","userId":110861640,"nick":"CDf220270796","approve":0,"oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/9ac14f349014833355426e42adbfd19128259.jpg","time":"2017-04-05 00:33","id":101672529,"content":"不会北京没有排片吧？"},{"vipInfo":"","score":5,"nickName":"imB581911040","userId":52837627,"nick":"imB581911040","approve":1,"oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/movie/__40465654__9539763.png","time":"2017-04-03 17:16","id":101486829,"content":"期待，泉州才是闽南文化的发源地"},{"vipInfo":"","score":4.5,"nickName":"朕好萌。。","userId":207803972,"nick":"朕好萌。。","approve":0,"oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/f18e83439aff0f0f23519c9e9e4da64a52355.jpg","time":"2017-04-03 12:06","id":101446236,"content":"泉州才是闽南文化发源地啊，喜欢"}],"hcmts":[],"total":13,"hasNext":true}}
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
         * expires : 3600
         */

        private int expires;

        public int getExpires() {
            return expires;
        }

        public void setExpires(int expires) {
            this.expires = expires;
        }
    }

    public static class DataBean {
        /**
         * MovieDetailModel : {"cat":"剧情,爱情","dealsum":0,"dir":"张柏瑞 ","dra":"<p>故事发生在民国时代的福建晋江五店市，庄家陶瓷的继承人庄家树（王德顺 饰）和唱\u201c高甲戏\u201d少女吴彩凤（李纯 饰）发展了一段刻骨铭心的恋情，却阴差阳错分隔海角两地。多年后，老年庄家树携徒弟颜永晴从马来西亚回到晋江五店市，开启一段寻根之旅，途中泪点笑点并存，亲情爱情友情错综复杂。吴彩凤始终为爱坚守，庄家树却已另娶良人；吴彩凤与庄家树的孙女陈楠将与颜永晴展开怎样的爱情纠葛，默默守护陈楠的高丰将何去何从？吴彩凤与庄家树是否有情人终成眷？一段世纪之恋和当代跨国之恋，两段爱情又将走向何方？<\/p>","dur":107,"id":344268,"imax":false,"img":"http://p1.meituan.net/165.220/movie/346aae0dbf033f7ac5fcd2b4e82eb34385981.jpg","isShowing":true,"late":false,"mk":0,"nm":"海角有个五店市","photos":["http://p0.meituan.net/w.h/mmdb/1d646d08a7282467efe8434f52efecd610240.jpeg","http://p1.meituan.net/w.h/mmdb/098344c64c974b4c46888a9f4f57857420480.jpeg","http://p1.meituan.net/w.h/mmdb/50328b684e8d85a96b269b5fe7c01c0224576.jpeg","http://p0.meituan.net/w.h/mmdb/6752ed4d0107498eba5835001934db4418432.jpeg","http://p0.meituan.net/w.h/mmdb/3a8cd9d634ebec93003c294a44a74c5020480.jpeg","http://p1.meituan.net/w.h/mmdb/b0f241ebcf4bbb2cae582428868e746f20480.jpeg","http://p1.meituan.net/w.h/mmdb/5f98ede2d5a1afc78df4a3382b558fa120480.jpeg","http://p0.meituan.net/w.h/mmdb/c392aeeff30dbfe33a2ebdd787f92b0b14336.jpeg","http://p1.meituan.net/w.h/mmdb/55a1714310dba5c02156a29642281d1020480.jpeg","http://p1.meituan.net/w.h/mmdb/ff57ea96bcddde8158d60ac8b04b3e2f24576.jpeg","http://p1.meituan.net/w.h/mmdb/54b9f0d50a6f4679524d95e379b5e6dc14336.webp","http://p0.meituan.net/w.h/mmdb/cec05bdb4b1680a4395aba252a527fce6144.webp","http://p0.meituan.net/w.h/mmdb/b92505511fedd505a2dcd9f4d6b93b068192.webp","http://p0.meituan.net/w.h/mmdb/d12f5046ca813b04be22c418ba8b817310240.webp","http://p0.meituan.net/w.h/mmdb/ca777a7575563a1ba1e29a862519e7288192.jpeg","http://p1.meituan.net/w.h/movie/760ecdebe7d16432326597b8d6dd3af031662.jpg"],"pn":16,"preSale":0,"rt":"本周五上映","sc":0,"scm":"爱情跨世纪，笑泪永铭记","showSnum":false,"snum":40,"src":"中国大陆,台湾,马来西亚","star":"王德顺 李纯 班杰 徐明辉 金于宸 ","vd":"http://maoyan.meituan.net/movie/videos/854x480787a36d4d2184b4c95c554f4a9a583cf.mp4","ver":"2D","vnum":1,"wish":421,"wishst":0}
         * CommentResponseModel : {"cmts":[{"vipInfo":"","score":5,"nickName":"ZWb13799500470","userId":34979032,"nick":"ZWb137****0470","approve":0,"oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/622577dae989dfa2af065ba362be599323794.jpg","time":"2017-04-05 20:26","id":101736079,"content":"太好看了！光听名字就有看的冲动！"},{"vipInfo":"","score":5,"nickName":"阿祖","userId":129421553,"nick":"McW492608239","approve":0,"oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/9035fb1e9787e1ad46668368b55442c7149358.jpg","time":"2017-04-05 07:55","id":101677777,"content":"青岛也没有排片的"},{"vipInfo":"","score":5,"nickName":"CDf220270796","userId":110861640,"nick":"CDf220270796","approve":0,"oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/9ac14f349014833355426e42adbfd19128259.jpg","time":"2017-04-05 00:33","id":101672529,"content":"不会北京没有排片吧？"},{"vipInfo":"","score":5,"nickName":"imB581911040","userId":52837627,"nick":"imB581911040","approve":1,"oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/movie/__40465654__9539763.png","time":"2017-04-03 17:16","id":101486829,"content":"期待，泉州才是闽南文化的发源地"},{"vipInfo":"","score":4.5,"nickName":"朕好萌。。","userId":207803972,"nick":"朕好萌。。","approve":0,"oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/f18e83439aff0f0f23519c9e9e4da64a52355.jpg","time":"2017-04-03 12:06","id":101446236,"content":"泉州才是闽南文化发源地啊，喜欢"}],"hcmts":[],"total":13,"hasNext":true}
         */

        private MovieDetailModelBean MovieDetailModel;
        private CommentResponseModelBean CommentResponseModel;

        public MovieDetailModelBean getMovieDetailModel() {
            return MovieDetailModel;
        }

        public void setMovieDetailModel(MovieDetailModelBean MovieDetailModel) {
            this.MovieDetailModel = MovieDetailModel;
        }

        public CommentResponseModelBean getCommentResponseModel() {
            return CommentResponseModel;
        }

        public void setCommentResponseModel(CommentResponseModelBean CommentResponseModel) {
            this.CommentResponseModel = CommentResponseModel;
        }

        public static class MovieDetailModelBean {
            /**
             * cat : 剧情,爱情
             * dealsum : 0
             * dir : 张柏瑞
             * dra : <p>故事发生在民国时代的福建晋江五店市，庄家陶瓷的继承人庄家树（王德顺 饰）和唱“高甲戏”少女吴彩凤（李纯 饰）发展了一段刻骨铭心的恋情，却阴差阳错分隔海角两地。多年后，老年庄家树携徒弟颜永晴从马来西亚回到晋江五店市，开启一段寻根之旅，途中泪点笑点并存，亲情爱情友情错综复杂。吴彩凤始终为爱坚守，庄家树却已另娶良人；吴彩凤与庄家树的孙女陈楠将与颜永晴展开怎样的爱情纠葛，默默守护陈楠的高丰将何去何从？吴彩凤与庄家树是否有情人终成眷？一段世纪之恋和当代跨国之恋，两段爱情又将走向何方？</p>
             * dur : 107
             * id : 344268
             * imax : false
             * img : http://p1.meituan.net/165.220/movie/346aae0dbf033f7ac5fcd2b4e82eb34385981.jpg
             * isShowing : true
             * late : false
             * mk : 0
             * nm : 海角有个五店市
             * photos : ["http://p0.meituan.net/w.h/mmdb/1d646d08a7282467efe8434f52efecd610240.jpeg","http://p1.meituan.net/w.h/mmdb/098344c64c974b4c46888a9f4f57857420480.jpeg","http://p1.meituan.net/w.h/mmdb/50328b684e8d85a96b269b5fe7c01c0224576.jpeg","http://p0.meituan.net/w.h/mmdb/6752ed4d0107498eba5835001934db4418432.jpeg","http://p0.meituan.net/w.h/mmdb/3a8cd9d634ebec93003c294a44a74c5020480.jpeg","http://p1.meituan.net/w.h/mmdb/b0f241ebcf4bbb2cae582428868e746f20480.jpeg","http://p1.meituan.net/w.h/mmdb/5f98ede2d5a1afc78df4a3382b558fa120480.jpeg","http://p0.meituan.net/w.h/mmdb/c392aeeff30dbfe33a2ebdd787f92b0b14336.jpeg","http://p1.meituan.net/w.h/mmdb/55a1714310dba5c02156a29642281d1020480.jpeg","http://p1.meituan.net/w.h/mmdb/ff57ea96bcddde8158d60ac8b04b3e2f24576.jpeg","http://p1.meituan.net/w.h/mmdb/54b9f0d50a6f4679524d95e379b5e6dc14336.webp","http://p0.meituan.net/w.h/mmdb/cec05bdb4b1680a4395aba252a527fce6144.webp","http://p0.meituan.net/w.h/mmdb/b92505511fedd505a2dcd9f4d6b93b068192.webp","http://p0.meituan.net/w.h/mmdb/d12f5046ca813b04be22c418ba8b817310240.webp","http://p0.meituan.net/w.h/mmdb/ca777a7575563a1ba1e29a862519e7288192.jpeg","http://p1.meituan.net/w.h/movie/760ecdebe7d16432326597b8d6dd3af031662.jpg"]
             * pn : 16
             * preSale : 0
             * rt : 本周五上映
             * sc : 0
             * scm : 爱情跨世纪，笑泪永铭记
             * showSnum : false
             * snum : 40
             * src : 中国大陆,台湾,马来西亚
             * star : 王德顺 李纯 班杰 徐明辉 金于宸
             * vd : http://maoyan.meituan.net/movie/videos/854x480787a36d4d2184b4c95c554f4a9a583cf.mp4
             * ver : 2D
             * vnum : 1
             * wish : 421
             * wishst : 0
             */

            private String cat;
            private int dealsum;
            private String dir;
            private String dra;
            private int dur;
            private int id;
            private boolean imax;
            private String img;
            private boolean isShowing;
            private boolean late;
            private int mk;
            private String nm;
            private int pn;
            private int preSale;
            private String rt;
            private double sc;
            private String scm;
            private boolean showSnum;
            private int snum;
            private String src;
            private String star;
            private String vd;
            private String ver;
            private int vnum;
            private int wish;
            private int wishst;
            private List<String> photos;

            public String getCat() {
                return cat;
            }

            public void setCat(String cat) {
                this.cat = cat;
            }

            public int getDealsum() {
                return dealsum;
            }

            public void setDealsum(int dealsum) {
                this.dealsum = dealsum;
            }

            public String getDir() {
                return dir;
            }

            public void setDir(String dir) {
                this.dir = dir;
            }

            public String getDra() {
                return dra;
            }

            public void setDra(String dra) {
                this.dra = dra;
            }

            public int getDur() {
                return dur;
            }

            public void setDur(int dur) {
                this.dur = dur;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public boolean isImax() {
                return imax;
            }

            public void setImax(boolean imax) {
                this.imax = imax;
            }

            public String getImg() {
                return img;
            }

            public void setImg(String img) {
                this.img = img;
            }

            public boolean isIsShowing() {
                return isShowing;
            }

            public void setIsShowing(boolean isShowing) {
                this.isShowing = isShowing;
            }

            public boolean isLate() {
                return late;
            }

            public void setLate(boolean late) {
                this.late = late;
            }

            public int getMk() {
                return mk;
            }

            public void setMk(int mk) {
                this.mk = mk;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
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

            public String getRt() {
                return rt;
            }

            public void setRt(String rt) {
                this.rt = rt;
            }

            public double getSc() {
                return sc;
            }

            public void setSc(double sc) {
                this.sc = sc;
            }

            public String getScm() {
                return scm;
            }

            public void setScm(String scm) {
                this.scm = scm;
            }

            public boolean isShowSnum() {
                return showSnum;
            }

            public void setShowSnum(boolean showSnum) {
                this.showSnum = showSnum;
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

            public String getStar() {
                return star;
            }

            public void setStar(String star) {
                this.star = star;
            }

            public String getVd() {
                return vd;
            }

            public void setVd(String vd) {
                this.vd = vd;
            }

            public String getVer() {
                return ver;
            }

            public void setVer(String ver) {
                this.ver = ver;
            }

            public int getVnum() {
                return vnum;
            }

            public void setVnum(int vnum) {
                this.vnum = vnum;
            }

            public int getWish() {
                return wish;
            }

            public void setWish(int wish) {
                this.wish = wish;
            }

            public int getWishst() {
                return wishst;
            }

            public void setWishst(int wishst) {
                this.wishst = wishst;
            }

            public List<String> getPhotos() {
                return photos;
            }

            public void setPhotos(List<String> photos) {
                this.photos = photos;
            }
        }

        public static class CommentResponseModelBean {
            /**
             * cmts : [{"vipInfo":"","score":5,"nickName":"ZWb13799500470","userId":34979032,"nick":"ZWb137****0470","approve":0,"oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/622577dae989dfa2af065ba362be599323794.jpg","time":"2017-04-05 20:26","id":101736079,"content":"太好看了！光听名字就有看的冲动！"},{"vipInfo":"","score":5,"nickName":"阿祖","userId":129421553,"nick":"McW492608239","approve":0,"oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/9035fb1e9787e1ad46668368b55442c7149358.jpg","time":"2017-04-05 07:55","id":101677777,"content":"青岛也没有排片的"},{"vipInfo":"","score":5,"nickName":"CDf220270796","userId":110861640,"nick":"CDf220270796","approve":0,"oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/9ac14f349014833355426e42adbfd19128259.jpg","time":"2017-04-05 00:33","id":101672529,"content":"不会北京没有排片吧？"},{"vipInfo":"","score":5,"nickName":"imB581911040","userId":52837627,"nick":"imB581911040","approve":1,"oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/movie/__40465654__9539763.png","time":"2017-04-03 17:16","id":101486829,"content":"期待，泉州才是闽南文化的发源地"},{"vipInfo":"","score":4.5,"nickName":"朕好萌。。","userId":207803972,"nick":"朕好萌。。","approve":0,"oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/f18e83439aff0f0f23519c9e9e4da64a52355.jpg","time":"2017-04-03 12:06","id":101446236,"content":"泉州才是闽南文化发源地啊，喜欢"}]
             * hcmts : []
             * total : 13
             * hasNext : true
             */

            private int total;
            private boolean hasNext;
            private List<CmtsBean> cmts;
            private List<?> hcmts;

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public boolean isHasNext() {
                return hasNext;
            }

            public void setHasNext(boolean hasNext) {
                this.hasNext = hasNext;
            }

            public List<CmtsBean> getCmts() {
                return cmts;
            }

            public void setCmts(List<CmtsBean> cmts) {
                this.cmts = cmts;
            }

            public List<?> getHcmts() {
                return hcmts;
            }

            public void setHcmts(List<?> hcmts) {
                this.hcmts = hcmts;
            }

            public static class CmtsBean {
                /**
                 * vipInfo :
                 * score : 5
                 * nickName : ZWb13799500470
                 * userId : 34979032
                 * nick : ZWb137****0470
                 * approve : 0
                 * oppose : 0
                 * reply : 0
                 * avatarurl : https://img.meituan.net/avatar/622577dae989dfa2af065ba362be599323794.jpg
                 * time : 2017-04-05 20:26
                 * id : 101736079
                 * content : 太好看了！光听名字就有看的冲动！
                 */

                private String vipInfo;
                private double score;
                private String nickName;
                private int userId;
                private String nick;
                private int approve;
                private int oppose;
                private int reply;
                private String avatarurl;
                private String time;
                private int id;
                private String content;

                public String getVipInfo() {
                    return vipInfo;
                }

                public void setVipInfo(String vipInfo) {
                    this.vipInfo = vipInfo;
                }

                public double getScore() {
                    return score;
                }

                public void setScore(int score) {
                    this.score = score;
                }

                public String getNickName() {
                    return nickName;
                }

                public void setNickName(String nickName) {
                    this.nickName = nickName;
                }

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public String getNick() {
                    return nick;
                }

                public void setNick(String nick) {
                    this.nick = nick;
                }

                public int getApprove() {
                    return approve;
                }

                public void setApprove(int approve) {
                    this.approve = approve;
                }

                public int getOppose() {
                    return oppose;
                }

                public void setOppose(int oppose) {
                    this.oppose = oppose;
                }

                public int getReply() {
                    return reply;
                }

                public void setReply(int reply) {
                    this.reply = reply;
                }

                public String getAvatarurl() {
                    return avatarurl;
                }

                public void setAvatarurl(String avatarurl) {
                    this.avatarurl = avatarurl;
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

                public String getContent() {
                    return content;
                }

                public void setContent(String content) {
                    this.content = content;
                }
            }
        }
    }
}
