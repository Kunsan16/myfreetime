package com.start.myfreetime.bean;

import java.util.List;

/**
 * Created by w on 2017/6/17.
 */

public class MovieCommentBean {


    /**
     * control : {"expires":300}
     * status : 0
     * data : {"CommentResponseModel":{"total":13095,"cmts":[{"userId":283297876,"score":5,"vipInfo":"","nickName":"原来，笑着哭最痛","time":"2017-06-17 10:51","nick":"原来，笑着哭最痛","oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/7eb53917ab85845c023623fde20632037291.jpg","approve":0,"id":109816997,"content":"一如既往的情节，影片最后还是一样的埋下伏笔。真的感觉永不会完结影迷对未知世界的渴望。"},{"userId":125340971,"score":5,"vipInfo":"","nickName":"TheBeautifulSky","time":"2017-06-17 10:51","nick":"TheBeautifulSky","oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/movie/__40465654__9539763.png","approve":0,"id":109816847,"content":"场面宏大，寄生体与宿主的不断斗争，非常好看。"},{"userId":229027178,"score":5,"vipInfo":"","nickName":"朋朋","time":"2017-06-17 10:51","nick":"lyp198457","oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/a060635afa3da94a1c68b4043443200f34943.jpg","approve":0,"id":109816973,"content":"普罗米修斯后续，结合异形，还不错"},{"userId":73462595,"score":4,"vipInfo":"","nickName":"徐逗逗～","time":"2017-06-17 10:50","nick":"徐逗逗～","oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/cc1005686f0fed9daa1fb0426e1097d414958.jpg","approve":0,"id":109816957,"content":"挺不错的。虽然剧情有点繁琐，但一直是异形的粉丝，特效也很棒！！"},{"userId":97774060,"score":0.5,"vipInfo":"","nickName":"aiT245531404","time":"2017-06-17 10:50","nick":"aiT245531404","oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/movie/__40465654__9539763.png","approve":0,"id":109816946,"content":"看这片之前去看看异形 这片口口声声谁是普罗米修斯的后续 其实就是抄的异形 \n目前来讲 异形这个系列已经拍不出什么新意了"}]},"hasNext":true,"movieid":78888,"offset":5,"limit":5}
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
         * expires : 300
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
         * CommentResponseModel : {"total":13095,"cmts":[{"userId":283297876,"score":5,"vipInfo":"","nickName":"原来，笑着哭最痛","time":"2017-06-17 10:51","nick":"原来，笑着哭最痛","oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/7eb53917ab85845c023623fde20632037291.jpg","approve":0,"id":109816997,"content":"一如既往的情节，影片最后还是一样的埋下伏笔。真的感觉永不会完结影迷对未知世界的渴望。"},{"userId":125340971,"score":5,"vipInfo":"","nickName":"TheBeautifulSky","time":"2017-06-17 10:51","nick":"TheBeautifulSky","oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/movie/__40465654__9539763.png","approve":0,"id":109816847,"content":"场面宏大，寄生体与宿主的不断斗争，非常好看。"},{"userId":229027178,"score":5,"vipInfo":"","nickName":"朋朋","time":"2017-06-17 10:51","nick":"lyp198457","oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/a060635afa3da94a1c68b4043443200f34943.jpg","approve":0,"id":109816973,"content":"普罗米修斯后续，结合异形，还不错"},{"userId":73462595,"score":4,"vipInfo":"","nickName":"徐逗逗～","time":"2017-06-17 10:50","nick":"徐逗逗～","oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/cc1005686f0fed9daa1fb0426e1097d414958.jpg","approve":0,"id":109816957,"content":"挺不错的。虽然剧情有点繁琐，但一直是异形的粉丝，特效也很棒！！"},{"userId":97774060,"score":0.5,"vipInfo":"","nickName":"aiT245531404","time":"2017-06-17 10:50","nick":"aiT245531404","oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/movie/__40465654__9539763.png","approve":0,"id":109816946,"content":"看这片之前去看看异形 这片口口声声谁是普罗米修斯的后续 其实就是抄的异形 \n目前来讲 异形这个系列已经拍不出什么新意了"}]}
         * hasNext : true
         * movieid : 78888
         * offset : 5
         * limit : 5
         */

        private CommentResponseModelBean CommentResponseModel;
        private boolean hasNext;
        private int movieid;
        private int offset;
        private int limit;

        public CommentResponseModelBean getCommentResponseModel() {
            return CommentResponseModel;
        }

        public void setCommentResponseModel(CommentResponseModelBean CommentResponseModel) {
            this.CommentResponseModel = CommentResponseModel;
        }

