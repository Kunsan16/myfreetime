/*
 * Copyright 2017 lizhaotailang
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.start.myfreetime.bean;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.List;

/**
 * Created by Lizhaotailang on 2016/8/20.
 */

public class ZhihuDailyNews {


    /**
     * date : 20170407
     * stories : [{"images":["https://pic3.zhimg.com/v2-3f0e7f96a18f0e93cbcfb2e7df55930a.jpg"],"type":0,"id":9343497,"ga_prefix":"040722","title":"小事 · 说出来你可能不信"},{"images":["https://pic2.zhimg.com/v2-18af6590804bdf2dd2eceb3360d0cd5d.jpg"],"type":0,"id":9339655,"ga_prefix":"040721","title":"拍那么多霸道总裁玛丽苏，却难拍好平平淡淡的生活"},{"title":"行走在都柏林，旅途就像一场电影","ga_prefix":"040720","images":["https://pic4.zhimg.com/v2-b31f3fece269b542be5e6dc8afe22f83.jpg"],"multipic":true,"type":0,"id":9342947},{"images":["https://pic1.zhimg.com/v2-1fba0217fe23ec1ccef58bb8afcf2f68.jpg"],"type":0,"id":9342629,"ga_prefix":"040719","title":"为正在憋论文的你送来正确阅读文献的方法"},{"images":["https://pic2.zhimg.com/v2-e51c5d2011e6e66e489a4a00a16547e9.jpg"],"type":0,"id":9342828,"ga_prefix":"040718","title":"- 冥王星这一圈怎么红红的？\r\n- 八成是被撞的"},{"images":["https://pic3.zhimg.com/v2-d90961c1c4ab6f488c3bba6af756390a.jpg"],"type":0,"id":9342887,"ga_prefix":"040717","title":"汉代时候怎么可能有炒菜呢，编剧你的鸡腿没了"},{"images":["https://pic3.zhimg.com/v2-f5ce3e3ed78c38a3c4e10043d4f58406.jpg"],"type":0,"id":9342986,"ga_prefix":"040716","title":"没有黄易，「玄幻」「穿越」「网络小说」会大不一样"},{"title":"科幻电影里，这些设计都已经变成了常客","ga_prefix":"040715","images":["https://pic3.zhimg.com/v2-33ffca2af426f0703f44a440f09d30be.jpg"],"multipic":true,"type":0,"id":9342833},{"images":["https://pic3.zhimg.com/v2-4b415157778cbb44e8f26e8716b391fe.jpg"],"type":0,"id":9342863,"ga_prefix":"040715","title":"媲美前作，《荒野之息》是人类能做出来的最好的游戏之一"},{"title":"意面中间的小白芯，就像是「西瓜最中间那一口」","ga_prefix":"040713","images":["https://pic3.zhimg.com/v2-42e7c28a3673a2e733b62bca24186d56.jpg"],"multipic":true,"type":0,"id":9337803},{"images":["https://pic2.zhimg.com/v2-332b60c1ec2ecbfd6b68bb84f68bfc2d.jpg"],"type":0,"id":9342398,"ga_prefix":"040712","title":"大误 · 丧心病狂，唐僧肉到底该怎么吃？"},{"images":["https://pic2.zhimg.com/v2-96b62d39ab1c644b97a4b34a1d1be8f9.jpg"],"type":0,"id":9340188,"ga_prefix":"040711","title":"用科学来解释「一夜白头」，其实是这么回事"},{"images":["https://pic1.zhimg.com/v2-70052b77d28b4406898db59a69105964.jpg"],"type":0,"id":9341354,"ga_prefix":"040710","title":"什么样的老师才是好老师？"},{"images":["https://pic2.zhimg.com/v2-c66392e788b4fb101229cf3b2abb6071.jpg"],"type":0,"id":9341571,"ga_prefix":"040709","title":"买房合同都签了，房主又要涨价，你有 3 种办法"},{"images":["https://pic3.zhimg.com/v2-f273c04e244b43a592b632596bffb9fa.jpg"],"type":0,"id":9341357,"ga_prefix":"040708","title":"技术进步真的会减少岗位数量吗？"},{"images":["https://pic3.zhimg.com/v2-1ab80f77b7636ad5622628c50628381a.jpg"],"type":0,"id":9340511,"ga_prefix":"040707","title":"有了这份手册，完全不会日语也能在日本点菜"},{"images":["https://pic1.zhimg.com/v2-0b9a275633035bfbd9a8d8bf7fdc7864.jpg"],"type":0,"id":9340652,"ga_prefix":"040707","title":"特斯拉和谷歌搞自动驾驶，传统车企当然不会坐以待毙"},{"title":"《三体 3》入围的雨果奖，跟很多熟悉的电影美剧都有关系","ga_prefix":"040707","images":["https://pic4.zhimg.com/v2-4ab5de5c76cef87bb2dee4ce2a32aa33.jpg"],"multipic":true,"type":0,"id":9340644},{"images":["https://pic3.zhimg.com/v2-5c1d6baee92afd490672df88be385fd6.jpg"],"type":0,"id":9339802,"ga_prefix":"040706","title":"瞎扯 · 如何正确地吐槽"}]
     * top_stories : [{"Image":"https://pic4.zhimg.com/v2-fda51dbec567d07ceb46b81bc2d1ae13.jpg","type":0,"id":9342986,"ga_prefix":"040716","title":"没有黄易，「玄幻」「穿越」「网络小说」会大不一样"},{"Image":"https://pi c3.zhimg.com/v2-c9d320564207ff5df10e9e944cff00ce.jpg","type":0,"id":9342863,"ga_prefix":"040715","title":"媲美前作，《荒野之息》是人类能做出来的最好的游戏之一"},{"Image":"https://pic3.zhimg.com/v2-43172adf4d6a931ec0cf0e045c95bb0e.jpg","type":0,"id":9341354,"ga_prefix":"040710","title":"什么样的老师才是好老师？"},{"Image":"https://pic3.zhimg.com/v2-048b0f11937d50d380cf4e7263120a8a.jpg","type":0,"id":9340511,"ga_prefix":"040707","title":"有了这份手册，完全不会日语也能在日本点菜"},{"Image":"https://pic2.zhimg.com/v2-8a77b3b20b5e92c574821b32dab6f7e5.jpg","type":0,"id":9340644,"ga_prefix":"040707","title":"《三体 3》入围的雨果奖，跟很多熟悉的电影美剧都有关系"}]
     */

