package com.coolweather.android.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by L on 2018/4/4.
 */
@Entity
public class County {
    @Id(autoincrement = true)
    private Long id;
    //县的名字
    private String countyName;
    //对应的天气id
    private String weatherId;
    //当前县所属市的id
    private Long cityId;
//
//
//    public County(Long id, String countyName, String weatherId, Long cityId) {
//        this.id = id;
//        this.countyName = countyName;
//        this.weatherId = weatherId;
//        this.cityId = cityId;
//    }
//
//
//    public County() {
//    }
//
//    public Long getId() {
//        return this.id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getCountyName() {
//        return this.countyName;
//    }
//
//    public void setCountyName(String countyName) {
//        this.countyName = countyName;
//    }
//
//    public String getWeatherId() {
//        return this.weatherId;
//    }
//
//    public void setWeatherId(String weatherId) {
//        this.weatherId = weatherId;
//    }
//
//    public Long getCityId() {
//        return this.cityId;
//    }
//
//    public void setCityId(Long cityId) {
//        this.cityId = cityId;
//    }
    @Generated(hash = 1429542598)
    public County(Long id, String countyName, String weatherId, Long cityId) {
        this.id = id;
        this.countyName = countyName;
        this.weatherId = weatherId;
        this.cityId = cityId;
    }
    @Generated(hash = 1991272252)
    public County() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCountyName() {
        return this.countyName;
    }
    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }
    public String getWeatherId() {
        return this.weatherId;
    }
    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
    public Long getCityId() {
        return this.cityId;
    }
    public void setCityId(Long cityId) {
        this.cityId = cityId;
    }


}