        public boolean isHasNext() {
            return hasNext;
        }

        public void setHasNext(boolean hasNext) {
            this.hasNext = hasNext;
        }

        public int getMovieid() {
            return movieid;
        }

        public void setMovieid(int movieid) {
            this.movieid = movieid;
        }

        public int getOffset() {
            return offset;
        }

        public void setOffset(int offset) {
            this.offset = offset;
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }

        public static class CommentResponseModelBean {
            /**
             * total : 13095
             * cmts : [{"userId":283297876,"score":5,"vipInfo":"","nickName":"原来，笑着哭最痛","time":"2017-06-17 10:51","nick":"原来，笑着哭最痛","oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/7eb53917ab85845c023623fde20632037291.jpg","approve":0,"id":109816997,"content":"一如既往的情节，影片最后还是一样的埋下伏笔。真的感觉永不会完结影迷对未知世界的渴望。"},{"userId":125340971,"score":5,"vipInfo":"","nickName":"TheBeautifulSky","time":"2017-06-17 10:51","nick":"TheBeautifulSky","oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/movie/__40465654__9539763.png","approve":0,"id":109816847,"content":"场面宏大，寄生体与宿主的不断斗争，非常好看。"},{"userId":229027178,"score":5,"vipInfo":"","nickName":"朋朋","time":"2017-06-17 10:51","nick":"lyp198457","oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/a060635afa3da94a1c68b4043443200f34943.jpg","approve":0,"id":109816973,"content":"普罗米修斯后续，结合异形，还不错"},{"userId":73462595,"score":4,"vipInfo":"","nickName":"徐逗逗～","time":"2017-06-17 10:50","nick":"徐逗逗～","oppose":0,"reply":0,"avatarurl":"https://img.meituan.net/avatar/cc1005686f0fed9daa1fb0426e1097d414958.jpg","approve":0,"id":109816957,"content":"挺不错的。虽然剧情有点繁琐，但一直是异形的粉丝，特效也很棒！！"},{"userId":97774060,"score":0.5,"vipInfo":"","nickName":"aiT245531404","time":"2017-06-17 10:50","nick":"aiT245531404","oppose":0,"reply":0,"avatarurl":"http://p0.meituan.net/movie/__40465654__9539763.png","approve":0,"id":109816946,"content":"看这片之前去看看异形 这片口口声声谁是普罗米修斯的后续 其实就是抄的异形 \n目前来讲 异形这个系列已经拍不出什么新意了"}]
             */

            private int total;
            private List<CmtsBean> cmts;

            public int getTotal() {
                return total;
            }

            public void setTotal(int total) {
                this.total = total;
            }

            public List<CmtsBean> getCmts() {
                return cmts;
            }

            public void setCmts(List<CmtsBean> cmts) {
                this.cmts = cmts;
            }

            public static class CmtsBean {
                /**
                 * userId : 283297876
                 * score : 5.0
                 * vipInfo :
                 * nickName : 原来，笑着哭最痛
                 * time : 2017-06-17 10:51
                 * nick : 原来，笑着哭最痛
                 * oppose : 0
                 * reply : 0
                 * avatarurl : https://img.meituan.net/avatar/7eb53917ab85845c023623fde20632037291.jpg
                 * approve : 0
                 * id : 109816997
                 * content : 一如既往的情节，影片最后还是一样的埋下伏笔。真的感觉永不会完结影迷对未知世界的渴望。
                 */

                private int userId;
                private double score;
                private String vipInfo;
                private String nickName;
                private String time;
                private String nick;
                private int oppose;
                private int reply;
                private String avatarurl;
                private int approve;
                private int id;
                private String content;

                public int getUserId() {
                    return userId;
                }

                public void setUserId(int userId) {
                    this.userId = userId;
                }

                public double getScore() {
                    return score;
                }

                public void setScore(double score) {
                    this.score = score;
                }

                public String getVipInfo() {
                    return vipInfo;
                }

                public void setVipInfo(String vipInfo) {
                    this.vipInfo = vipInfo;
                }

                public String getNickName() {
                    return nickName;
                }

                public void setNickName(String nickName) {
                    this.nickName = nickName;
                }

                public String getTime() {
                    return time;
                }

                public void setTime(String time) {
                    this.time = time;
                }

                public String getNick() {
                    return nick;
                }

                public void setNick(String nick) {
                    this.nick = nick;
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

                public int getApprove() {
                    return approve;
                }

                public void setApprove(int approve) {
                    this.approve = approve;
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
