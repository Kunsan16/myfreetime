package com.start.myfreetime.bean;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by w on 2017/6/17.
 */

public class MovieCinemalBean {


    /**
     * control : {"expires":43200}
     * status : 0
     * data : {"Gulou":[{"addr":"Gulou八一七北路192号","brd":"大众电影院","dis":"道山路口","deal":0,"distance":0,"preferential":0,"lat":26.080366,"lng":119.30049,"imax":0,"sellPrice":23,"sellmin":0,"sell":true,"nm":"大众电影院","poiId":85262,"area":"Gulou","ct":"","brdId":24985,"dealPrice":0,"referencePrice":50,"showCount":0,"id":1428,"follow":0},{"addr":"Gulou古田路83号（五一广场南侧原省体育馆）","brd":"其它","dis":"五一广场","deal":0,"distance":0,"preferential":0,"lat":26.0737,"lng":119.3081,"imax":0,"sellPrice":23,"sellmin":0,"sell":true,"nm":"福建大剧院","poiId":1439383,"area":"Gulou","ct":"","brdId":0,"dealPrice":0,"referencePrice":60,"showCount":0,"id":1425,"follow":0},{"addr":"Gulou五四路212号","brd":"福州大戏院","dis":"环球广场","deal":0,"distance":0,"preferential":0,"lat":26.097578,"lng":119.30597,"imax":0,"sellPrice":28,"sellmin":0,"sell":true,"nm":"福州大戏院","poiId":8195,"area":"Gulou","ct":"","brdId":854550,"dealPrice":0,"referencePrice":60,"showCount":0,"id":1430,"follow":0},{"addr":"Gulou五四路128号王府井百货6楼","brd":"横店电影城","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.091623,"lng":119.306,"imax":0,"sellPrice":24,"sellmin":0,"sell":true,"nm":"横店电影城(五四路店)","poiId":1552835,"area":"Gulou","ct":"","brdId":26045,"dealPrice":0,"referencePrice":25,"showCount":0,"id":5724,"follow":0},{"addr":"Gulou东街3号（近电信大厦）","brd":"其它","dis":"东街口","deal":0,"distance":0,"preferential":0,"lat":26.085804,"lng":119.30119,"imax":0,"sellPrice":23,"sellmin":0,"sell":true,"nm":"海峡影城","poiId":831948,"area":"Gulou","ct":"","brdId":0,"dealPrice":0,"referencePrice":60,"showCount":0,"id":1426,"follow":0},{"addr":"Gulou通湖路26号中福西湖花园5号（西湖公园对面）","brd":"西湖电影院","dis":"西湖","deal":0,"distance":0,"preferential":0,"lat":26.089577,"lng":119.2905,"imax":0,"sellPrice":23,"sellmin":0,"sell":true,"nm":"西湖影剧院","poiId":1421000,"area":"Gulou","ct":"","brdId":29539,"dealPrice":0,"referencePrice":90,"showCount":0,"id":1423,"follow":0},{"addr":"Gulou三坊七巷南后街中段（三坊七巷）","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.082548,"lng":119.29707,"imax":0,"sellPrice":33,"sellmin":0,"sell":true,"nm":"中瑞南华影城","poiId":4955035,"area":"Gulou","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13578,"follow":0},{"addr":"Gulou五四路320号省体育中心东门（省体育中心公交车站背后）","brd":"中瑞国际影城","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.111761,"lng":119.30543,"imax":0,"sellPrice":33,"sellmin":0,"sell":true,"nm":"中瑞万星国际影城(省体店)","poiId":5213881,"area":"Gulou","ct":"","brdId":30868,"dealPrice":0,"referencePrice":0,"showCount":0,"id":8809,"follow":0}],"Fuqing":[{"addr":"Fuqing融城西门元洪路福清国际商展中心一楼（好又多南门）","brd":"大地影院","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.719568,"lng":119.36881,"imax":0,"sellPrice":31,"sellmin":0,"sell":true,"nm":"大地影院(福清国际商展中心店)","poiId":2568743,"area":"Fuqing","ct":"","brdId":384262,"dealPrice":0,"referencePrice":0,"showCount":0,"id":8162,"follow":0},{"addr":"Fuqing高山镇海华世家沿街二层D7号楼（高山公园旁边）","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.471684,"lng":119.5677,"imax":0,"sellPrice":28,"sellmin":0,"sell":true,"nm":"高山弘盛电影城","poiId":5303077,"area":"Fuqing","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10124,"follow":0},{"addr":"Fuqing镇龙飞路与大真线交界融鼎新天地地产9号楼4层","brd":"金逸影城","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.605684,"lng":119.44813,"imax":0,"sellPrice":38,"sellmin":0,"sell":true,"nm":"金逸新天地影城(龙田店)","poiId":42554371,"area":"Fuqing","ct":"","brdId":1079568,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10799,"follow":0},{"addr":"Fuqing成龙步行街8号楼105-106室（八角塔新街１０米）","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.720276,"lng":119.38043,"imax":0,"sellPrice":28,"sellmin":0,"sell":true,"nm":"时代金典数字影城(福清店)","poiId":1439601,"area":"Fuqing","ct":"","brdId":0,"dealPrice":0,"referencePrice":30,"showCount":0,"id":1742,"follow":0},{"addr":"Fuqing高山镇海峡商品交易中心四楼","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.48119,"lng":119.558334,"imax":0,"sellPrice":28,"sellmin":0,"sell":true,"nm":"时代中兴影城(福清高山店)","poiId":5085546,"area":"Fuqing","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":12587,"follow":0},{"addr":"Fuqing清昌大道105号万达广场2号门4楼","brd":"万达影城","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.715199,"lng":119.34968,"imax":1,"sellPrice":30,"sellmin":0,"sell":true,"nm":"万达国际影城(福清店)","poiId":5343103,"area":"Fuqing","ct":"","brdId":102642,"dealPrice":0,"referencePrice":0,"showCount":0,"id":11077,"follow":0},{"addr":"Fuqing音西街道福和路九号裕荣汇四楼401号","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.721313,"lng":119.352104,"imax":0,"sellPrice":33,"sellmin":0,"sell":true,"nm":"中瑞影城(裕荣汇店)","poiId":4340507,"area":"Fuqing","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10936,"follow":0},{"addr":"Fuqing音西街道桥溪路1号综合楼（西圣公园旁，原永辉超市）","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.721958,"lng":119.375404,"imax":0,"sellPrice":30,"sellmin":0,"sell":false,"nm":"乐尚国际影城","poiId":2401546,"area":"Fuqing","ct":"","brdId":0,"dealPrice":0,"referencePrice":60,"showCount":0,"id":5370,"follow":0}],"Cangshan":[{"addr":"Cangshan林浦路世纪金源购物中心3楼（福州闽江世纪金源会展大饭店）","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.02298,"lng":119.35765,"imax":0,"sellPrice":29,"sellmin":0,"sell":true,"nm":"春天国际影城(福州金源店)","poiId":99939253,"area":"Cangshan","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16142,"follow":0},{"addr":"Cangshan建新大道路南侧盘屿路东侧奥体阳光天地广场2楼2019号","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.017876,"lng":119.27837,"imax":0,"sellPrice":33,"sellmin":0,"sell":true,"nm":"观者国际影城(奥体阳光店)","poiId":124173411,"area":"Cangshan","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16609,"follow":0},{"addr":"Cangshan首山路49号首山新都汇购物中心5楼","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.030949,"lng":119.31434,"imax":0,"sellPrice":33,"sellmin":0,"sell":true,"nm":"观者国际影城(首山店)","poiId":61670279,"area":"Cangshan","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13719,"follow":0},{"addr":"Cangshan浦上大道爱琴海购物公园7层（仓山万达附近）","brd":"太平洋电影城","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.041862,"lng":119.27929,"imax":0,"sellPrice":35,"sellmin":0,"sell":true,"nm":"红星太平洋电影城","poiId":5235166,"area":"Cangshan","ct":"","brdId":28975,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13639,"follow":0},{"addr":"Cangshan城门镇新天宇广场4楼","brd":"金逸影城","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.992088,"lng":119.368355,"imax":0,"sellPrice":18.5,"sel lmin":0,"sell":true,"nm":"金逸影城(城门新天宇店)","poiId":1577154,"area":"Cangshan","ct":"","brdId":1079568,"dealPrice":0,"referencePrice":0,"showCount":0,"id":7777,"follow":0},{"addr":"Cangshan浦上大道万达广场A座4F（近金洲南路）","brd":"万达影城","dis":"金山万达","deal":0,"distance":0,"preferential":0,"lat":26.03596,"lng":119.275024,"imax":1,"sellPrice":40,"sellmin":0,"sell":true,"nm":"万达国际影城(仓山店)","poiId":1481043,"area":"Cangshan","ct":"","brdId":102642,"dealPrice":0,"referencePrice":70,"showCount":0,"id":1414,"follow":0},{"addr":"Cangshan则徐大道379号沃尔玛一楼（三盛实业公交站旁）","brd":"中瑞国际影城","dis":"白湖亭","deal":0,"distance":0,"preferential":0,"lat":26.0277,"lng":119.334915,"imax":0,"sellPrice":33,"sellmin":0,"sell":true,"nm":"中瑞大地影城(仓山店)","poiId":2426379,"area":"Cangshan","ct":"","brdId":30868,"dealPrice":0,"referencePrice":70,"showCount":0,"id":7120,"follow":0}],"Taijiang":[{"addr":"Taijiang工业路193号宝龙城市广场5楼（万象城对面）","brd":"金逸影城","dis":"宝龙城市广场","deal":0,"distance":0,"preferential":0,"lat":26.06234,"lng":119.291145,"imax":1,"sellPrice":33.5,"sellmin":0,"sell":true,"nm":"金逸影城(宝龙IMAX店)","poiId":1439384,"area":"Taijiang","ct":"","brdId":1079568,"dealPrice":0,"referencePrice":75,"showCount":0,"id":1427,"follow":0},{"addr":"Taijiang鳌峰路金融街广场4楼（近曙光路）","brd":"万达影城","dis":"台江万达","deal":0,"distance":0,"preferential":0,"lat":26.053156,"lng":119.34377,"imax":1,"sellPrice":37,"sellmin":0,"sell":true,"nm":"万达国际影城(金融街店)","poiId":1481054,"area":"Taijiang","ct":"","brdId":102642,"dealPrice":0,"referencePrice":35,"showCount":0,"id":1422,"follow":0},{"addr":"Taijiang广达路168号世茂百货负一楼（2号入口，近八一七路）","brd":"万达影城","dis":"茶亭公园","deal":0,"distance":0,"preferential":0,"lat":26.06628,"lng":119.30731,"imax":0,"sellPrice":23,"sellmin":0,"sell":true,"nm":"万达国际影城(世茂店)","poiId":1126443,"area":"Taijiang","ct":"","brdId":102642,"dealPrice":0,"referencePrice":70,"showCount":0,"id":1420,"follow":0},{"addr":"Taijiang工业路三迪广场红星美凯龙7层（宝龙城市广场）","brd":"中瑞国际影城","dis":"城市广场","deal":0,"distance":0,"preferential":0,"lat":26.061438,"lng":119.29444,"imax":0,"sellPrice":25,"sellmin":0,"sell":true,"nm":"中瑞国际影城","poiId":87149,"area":"Taijiang","ct":"","brdId":30868,"dealPrice":0,"referencePrice":70,"showCount":0,"id":1419,"follow":0},{"addr":"Taijiang仓霞路13号（解放大桥北桥边青年会广场）","brd":"中兴主题影院","dis":"中亭街","deal":0,"distance":0,"preferential":0,"lat":26.050314,"lng":119.310326,"imax":0,"sellPrice":23,"sellmin":0,"sell":true,"nm":"中兴主题影院","poiId":3296073,"area":"Taijiang","ct":"","brdId":30885,"dealPrice":0,"referencePrice":60,"showCount":0,"id":2239,"follow":0},{"addr":"Taijiang台江路95号东百元洪城5楼","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.05219,"lng":119.31628,"imax":0,"sellPrice":23,"sellmin":0,"sell":true,"nm":"中影星汇电影城","poiId":118418892,"area":"Taijiang","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16606,"follow":0}],"Jinan":[{"addr":"Jinan塔头路与连江路交汇处东二环泰禾广场6层岳峰镇竹屿路6号东二环泰禾广场6-7层","brd":"CGV影城","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.092588,"lng":119.33257,"imax":1,"sellPrice":34,"sellmin":0,"sell":true,"nm":"CGV星聚汇影城(东二环店)","poiId":2435825,"area":"Jinan","ct":"","brdId":2020418,"dealPrice":0,"referencePrice":0,"showCount":0,"id":6568,"follow":0},{"addr":"Jinan福马路638号和谐大酒店内8号楼1楼","brd":"东都影城","dis":"远洋路","deal":0,"distance":0,"preferential":0,"lat":26.070076,"lng":119.36038,"imax":0,"sellPrice":23,"sellmin":0,"sell":true,"nm":"东都国际影城","poiId":20445,"area":"Jinan","ct":"","brdId":133085,"dealPrice":0,"referencePrice":70,"showCount":0,"id":1421,"follow":0},{"addr":"Jinan福新中路90号星华商场负一层","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.081684,"lng":119.32549,"imax":0,"sellPrice":23,"sellmin":0,"sell":true,"nm":"华彩中兴影城","poiId":52421216,"area":"Jinan","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13567,"follow":0},{"addr":"Jinan长乐北路157号（紫阳商贸中心）大润发超市5层","brd":"金逸影城","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.07984,"lng":119.32728,"imax":0,"sellPrice":28.5,"sellmin":0,"sell":true,"nm":"金逸影城(紫阳巨幕店)","poiId":5414334,"area":"Jinan","ct":"","brdId":1079568,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10207,"follow":0},{"addr":"Jinan长乐中路世欧广场4楼","brd":"星美国际影城","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.07118,"lng":119.32664,"imax":1,"sellPrice":32,"sellmin":0,"sell":true,"nm":"星美国际影城(王庄店)","poiId":5498269,"area":"Jinan","ct":"","brdId":30032,"dealPrice":0,"referencePrice":0,"showCount":0,"id":7443,"follow":0},{"addr":"Jinan五四北泰禾广场6层","brd":"中影国际影城","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.139162,"lng":119.3255,"imax":0,"sellPrice":36,"sellmin":0,"sell":true,"nm":"中影国际影城(泰禾店)","poiId":2368983,"area":"Jinan","ct":"","brdId":23745,"dealPrice":0,"referencePrice":0,"showCount":0,"id":7686,"follow":0}],"Changle":[{"addr":"Changle十洋商务广场3楼东侧3-7号铺面","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.958017,"lng":119.51508,"imax":0,"sellPrice":10.9,"sellmin":0,"sell":true,"nm":"春天国际影城(长乐十洋店)","poiId":125292326,"area":"Changle","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16666,"follow":0},{"addr":"Changle广场路长山湖购物广场4楼（近豪生大酒店）","brd":"大地影院","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.956053,"lng":119.50002,"imax":0,"sellPrice":24,"sellmin":0,"sell":true,"nm":"大地影院(广场路店)","poiId":831640,"area":"Changle","ct":"","brdId":384262,"dealPrice":0,"referencePrice":35,"showCount":0,"id":1918,"follow":0},{"addr":"Changle吴航路555号恒申悦城4楼","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.954372,"lng":119.50204,"imax":0,"sellPrice":20,"sellmin":0,"sell":true,"nm":"长乐CC影城(金逸悦城店)","poiId":41938745,"area":"Changle","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13176,"follow":0},{"addr":"Changle航城街道广场南路888号永荣广场四楼","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.942268,"lng":119.494804,"imax":1,"sellPrice":18,"sellmin":0,"sell":true,"nm":"长乐CC影城(永荣IMAX店)","poiId":110691403,"area":"Changle","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16593,"follow":0},{"addr":"Changle胪峰大道好莱钨百货商场2楼","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.976603,"lng":119.6259,"imax":0,"sellPrice":28,"sellmin":0,"sell":true,"nm":"中影UL城市影院","poiId":41447612,"area":"Changle","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13031,"follow":0}],"Minhou":[{"addr":"Minhou上街镇国宾大道268号永嘉天地4楼","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.070139,"lng":119.20085,"imax":0,"sellPrice":20,"sellmin":0,"sell":true,"nm":"春天国际影城(福州大学城店)","poiId":119564559,"area":"Minhou","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16490,"follow":0},{"addr":"Minhou甘蔗街道世茂滨江2号商业楼3F","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.136173,"lng":119.15067,"imax":0,"sellPrice":33,"sellmin":0,"sell":true,"nm":"星秀国际影城","poiId":62278904,"area":"Minhou","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13689,"follow":0},{"addr":"Minhou博仕后广场B区3楼","brd":"燕林国际影城","dis":"大学城永辉","deal":0,"distance":0,"preferential":0,"lat":26.066898,"lng":119.20184,"imax":0,"sellPrice":23,"sellmin":0,"sell":true,"nm":"燕林国际影城(大学城店)","poiId":1458152,"area":"Minhou","ct":"","brdId":30168,"dealPrice":0,"referencePrice":60,"showCount":0,"id":1418,"follow":0},{"addr":"Minhou乌龙江大道与浦上大道交汇处正荣财富广场四楼电话：4000125000","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.017912,"lng":119.21825,"imax":0,"sellPrice":33,"sellmin":0,"sell":true,"nm":"中瑞国际影城(正荣财富中心大学城店)","poiId":111002477,"area":"Minhou","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16332,"follow":0}],"Luoyuan":[{"addr":"Luoyuan滨海新城世纪金源购物中心三层","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.470856,"lng":119.594604,"imax":0,"sellPrice":28,"sellmin":0,"sell":true,"nm":"罗源M&M国际影城","poiId":61791494,"area":"Luoyuan","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13604,"follow":0},{"addr":"Luoyuan凤山镇东外路16号东方新城商业楼F3号","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.48646,"lng":119.56745,"imax":0,"sellPrice":28,"sellmin":0,"sell":true,"nm":"罗源东方国际影城","poiId":138954019,"area":"Luoyuan","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16610,"follow":0},{"addr":"Luoyuan凤山镇长桥路7号","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.485628,"lng":119.547714,"imax":0,"sellPrice":23,"sellmin":0,"sell":true,"nm":"罗源智泉国际影城","poiId":114566114,"area":"Luoyuan","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16521,"follow":0}],"Lianjiang":[{"addr":"Lianjiang玉荷西路231号（县体育场东侧）","brd":"金字塔国际影城","dis":"连江","deal":0,"distance":0,"preferential":0,"lat":26.194391,"lng":119.53338,"imax":0,"sellPrice":23,"sellmin":0,"sell":true,"nm":"金字塔影城(玉荷西路店)","poiId":1499269,"area":"Lianjiang","ct":"","brdId":1062982,"dealPrice":0,"referencePrice":60,"showCount":0,"id":2290,"follow":0},{"addr":"Lianjiang马祖路与敖江路交汇处龙芝国际商业广场3楼","brd":"其它","dis":"Lianjiang","deal":0,"distance":0,"preferential":0,"lat":26.2118,"lng":119.5425,"imax":0,"sellPrice":23,"sellmin":0,"sell":true,"nm":"鑫凤凰电影院","poiId":2364685,"area":"Lianjiang","ct":"","brdId":0,"dealPrice":0,"referencePrice":70,"showCount":0,"id":2710,"follow":0},{"addr":"Lianjiang凤城镇马祖西路10号万家城市广场","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.209703,"lng":119.533394,"imax":0,"sellPrice":33,"sellmin":0,"sell":true,"nm":"中影星美国际影城(连江店)","poiId":41623576,"area":"Lianjiang","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":10956,"follow":0}],"Mawei":[{"addr":"Mawei君竹路37号西提丽府10号2层26号至42号店面","brd":"金逸影城","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.987404,"lng":119.45517,"imax":0,"sellPrice":36,"sellmin":0,"sell":true,"nm":"金逸院线西提电影城(西提店)","poiId":1561134,"area":"Mawei","ct":"","brdId":1079568,"dealPrice":0,"referencePrice":70,"showCount":0,"id":5112,"follow":0},{"addr":"Mawei宗棠路泊悦府名城广场5楼","brd":"幸福蓝海国际影城","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.017672,"lng":119.39874,"imax":1,"sellPrice":19,"sellmin":0,"sell":true,"nm":"幸福蓝海(福州名城IMAX店)","poiId":118454772,"area":"Mawei","ct":"","brdId":30053,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16558,"follow":0},{"addr":"Mawei马江园区罗星路西北侧马尾中环广场4楼","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.993088,"lng":119.46573,"imax":0,"sellPrice":0,"sellmin":0,"sell":false,"nm":"中瑞国际影城(马尾店)","poiId":159263240,"area":"Mawei","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":23706,"follow":0}],"Minqing":[{"addr":"Minqing梅城镇梅溪南路1号百荣新天地6#商业综合体四层","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.2176,"lng":118.85636,"imax":0,"sellPrice":38,"sellmin":0,"sell":true,"nm":"百荣国际影城","poiId":118655333,"area":"Minqing","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":16592,"follow":0},{"addr":"Minqing西门街乃裳广场内","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":26.2209,"lng":118.86334,"imax":0,"sellPrice":28,"sellmin":0,"sell":true,"nm":"Minqing3D影城","poiId":51265991,"area":"Minqing","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13444,"follow":0}],"Yongtai":[{"addr":"Yongtai城峰镇刘岐村立塘68号冠景天地广场四楼","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.851336,"lng":118.932686,"imax":0,"sellPrice":30,"sellmin":0,"sell":true,"nm":"冠景影城","poiId":50259145,"area":"Yongtai","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":13245,"follow":0}],"Pingtan":[{"addr":"Pingtan西航路海坛名街","brd":"其它","dis":"","deal":0,"distance":0,"preferential":0,"lat":25.488195,"lng":119.79465,"imax":0,"sellPrice":39,"sellmin":0,"sell":true,"nm":"西航国际影城","poiId":2437365,"area":"Pingtan","ct":"","brdId":0,"dealPrice":0,"referencePrice":0,"showCount":0,"id":8913,"follow":0}]}
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
         * expires : 43200
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
        private List<GulouBean> Gulou;
        private List<FuqingBean> Fuqing;
        private List<CangshanBean> Cangshan;
        private List<TaijiangBean> Taijiang;
        private List<JinanBean> Jinan;
        private List<ChangleBean> Changle;
        private List<MinhouBean> Minhou;
        private List<LuoyuanBean> Luoyuan;
        private List<LianjiangBean> Lianjiang;
        private List<MaweiBean> Mawei;
        private List<MinqingBean> Minqing;
        private List<YongtaiBean> Yongtai;
        private List<PingtanBean> Pingtan;

        public List<GulouBean> getGulou() {
            return Gulou;
        }

        public void setGulou(List<GulouBean> Gulou) {
            this.Gulou = Gulou;
        }

        public List<FuqingBean> getFuqing() {
            return Fuqing;
        }

        public void setFuqing(List<FuqingBean> Fuqing) {
            this.Fuqing = Fuqing;
        }

        public List<CangshanBean> getCangshan() {
            return Cangshan;
        }

        public void setCangshan(List<CangshanBean> Cangshan) {
            this.Cangshan = Cangshan;
        }

        public List<TaijiangBean> getTaijiang() {
            return Taijiang;
        }

        public void setTaijiang(List<TaijiangBean> Taijiang) {
            this.Taijiang = Taijiang;
        }

        public List<JinanBean> getJinan() {
            return Jinan;
        }

        public void setJinan(List<JinanBean> Jinan) {
            this.Jinan = Jinan;
        }

        public List<ChangleBean> getChangle() {
            return Changle;
        }

        public void setChangle(List<ChangleBean> Changle) {
            this.Changle = Changle;
        }

        public List<MinhouBean> getMinhou() {
            return Minhou;
        }

        public void setMinhou(List<MinhouBean> Minhou) {
            this.Minhou = Minhou;
        }

        public List<LuoyuanBean> getLuoyuan() {
            return Luoyuan;
        }

        public void setLuoyuan(List<LuoyuanBean> Luoyuan) {
            this.Luoyuan = Luoyuan;
        }

        public List<LianjiangBean> getLianjiang() {
            return Lianjiang;
        }

        public void setLianjiang(List<LianjiangBean> Lianjiang) {
            this.Lianjiang = Lianjiang;
        }

        public List<MaweiBean> getMawei() {
            return Mawei;
        }

        public void setMawei(List<MaweiBean> Mawei) {
            this.Mawei = Mawei;
        }

        public List<MinqingBean> getMinqing() {
            return Minqing;
        }

        public void setMinqing(List<MinqingBean> Minqing) {
            this.Minqing = Minqing;
        }

        public List<YongtaiBean> getYongtai() {
            return Yongtai;
        }

        public void setYongtai(List<YongtaiBean> Yongtai) {
            this.Yongtai = Yongtai;
        }

        public List<PingtanBean> getPingtan() {
            return Pingtan;
        }

        public void setPingtan(List<PingtanBean> Pingtan) {
            this.Pingtan = Pingtan;
        }

        public static class GulouBean {
            /**
             * addr : Gulou八一七北路192号
             * brd : 大众电影院
             * dis : 道山路口
             * deal : 0
             * distance : 0
             * preferential : 0
             * lat : 26.080366
             * lng : 119.30049
             * imax : 0
             * sellPrice : 23.0
             * sellmin : 0
             * sell : true
             * nm : 大众电影院
             * poiId : 85262
             * area : Gulou
             * ct :
             * brdId : 24985
             * dealPrice : 0.0
             * referencePrice : 50.0
             * showCount : 0
             * id : 1428
             * follow : 0
             */

