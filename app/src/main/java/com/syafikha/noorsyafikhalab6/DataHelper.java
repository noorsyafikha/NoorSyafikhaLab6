package com.syafikha.noorsyafikhalab6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.provider.ContactsContract;
import android.util.Log;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Acer on 10/26/2017.
 */

public class DataHelper extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="personalbiodata.db";
    private static final int DATABASE_VERSION=1;

    public DataHelper (Context context)
    {
        super(context,DATABASE_NAME,null,DATABASE_VERSION);

    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql="create table biodata (no integer primary key, name text null," +
                " dobtext null, gender text null, address text null);" ;
        Log.d("Data","onCreate: "+sql);
        db.execSQL(sql);
    }
    public void onUpgrade(SQLiteDatabase arg0, int arg1, int arg2)
    {

    }
}