    private String date;
    private List<StoriesBean> stories;
    private List<TopStoriesBean> top_stories;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<StoriesBean> getStories() {
        return stories;
    }

    public void setStories(List<StoriesBean> stories) {
        this.stories = stories;
    }

    public List<TopStoriesBean> getTop_stories() {
        return top_stories;
    }

    public void setTop_stories(List<TopStoriesBean> top_stories) {
        this.top_stories = top_stories;
    }

    public static class StoriesBean implements Parcelable {
        /**
         * images : ["https://pic3.zhimg.com/v2-3f0e7f96a18f0e93cbcfb2e7df55930a.jpg"]
         * type : 0
         * id : 9343497
         * ga_prefix : 040722
         * title : 小事 · 说出来你可能不信
         * multipic : true
         */

        private int type;
        private int id;
        private String ga_prefix;
        private String title;
        private boolean multipic;
        private List<String> images;

        protected StoriesBean(Parcel in) {
            type = in.readInt();
            id = in.readInt();
            ga_prefix = in.readString();
            title = in.readString();
            multipic = in.readByte() != 0;
            images = in.createStringArrayList();
        }

        public static final Creator<StoriesBean> CREATOR = new Creator<StoriesBean>() {
            @Override
            public StoriesBean createFromParcel(Parcel in) {
                return new StoriesBean(in);
            }

            @Override
            public StoriesBean[] newArray(int size) {
                return new StoriesBean[size];
            }
        };

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

        public boolean isMultipic() {
            return multipic;
        }

        public void setMultipic(boolean multipic) {
            this.multipic = multipic;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(type);
            parcel.writeInt(id);
            parcel.writeString(ga_prefix);
            parcel.writeString(title);
            parcel.writeByte((byte) (multipic ? 1 : 0));
            parcel.writeStringList(images);
        }
    }

    public static class TopStoriesBean implements Parcelable{
        /**
         * Image : https://pic4.zhimg.com/v2-fda51dbec567d07ceb46b81bc2d1ae13.jpg
         * type : 0
         * id : 9342986
         * ga_prefix : 040716
         * title : 没有黄易，「玄幻」「穿越」「网络小说」会大不一样
         */

        private String image;
        private int type;
        private int id;
        private String ga_prefix;
        private String title;

        protected TopStoriesBean(Parcel in) {
            image = in.readString();
            type = in.readInt();
            id = in.readInt();
            ga_prefix = in.readString();
            title = in.readString();
        }

        public static final Creator<TopStoriesBean> CREATOR = new Creator<TopStoriesBean>() {
            @Override
            public TopStoriesBean createFromParcel(Parcel in) {
                return new TopStoriesBean(in);
            }

            @Override
            public TopStoriesBean[] newArray(int size) {
                return new TopStoriesBean[size];
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
}
