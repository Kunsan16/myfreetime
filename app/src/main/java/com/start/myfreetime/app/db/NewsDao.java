package com.start.myfreetime.app.db;

import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.orhanobut.logger.Logger;
import com.start.myfreetime.bean.Question;
import com.start.myfreetime.bean.TopStoriesBean;
import com.start.myfreetime.bean.ZhihuDailyStory;
import com.start.myfreetime.bean.ZhihuNewsRemarkBean;

import java.util.HashMap;
import java.util.List;

import io.realm.Realm;
import io.realm.RealmResults;

/**
 * Created by w on 2017/4/28.
 */
//realm.where(TestUser.class)
//可跟查询条件
//.or()                      或者
//.beginsWith()              以xxx开头
//.endsWith()                以xxx结尾
//.greaterThan()             大于
//.greaterThanOrEqualTo()    大于或等于
//.lessThan()                小于
//.lessThanOrEqualTo()       小于或等于
//.equalTo()                 等于
//.notEqualTo()              不等于
//.findAll()                 查询所有
//.average()                 平均值
//.beginGroup()              开始分组
//.endGroup()                结束分组
//.between()                 在a和b之间
//.contains()                包含xxx
//.count()                   统计数量
//.distinct()                去除重复
//.findFirst()               返回结果集的第一行记录
//.isNotEmpty()              非空串
//.isEmpty()                 为空串
//.isNotNull()               非空对象
//.isNull()                  为空对象
//.max()                     最大值
//.maximumDate()             最大日期
//.min()                     最小值
//.minimumDate()             最小日期
//.sum()                     求和
public class NewsDao extends BaseDao {

    private Realm realm;

    public NewsDao(Realm realm) {
        super(realm);
        this.realm = realm;
    }


    /**
     * 保存每条日报
     */
    public boolean addOneNews(final int id, final String img, final String title){
        boolean isExist=false;
        try{
        //在数据库中创建一个对象，主键默认0
            final Question question=new Question();
            question.setTitle(title);
            question.setImages(img);
            question.setId(id);
            question.setContent("");

            realm.executeTransaction(new Realm.Transaction() {
                                            @Override
                            public void execute(Realm realm) {
                               realm.copyToRealmOrUpdate(question);

                            }
                        });

        isExist=true;

        }catch (Exception e){
            e.printStackTrace();
            realm.cancelTransaction();
        }
      return isExist;
    }

    /**
     * 保存顶部新闻
     */
    public boolean addOneTopStories(final String title, final String img ){
        boolean isExist=false;
        try{
            final TopStoriesBean storiesBean=new TopStoriesBean();
            storiesBean.setTitle(title);
            storiesBean.setImage(img);
            realm.executeTransaction(new Realm.Transaction() {
             @Override
            public void execute(Realm realm) {

            realm.copyToRealmOrUpdate(storiesBean);
            Logger.i("知乎日报顶部封面添加缓存",title+": "+img);
                                         }
            });
            isExist=true;
        }catch (Exception e){
            e.printStackTrace();
            realm.cancelTransaction();
        }
        return isExist;
    }

    /**
     * 条件查询
     *
     * @return 返回结果集合
     */
    public boolean addToOrDeleteByNewsId(final int id, final String title, final String cover) {
        final boolean[] isExistId = {false};

                final RealmResults<ZhihuNewsRemarkBean> list = realm.where(ZhihuNewsRemarkBean.class).equalTo("id", id).findAll();
                if (list.size() > 0) {
                    for (ZhihuNewsRemarkBean question : list) {
                        Log.i("查询日报ID存在", question.getId() + "");
                        if (question.getId() == id) {
                            realm.executeTransaction(new Realm.Transaction() {
                                @Override
                                public void execute(Realm realm) {
                                    list.deleteAllFromRealm();

                                }
                            });

                            isExistId[0] =true;
                        }
                    }
                } else {
                    final ZhihuNewsRemarkBean bean=new ZhihuNewsRemarkBean();
                    bean.setId(id);
                    bean.setTitle(title);
                    bean.setCoverUrl(cover);
                    realm.executeTransaction(new Realm.Transaction() {
                        @Override
                        public void execute(Realm realm) {

                            realm.copyToRealmOrUpdate(bean);

                        }
                    });
                    Log.i("查询日报ID不存在", id + "");
                    isExistId[0] =false;
                }
        return isExistId[0];
    }

    /**
     * 根据id发起内容详情请求
     */
     public boolean ifNeedGetContent(int id){
         
         boolean isNeed = false;
         List<Question> idList= realm.where(Question.class).findAll();
         for (Question story:idList) {

             if (id == story.getId() && "".equals(story.getContent())) {
                 Log.d("有ID，无Contetn","true");
                 isNeed= true;
             }
             if (id == story.getId() && !TextUtils.isEmpty(story.getContent())) {
                 Log.d("有ID，有Contetn","false");
                 isNeed= false;
             }
         }
         return isNeed;
     }

    /**
     * 内容详情加入数据库
     */
     public boolean addOneContent(int id,String body){

         boolean isExist=false;
         try{
             //在数据库中创建一个对象，主键默认0
             final ZhihuDailyStory storyBody=new ZhihuDailyStory();
             storyBody.setBody(body);
             storyBody.setId(id);

             realm.executeTransaction(new Realm.Transaction() {
                 @Override
                 public void execute(Realm realm) {
                     realm.copyToRealmOrUpdate(storyBody);

                 }
             });
             isExist=true;

         }catch (Exception e){
             e.printStackTrace();
             realm.cancelTransaction();
         }
         return isExist;
     }


}
