package com.coolweather.android.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by L on 2018/4/8.
 */

public class MyDatabaseHelper extends SQLiteOpenHelper {

    public static final String CREATE_PROVINCE = "create table Province ("
            + "id integer primary key autoincrement, "
            + "provinceName text, "
            + "provinceCode integer)";

    public static final String CREATE_CITY = "create table City ("
            + "id integer primary key autoincrement, "
            + "cityName text, "
            + "provinceId integer, "
            + "cityCode integer)";

    public static final String CREATE_COUNTY = "create table County ("
            + "id integer primary key autoincrement, "
            + "countyName text, "
            + "cityId integer, "
            + "weatherId integer)";

    private Context mContext;

    public MyDatabaseHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
        mContext = context;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_PROVINCE);
        db.execSQL(CREATE_CITY);
        db.execSQL(CREATE_COUNTY);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
