package com.coolweather.android.db;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Created by L on 2018/4/4.
 */
@Entity
public class Province {
    @Id(autoincrement = true)
    private Long id;
    //省的名字
    private String provinceName;
    //省的代号
    private int provinceCode;
    @Generated(hash = 1695957187)
    public Province(Long id, String provinceName, int provinceCode) {
        this.id = id;
        this.provinceName = provinceName;
        this.provinceCode = provinceCode;
    }
    @Generated(hash = 1309009906)
    public Province() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getProvinceName() {
        return this.provinceName;
    }
    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
    public int getProvinceCode() {
        return this.provinceCode;
    }
    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

//    @Generated(hash = 1695957187)
//    public Province(Long id, String provinceName, int provinceCode) {
//        this.id = id;
//        this.provinceName = provinceName;
//        this.provinceCode = provinceCode;
//    }
//
//    @Generated(hash = 1309009906)
//    public Province() {
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
//    public String getProvinceName() {
//        return this.provinceName;
//    }
//
//    public void setProvinceName(String provinceName) {
//        this.provinceName = provinceName;
//    }
//
//    public int getProvinceCode() {
//        return this.provinceCode;
//    }
//
//    public void setProvinceCode(int provinceCode) {
//        this.provinceCode = provinceCode;
//    }


}