            private String addr;
            private String brd;
            private String dis;
            private int deal;
            private int distance;
            private int preferential;
            private double lat;
            private double lng;
            private int imax;
            private double sellPrice;
            private int sellmin;
            private boolean sell;
            private String nm;
            private int poiId;
            private String area;
            private String ct;
            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int id;
            private int follow;

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }
        }

        public static class FuqingBean {
            /**
             * addr : Fuqing融城西门元洪路福清国际商展中心一楼（好又多南门）
             * brd : 大地影院
             * dis :
             * deal : 0
             * distance : 0
             * preferential : 0
             * lat : 25.719568
             * lng : 119.36881
             * imax : 0
             * sellPrice : 31.0
             * sellmin : 0
             * sell : true
             * nm : 大地影院(福清国际商展中心店)
             * poiId : 2568743
             * area : Fuqing
             * ct :
             * brdId : 384262
             * dealPrice : 0.0
             * referencePrice : 0.0
             * showCount : 0
             * id : 8162
             * follow : 0
             */

            private String addr;
            private String brd;
            private String dis;
            private int deal;
            private int distance;
            private int preferential;
            private double lat;
            private double lng;
            private int imax;
            private double sellPrice;
            private int sellmin;
            private boolean sell;
            private String nm;
            private int poiId;
            private String area;
            private String ct;
            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int id;
            private int follow;

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }
        }

        public static class CangshanBean {
            /**
             * addr : Cangshan林浦路世纪金源购物中心3楼（福州闽江世纪金源会展大饭店）
             * brd : 其它
             * dis :
             * deal : 0
             * distance : 0
             * preferential : 0
             * lat : 26.02298
             * lng : 119.35765
             * imax : 0
             * sellPrice : 29.0
             * sellmin : 0
             * sell : true
             * nm : 春天国际影城(福州金源店)
             * poiId : 99939253
             * area : Cangshan
             * ct :
             * brdId : 0
             * dealPrice : 0.0
             * referencePrice : 0.0
             * showCount : 0
             * id : 16142
             * follow : 0
             * sel lmin : 0
             */

            private String addr;
            private String brd;
            private String dis;
            private int deal;
            private int distance;
            private int preferential;
            private double lat;
            private double lng;
            private int imax;
            private double sellPrice;
            private int sellmin;
            private boolean sell;
            private String nm;
            private int poiId;
            private String area;
            private String ct;
            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int id;
            private int follow;
            @SerializedName("sel lmin")
            private int _$SelLmin263; // FIXME check this code

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }

            public int get_$SelLmin263() {
                return _$SelLmin263;
            }

            public void set_$SelLmin263(int _$SelLmin263) {
                this._$SelLmin263 = _$SelLmin263;
            }
        }

        public static class TaijiangBean {
            /**
             * addr : Taijiang工业路193号宝龙城市广场5楼（万象城对面）
             * brd : 金逸影城
             * dis : 宝龙城市广场
             * deal : 0
             * distance : 0
             * preferential : 0
             * lat : 26.06234
             * lng : 119.291145
             * imax : 1
             * sellPrice : 33.5
             * sellmin : 0
             * sell : true
             * nm : 金逸影城(宝龙IMAX店)
             * poiId : 1439384
             * area : Taijiang
             * ct :
             * brdId : 1079568
             * dealPrice : 0.0
             * referencePrice : 75.0
             * showCount : 0
             * id : 1427
             * follow : 0
             */

            private String addr;
            private String brd;
            private String dis;
            private int deal;
            private int distance;
            private int preferential;
            private double lat;
            private double lng;
            private int imax;
            private double sellPrice;
            private int sellmin;
            private boolean sell;
            private String nm;
            private int poiId;
            private String area;
            private String ct;
            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int id;
            private int follow;

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }
        }

        public static class JinanBean {
            /**
             * addr : Jinan塔头路与连江路交汇处东二环泰禾广场6层岳峰镇竹屿路6号东二环泰禾广场6-7层
             * brd : CGV影城
             * dis :
             * deal : 0
             * distance : 0
             * preferential : 0
             * lat : 26.092588
             * lng : 119.33257
             * imax : 1
             * sellPrice : 34.0
             * sellmin : 0
             * sell : true
             * nm : CGV星聚汇影城(东二环店)
             * poiId : 2435825
             * area : Jinan
             * ct :
             * brdId : 2020418
             * dealPrice : 0.0
             * referencePrice : 0.0
             * showCount : 0
             * id : 6568
             * follow : 0
             */

            private String addr;
            private String brd;
            private String dis;
            private int deal;
            private int distance;
            private int preferential;
            private double lat;
            private double lng;
            private int imax;
            private double sellPrice;
            private int sellmin;
            private boolean sell;
            private String nm;
            private int poiId;
            private String area;
            private String ct;
            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int id;
            private int follow;

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }
        }

        public static class ChangleBean {
            /**
             * addr : Changle十洋商务广场3楼东侧3-7号铺面
             * brd : 其它
             * dis :
             * deal : 0
             * distance : 0
             * preferential : 0
             * lat : 25.958017
             * lng : 119.51508
             * imax : 0
             * sellPrice : 10.9
             * sellmin : 0
             * sell : true
             * nm : 春天国际影城(长乐十洋店)
             * poiId : 125292326
             * area : Changle
             * ct :
             * brdId : 0
             * dealPrice : 0.0
             * referencePrice : 0.0
             * showCount : 0
             * id : 16666
             * follow : 0
             */

            private String addr;
            private String brd;
            private String dis;
            private int deal;
            private int distance;
            private int preferential;
            private double lat;
            private double lng;
            private int imax;
            private double sellPrice;
            private int sellmin;
            private boolean sell;
            private String nm;
            private int poiId;
            private String area;
            private String ct;
            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int id;
            private int follow;

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }
        }

        public static class MinhouBean {
            /**
             * addr : Minhou上街镇国宾大道268号永嘉天地4楼
             * brd : 其它
             * dis :
             * deal : 0
             * distance : 0
             * preferential : 0
             * lat : 26.070139
             * lng : 119.20085
             * imax : 0
             * sellPrice : 20.0
             * sellmin : 0
             * sell : true
             * nm : 春天国际影城(福州大学城店)
             * poiId : 119564559
             * area : Minhou
             * ct :
             * brdId : 0
             * dealPrice : 0.0
             * referencePrice : 0.0
             * showCount : 0
             * id : 16490
             * follow : 0
             */

            private String addr;
            private String brd;
            private String dis;
            private int deal;
            private int distance;
            private int preferential;
            private double lat;
            private double lng;
            private int imax;
            private double sellPrice;
            private int sellmin;
            private boolean sell;
            private String nm;
            private int poiId;
            private String area;
            private String ct;
            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int id;
            private int follow;

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }
        }

        public static class LuoyuanBean {
            /**
             * addr : Luoyuan滨海新城世纪金源购物中心三层
             * brd : 其它
             * dis :
             * deal : 0
             * distance : 0
             * preferential : 0
             * lat : 26.470856
             * lng : 119.594604
             * imax : 0
             * sellPrice : 28.0
             * sellmin : 0
             * sell : true
             * nm : 罗源M&M国际影城
             * poiId : 61791494
             * area : Luoyuan
             * ct :
             * brdId : 0
             * dealPrice : 0.0
             * referencePrice : 0.0
             * showCount : 0
             * id : 13604
             * follow : 0
             */

            private String addr;
            private String brd;
            private String dis;
            private int deal;
            private int distance;
            private int preferential;
            private double lat;
            private double lng;
            private int imax;
            private double sellPrice;
            private int sellmin;
            private boolean sell;
            private String nm;
            private int poiId;
            private String area;
            private String ct;
            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int id;
            private int follow;

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }
        }

        public static class LianjiangBean {
            /**
             * addr : Lianjiang玉荷西路231号（县体育场东侧）
             * brd : 金字塔国际影城
             * dis : 连江
             * deal : 0
             * distance : 0
             * preferential : 0
             * lat : 26.194391
             * lng : 119.53338
             * imax : 0
             * sellPrice : 23.0
             * sellmin : 0
             * sell : true
             * nm : 金字塔影城(玉荷西路店)
             * poiId : 1499269
             * area : Lianjiang
             * ct :
             * brdId : 1062982
             * dealPrice : 0.0
             * referencePrice : 60.0
             * showCount : 0
             * id : 2290
             * follow : 0
             */

            private String addr;
            private String brd;
            private String dis;
            private int deal;
            private int distance;
            private int preferential;
            private double lat;
            private double lng;
            private int imax;
            private double sellPrice;
            private int sellmin;
            private boolean sell;
            private String nm;
            private int poiId;
            private String area;
            private String ct;
            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int id;
            private int follow;

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }
        }

        public static class MaweiBean {
            /**
             * addr : Mawei君竹路37号西提丽府10号2层26号至42号店面
             * brd : 金逸影城
             * dis :
             * deal : 0
             * distance : 0
             * preferential : 0
             * lat : 25.987404
             * lng : 119.45517
             * imax : 0
             * sellPrice : 36.0
             * sellmin : 0
             * sell : true
             * nm : 金逸院线西提电影城(西提店)
             * poiId : 1561134
             * area : Mawei
             * ct :
             * brdId : 1079568
             * dealPrice : 0.0
             * referencePrice : 70.0
             * showCount : 0
             * id : 5112
             * follow : 0
             */

            private String addr;
            private String brd;
            private String dis;
            private int deal;
            private int distance;
            private int preferential;
            private double lat;
            private double lng;
            private int imax;
            private double sellPrice;
            private int sellmin;
            private boolean sell;
            private String nm;
            private int poiId;
            private String area;
            private String ct;
            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int id;
            private int follow;

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }
        }

        public static class MinqingBean {
            /**
             * addr : Minqing梅城镇梅溪南路1号百荣新天地6#商业综合体四层
             * brd : 其它
             * dis :
             * deal : 0
             * distance : 0
             * preferential : 0
             * lat : 26.2176
             * lng : 118.85636
             * imax : 0
             * sellPrice : 38.0
             * sellmin : 0
             * sell : true
             * nm : 百荣国际影城
             * poiId : 118655333
             * area : Minqing
             * ct :
             * brdId : 0
             * dealPrice : 0.0
             * referencePrice : 0.0
             * showCount : 0
             * id : 16592
             * follow : 0
             */

            private String addr;
            private String brd;
            private String dis;
            private int deal;
            private int distance;
            private int preferential;
            private double lat;
            private double lng;
            private int imax;
            private double sellPrice;
            private int sellmin;
            private boolean sell;
            private String nm;
            private int poiId;
            private String area;
            private String ct;
            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int id;
            private int follow;

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }
        }

        public static class YongtaiBean {
            /**
             * addr : Yongtai城峰镇刘岐村立塘68号冠景天地广场四楼
             * brd : 其它
             * dis :
             * deal : 0
             * distance : 0
             * preferential : 0
             * lat : 25.851336
             * lng : 118.932686
             * imax : 0
             * sellPrice : 30.0
             * sellmin : 0
             * sell : true
             * nm : 冠景影城
             * poiId : 50259145
             * area : Yongtai
             * ct :
             * brdId : 0
             * dealPrice : 0.0
             * referencePrice : 0.0
             * showCount : 0
             * id : 13245
             * follow : 0
             */

            private String addr;
            private String brd;
            private String dis;
            private int deal;
            private int distance;
            private int preferential;
            private double lat;
            private double lng;
            private int imax;
            private double sellPrice;
            private int sellmin;
            private boolean sell;
            private String nm;
            private int poiId;
            private String area;
            private String ct;
            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int id;
            private int follow;

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }
        }

        public static class PingtanBean {
            /**
             * addr : Pingtan西航路海坛名街
             * brd : 其它
             * dis :
             * deal : 0
             * distance : 0
             * preferential : 0
             * lat : 25.488195
             * lng : 119.79465
             * imax : 0
             * sellPrice : 39.0
             * sellmin : 0
             * sell : true
             * nm : 西航国际影城
             * poiId : 2437365
             * area : Pingtan
             * ct :
             * brdId : 0
             * dealPrice : 0.0
             * referencePrice : 0.0
             * showCount : 0
             * id : 8913
             * follow : 0
             */

            private String addr;
            private String brd;
            private String dis;
            private int deal;
            private int distance;
            private int preferential;
            private double lat;
            private double lng;
            private int imax;
            private double sellPrice;
            private int sellmin;
            private boolean sell;
            private String nm;
            private int poiId;
            private String area;
            private String ct;
            private int brdId;
            private double dealPrice;
            private double referencePrice;
            private int showCount;
            private int id;
            private int follow;

            public String getAddr() {
                return addr;
            }

            public void setAddr(String addr) {
                this.addr = addr;
            }

            public String getBrd() {
                return brd;
            }

            public void setBrd(String brd) {
                this.brd = brd;
            }

            public String getDis() {
                return dis;
            }

            public void setDis(String dis) {
                this.dis = dis;
            }

            public int getDeal() {
                return deal;
            }

            public void setDeal(int deal) {
                this.deal = deal;
            }

            public int getDistance() {
                return distance;
            }

            public void setDistance(int distance) {
                this.distance = distance;
            }

            public int getPreferential() {
                return preferential;
            }

            public void setPreferential(int preferential) {
                this.preferential = preferential;
            }

            public double getLat() {
                return lat;
            }

            public void setLat(double lat) {
                this.lat = lat;
            }

            public double getLng() {
                return lng;
            }

            public void setLng(double lng) {
                this.lng = lng;
            }

            public int getImax() {
                return imax;
            }

            public void setImax(int imax) {
                this.imax = imax;
            }

            public double getSellPrice() {
                return sellPrice;
            }

            public void setSellPrice(double sellPrice) {
                this.sellPrice = sellPrice;
            }

            public int getSellmin() {
                return sellmin;
            }

            public void setSellmin(int sellmin) {
                this.sellmin = sellmin;
            }

            public boolean isSell() {
                return sell;
            }

            public void setSell(boolean sell) {
                this.sell = sell;
            }

            public String getNm() {
                return nm;
            }

            public void setNm(String nm) {
                this.nm = nm;
            }

            public int getPoiId() {
                return poiId;
            }

            public void setPoiId(int poiId) {
                this.poiId = poiId;
            }

            public String getArea() {
                return area;
            }

            public void setArea(String area) {
                this.area = area;
            }

            public String getCt() {
                return ct;
            }

            public void setCt(String ct) {
                this.ct = ct;
            }

            public int getBrdId() {
                return brdId;
            }

            public void setBrdId(int brdId) {
                this.brdId = brdId;
            }

            public double getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(double dealPrice) {
                this.dealPrice = dealPrice;
            }

            public double getReferencePrice() {
                return referencePrice;
            }

            public void setReferencePrice(double referencePrice) {
                this.referencePrice = referencePrice;
            }

            public int getShowCount() {
                return showCount;
            }

            public void setShowCount(int showCount) {
                this.showCount = showCount;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public int getFollow() {
                return follow;
            }

            public void setFollow(int follow) {
                this.follow = follow;
            }
        }
    }
}
