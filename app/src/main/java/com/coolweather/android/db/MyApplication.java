package com.coolweather.android.db;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by L on 2018/4/10.
 */

public class MyApplication extends Application {

    private static DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        setupDataBase();
    }

    /**
     * 配置数据库
     */
    private void setupDataBase() {
        //创建数据库
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this,"Weather.db",null);
        //获取可写数据库
        SQLiteDatabase db = helper.getWritableDatabase();
        //获取数据库对象
        DaoMaster daoMaster = new DaoMaster(db);
        //获取Dao对象管理者
        mDaoSession = daoMaster.newSession();
    }

    public static DaoSession getDaoSession(){
        return mDaoSession;
    }

}
