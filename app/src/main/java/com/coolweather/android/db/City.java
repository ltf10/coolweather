package com.coolweather.android.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by L on 2018/4/4.
 */
@Entity
public class City {
    @Id(autoincrement = true)
    private Long id;
    //市的名字
    private String cityName;
    //市的代号
    private int cityCode;
    //当前市所属省的id值
    private Long provinceId;
//
//
//    public City(Long id, String cityName, int cityCode, Long provinceId) {
//        this.id = id;
//        this.cityName = cityName;
//        this.cityCode = cityCode;
//        this.provinceId = provinceId;
//    }
//
//
//    public City() {
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
//    public String getCityName() {
//        return this.cityName;
//    }
//
//    public void setCityName(String cityName) {
//        this.cityName = cityName;
//    }
//
//    public int getCityCode() {
//        return this.cityCode;
//    }
//
//    public void setCityCode(int cityCode) {
//        this.cityCode = cityCode;
//    }
//
//    public Long getProvinceId() {
//        return this.provinceId;
//    }
//
//    public void setProvinceId(Long provinceId) {
//        this.provinceId = provinceId;
//    }
    @Generated(hash = 1424285030)
    public City(Long id, String cityName, int cityCode, Long provinceId) {
        this.id = id;
        this.cityName = cityName;
        this.cityCode = cityCode;
        this.provinceId = provinceId;
    }
    @Generated(hash = 750791287)
    public City() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getCityName() {
        return this.cityName;
    }
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
    public int getCityCode() {
        return this.cityCode;
    }
    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }
    public Long getProvinceId() {
        return this.provinceId;
    }
    public void setProvinceId(Long provinceId) {
        this.provinceId = provinceId;
    }


}
